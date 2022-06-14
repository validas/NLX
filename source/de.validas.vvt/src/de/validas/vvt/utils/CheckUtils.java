package de.validas.vvt.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import de.validas.vvt.Artifact;
import de.validas.vvt.Check;
import de.validas.vvt.CheckResult;
import de.validas.vvt.CheckStatus;
import de.validas.vvt.Described;
import de.validas.vvt.Instance;
import de.validas.vvt.Issue;
import de.validas.vvt.Parameter;
import de.validas.vvt.ParameterValue;
import de.validas.vvt.Person;
import de.validas.vvt.Project;
import de.validas.vvt.Severity;
import de.validas.vvt.VvtFactory;
import de.validas.vvt.VvtPackage;
import de.validas.vvt.impl.VvtFactoryImpl;

/**
 * Utilities for Checks, e.g. export /import to Excel
 * @author slotosch
 *
 */
public class CheckUtils {

	private static final String EXPLAIN = "Explain: ";
	private static final String DATE = "Date: ";
	private static final String ISSUES = "Issues: ";
	private static final String RESULT = "Result: ";
	private static final String NOT_APPLICABLE = "Not Applicable";
	private static final String ARTIFACT_DESCRIPTIONS = "Artifact Description";
	private static final String CHECK_DESCRIPTIONS = "Check Description";
	private static final String PARAMETER_DESCRIPTIONS = "Parameter Description";
	private static final String ISSUE_DESCRIPTIONS = "Issue Description";
	private static final String OVERVIEW = "Overview";

	/** if this is true only the checked artifacts are exported (description) */
	private static boolean bExportOnlyCheckedArtifacts = true;

	private static VvtFactory factory = new VvtFactoryImpl();
		
	/** returns the order of the table, i.e. Overview, CheckRessults*/
	public static List<String> getTabOrder() {
		List<String> lOrder = new LinkedList<String>();
		lOrder.add(OVERVIEW);
		lOrder.add(PARAMETER_DESCRIPTIONS);
		lOrder.add(ARTIFACT_DESCRIPTIONS);
		lOrder.add(ISSUE_DESCRIPTIONS);
		lOrder.add(CHECK_DESCRIPTIONS);
		return lOrder;
	}
	/** returns all contained checks (and the inputs) that are not implicit. Note implicit checks are searched for explicit contained checks */
	public static List<Check> getAllContainedChecks(List<Check> lSelectedChecks) {
		return getAllContainedChecks(lSelectedChecks, false);
	}
	/** returns all contained checks (and the inputs) that are not implicit. Note implicit checks are searched for explicit contained checks */
	public static List<Check> getAllContainedChecks(List<Check> lSelectedChecks,boolean bWithImplicit) {
		List<Check> lAllChecks = new LinkedList<Check>(lSelectedChecks);
		for (Check c:lSelectedChecks) {
			if (bWithImplicit || !c.isImplicit()) {
				lAllChecks.add(c);
			}
			TreeIterator<EObject> it=c.eAllContents();
			while (it.hasNext()) {
				EObject eo=it.next();
				if (eo instanceof Check && (bWithImplicit || !((Check)eo).isImplicit())) {
					lAllChecks.add((Check)eo);
				}
			}
		}
		Collections.sort(lAllChecks, new DescribedComparator());
		return lAllChecks;
	}
	public static Map<String,List<List<String>>> exportToExcel(List<Check> lSelectedChecks) throws Exception {
		Map<String,List<List<String>>> mResult = new HashMap<String, List<List<String>>>();

		Project project = HierarchyModel.getProjectSuper(lSelectedChecks.get(0));
		List<Check> lAllChecks = getAllContainedChecks(lSelectedChecks);

		System.out.println("exporting "+lAllChecks.size()+" checks");
		// initialize tables (global constants)
		List<List<String>> lOverviewTab= checkOverview(lAllChecks);
		mResult.put(OVERVIEW,lOverviewTab);

		List<List<String>> lArtifactTab= checkedArtifacts(lAllChecks);
		mResult.put(ARTIFACT_DESCRIPTIONS,lArtifactTab);

		List<List<String>> lParameterTab= checkedParameters(lAllChecks);
		mResult.put(PARAMETER_DESCRIPTIONS,lParameterTab);

		List<List<String>> lDescriptionTab= checkedChecks(lAllChecks);
		mResult.put(CHECK_DESCRIPTIONS,lDescriptionTab);

		List<List<String>> lIssueTab= checkedIssues(project);
		mResult.put(ISSUE_DESCRIPTIONS,lIssueTab);

		// map of all Check results: name/key:"CR_Param1+Param2+..ParamN"
		Map<String,List<List<String>>> mCRs = new HashMap<String, List<List<String>>>();

		Map<Check,Integer> mColumns = new HashMap<Check, Integer>();
		// now check specific data
		for (Check c:lAllChecks) {
			if (c.isImplicit()) {
				continue;
			}
			String sTabName=getTabName(c);
			List<List<String>> lTab;
			if (!mCRs.containsKey(sTabName)) {
				List<List<String>> lNew=new LinkedList<List<String>>();
				mCRs.put(sTabName, lNew);
				mResult.put(sTabName, lNew);
				List<String> lHeader=new LinkedList<String>();
				lNew.add(lHeader);
				lHeader.add("Parameters");
			}
			lTab=mCRs.get(sTabName);
			List<String> lHeader=lTab.get(0);
			lHeader.add(RESULT+c.getName());
			mColumns.put(c,new Integer(lHeader.size()));
			// System.out.println("check "+c.getName()+" in columns "+lHeader.size());
			lHeader.add(DATE+c.getName());
			lHeader.add(ISSUES+c.getName());
			lHeader.add(EXPLAIN+c.getName());
			if (c.getParameters().size()==0) {
				if (lTab.size()==1) {
					List<String> l=new LinkedList<String>();
					l.add(NOT_APPLICABLE);
					lTab.add(l);
				}
			} else {
				List<String> lAllPs=new LinkedList<String>();
				for (List<ParameterValue> lPV:getAllRequiredCombinations(c.getParameters())) {
					String sPs=printListParamterValues(lPV);
					lAllPs.add(sPs);
				}
				Collections.sort(lAllPs);
				for (String sPs:lAllPs) {
					if (findRowForName(sPs, lTab)<0) {
						List<String> lP=new LinkedList<String>();
						lP.add(sPs);
						lTab.add(lP);
					}
				}
			}
		}
		for (Check c:lAllChecks) {
			if (c.isImplicit()) {
				continue;
			}
			int iPos=mColumns.get(c).intValue();
			String sTabName=getTabName(c);
			List<List<String>> lTab;
			lTab=mCRs.get(sTabName);
			for (CheckResult cr:c.getCheckResults()) {
				List<ParameterValue> lPVs=new LinkedList<ParameterValue>();
				for (Instance i:cr.getInstances()) {
					if (i.getParameterValue()!=null) {
						lPVs.add(i.getParameterValue());
					}
				}
				String sPName=printListParamterValues(lPVs);
				int iRow=findRowForName(sPName, lTab);
				if (iRow<0) {
					System.err.println("now row found for "+sPName);
				} else {
					List<String> lRow=lTab.get(iRow);
					while (lRow.size()<iPos+3) {
						lRow.add("");
					}
					lRow.set(iPos-1, ""+cr.getVerdict());
					String timeStamp = cr.getTimeStamp();
					// Only dates are processed no clock times / timezones will be processed!
					final Date date = dateformatter_SHORT_ENG.parse(timeStamp); 
					System.out.println("formated "+timeStamp+" to "+dateformatter_SHORT_ENG.format( date ));
					timeStamp = dateformatter_SHORT_ENG.format( date );
					lRow.set(iPos, ""+timeStamp);
					String sIssues="";
					for (Issue i:cr.getIssues()) {
						if (!sIssues.equals("")) {
							sIssues+=",";
						}
						if (i.getId()!=null && !i.getId().equals("")) {
							sIssues+=i.getId();
						} else {
							sIssues+=i.getName();
						}
					}
					lRow.set(iPos+1, sIssues);
					lRow.set(iPos+2, ""+cr.getJustification());
				}
			}
		}
		return mResult;
	}

	private static int findRowForName(String s, List<List<String>> lTab) {
		int i=-1;
		for (List<String> lRow:lTab) {
			i++;
			if (lRow.size()>0 && lRow.get(0).equals(s)) {
				return i;
			}
		}
		return -1;
	}
	/** prints the list of parameter values, including parameter name [p1=v1,P2=v2] */
	private static String printListParamterValues(List<ParameterValue> lPV) {
		if (lPV.size()==0) {
			return NOT_APPLICABLE;
		}
		Collections.sort(lPV, new Comparator<ParameterValue>() {
			@Override
			public int compare(ParameterValue arg0, ParameterValue arg1) {
				Parameter p0=(Parameter)arg0.eContainer();
				Parameter p1=(Parameter)arg1.eContainer();
				String s0=p0.getName();
				if (p0.getId()!=null && !p0.getId().trim().equals("")) {
					s0=p0.getId();
				}
				String s1=p0.getName();
				if (p1.getId()!=null && !p1.getId().trim().equals("")) {
					s1=p1.getId();
				}
				return s0.compareTo(s1);
			}
		});
		String sRes="";
		for (ParameterValue pv:lPV) {
			if (!sRes.equals("")) {
				sRes+=",";
			}
			Parameter p=(Parameter)pv.eContainer();
			sRes+=p.getName()+"="+pv.getValue();
		}
		return sRes;
	}

	/** returns all values that have to be instantiated (not the required combinations) */
	public static Set<ParameterValue> getAllRequiredParameterValues(Check c) {
		Set<ParameterValue> sRes=new HashSet<ParameterValue>();
		for (Parameter p:c.getParameters()) {
			sRes.addAll(p.getParameterValues());
		}
		return sRes;
	}
	public static Set<List<ParameterValue>> getAllRequiredCombinations(Check c) {
		return getAllRequiredCombinations(c.getParameters());
	}
	public static Set<List<ParameterValue>> getAllRequiredCombinations(List<Parameter> lParams) {
		List<Parameter> lSorted=new LinkedList<Parameter>(lParams);
		return getAllRequiredCombinationsHelper(lSorted, new HashSet<List<ParameterValue>>());
	}
	private static Set<List<ParameterValue>> getAllRequiredCombinationsHelper(List<Parameter> lParams,Set<List<ParameterValue>> sFound) {
		if (lParams.size()==0) {
			return sFound;
		}
		List<Parameter> lPRest = new LinkedList<Parameter>(lParams);
		Parameter pFirst=lPRest.remove(0);
		Set<List<ParameterValue>> sFoundNew=new HashSet<List<ParameterValue>>();
		for (ParameterValue pv:pFirst.getParameterValues()) {
			if (sFound.size()==0) {
				List<ParameterValue> lNew=new LinkedList<ParameterValue>();
				lNew.add(pv);
				sFoundNew.add(lNew);
			} else {
				for (List<ParameterValue> lPV:sFound) {
					List<ParameterValue> l2=new LinkedList<ParameterValue>();
					l2.addAll(lPV);
					l2.add(pv);
					sFoundNew.add(l2);
				}
			}
		}
		return getAllRequiredCombinationsHelper(lPRest, sFoundNew);
	}
	private static List<List<String>> checkedArtifacts(List<Check> lSelectedChecks) {
		List<List<String>> lTab=new LinkedList<List<String>>();
		List<String> lHeader=new LinkedList<String>();
		lTab.add(lHeader);
		lHeader.add("Artifact");
		lHeader.add("ID");
		lHeader.add("Revision");
		lHeader.add("Modified");
		lHeader.add("Path");
		lHeader.add("Description");
		lHeader.add("LongDescription");
		lHeader.add("Comment");
		lHeader.add("Developers");
		Set<Artifact> allArtifacts = HierarchyModel.getAllCheckedArtifacts(lSelectedChecks);
		Set<Artifact> allRequiredArtifacts = HierarchyModel.getAllRequiredArtifacts(lSelectedChecks);
		System.out.println("adding "+allRequiredArtifacts.size()+" required artifacts");
		if (bExportOnlyCheckedArtifacts==false) {
			allArtifacts.addAll(allRequiredArtifacts);
		} else {
			allArtifacts.addAll(HierarchyModel.getAllCheckedArtifacts(lSelectedChecks));
		}
		List<Artifact> lAll = new LinkedList<Artifact>(allArtifacts);
		Collections.sort(lAll,new DescribedComparator(true));
		System.out.println("exporting "+allArtifacts.size()+" artifacts");
		for (Artifact a:lAll) {
			List<String> lRow=new LinkedList<String>();
			lTab.add(lRow);
			addToRow(lRow, a.getName());
			addToRow(lRow, a.getId());
			addToRow(lRow, a.getRevision());
			addToRow(lRow, a.getModified());
			addToRow(lRow, a.getPath());
			addToRow(lRow, a.getDescription());
			addToRow(lRow, a.getLongDescription());
			addToRow(lRow, a.getComment());
			addToRow(lRow, a.getDevleopers());
		}
		return lTab;
	}

	private static List<List<String>> checkedParameters(List<Check> lChecks) {
		List<List<String>> lTab=new LinkedList<List<String>>();
		List<String> lHeader=new LinkedList<String>();
		lTab.add(lHeader);
		lHeader.add("Parameter");
		lHeader.add("ID");
		lHeader.add("Description");
		lHeader.add("LongDescription");
		lHeader.add("Comment");
		lHeader.add("Values");
		for (Parameter a:HierarchyModel.getAllRelevantParameters(lChecks)) {
			List<String> lRow=new LinkedList<String>();
			lTab.add(lRow);
			addToRow(lRow, a.getName());
			addToRow(lRow, a.getId());
			addToRow(lRow, a.getDescription());
			addToRow(lRow, a.getLongDescription());
			addToRow(lRow, a.getComment());
			addToRow(lRow, a.getParameterValues());
		}
		return lTab;
	}

	private static List<List<String>> checkedIssues(Project project) {
		List<List<String>> lTab=new LinkedList<List<String>>();
		List<String> lHeader=new LinkedList<String>();
		lTab.add(lHeader);
		lHeader.add("Issue");
		lHeader.add("ID");
		lHeader.add("Description");
		lHeader.add("LongDescription");
		lHeader.add("Comment");
		lHeader.add("Link");
		lHeader.add("Severity");
		lHeader.add("Workaround");
		lHeader.add("Artifact");
		lHeader.add("FoundInVersionOrDate");
		lHeader.add("FixedInVersionOrDate");
		for (Issue i:IssueUtils.getAllIssues(project)) {
			List<String> lRow=new LinkedList<String>();
			lTab.add(lRow);
			addToRow(lRow, i.getName());
			addToRow(lRow, i.getId());
			addToRow(lRow, i.getDescription());
			addToRow(lRow, i.getLongDescription());
			addToRow(lRow, i.getComment());
			addToRow(lRow, i.getLink());
			addToRow(lRow, i.getSeverity().getName());
			addToRow(lRow, i.getWorkaround());
			if (i.getArtifact()!=null) {
				addToRow(lRow, i.getArtifact().getName());
			} else {
				addToRow(lRow, "");
			}
			addToRow(lRow, i.getFoundInRevisionOrDate());
			addToRow(lRow, i.getFixedInRevisionOrDate());
		}
		return lTab;
	}

	private static List<List<String>> checkedChecks(List<Check> lChecks) {
		List<List<String>> lTab=new LinkedList<List<String>>();
		List<String> lHeader=new LinkedList<String>();
		lTab.add(lHeader);
		lHeader.add("Check");
		lHeader.add("ID");
		lHeader.add("Implicit");
		lHeader.add("Checked Artifact");
		lHeader.add("Authors");
		lHeader.add("Description");
		lHeader.add("LongDescription");
		lHeader.add("Comment");
		lHeader.add("Verdict");
		lHeader.add("Parameters");
		for (Check a:lChecks) {
			List<String> lRow=new LinkedList<String>();
			lTab.add(lRow);
			addToRow(lRow, a.getName());
			addToRow(lRow, a.getId());
			addToRow(lRow, ""+a.isImplicit());
			if (a.getCheckedArtifact()!=null) {
				addToRow(lRow, a.getCheckedArtifact().getName());
			} else {
				lRow.add("");
			}
			String sAuthors="";
			for (Person p:a.getAuthor()) {
				if (sAuthors.equals("")) {
					sAuthors+=", ";
				}
				if (p.getFullName()!=null && !(p.getFullName().trim().equals(""))) {
					sAuthors+=p.getFullName();
				}
			} 
			addToRow(lRow, sAuthors);
			addToRow(lRow, a.getDescription());
			addToRow(lRow, a.getLongDescription());
			addToRow(lRow, a.getComment());
			addToRow(lRow, a.getVerdict());
			String sParam="";
			for (Parameter p:a.getParameters()) {
				if (!sParam.equals("")) {
					sParam+=",";
				}
				sParam+=p.getName();
			}
			addToRow(lRow, sParam);
		}
		return lTab;
	}
	private static void addToRow(List<String> lVals, Object sVal) {
		if (sVal==null || sVal.toString().trim().equals("")) {
			lVals.add("");
		} else if (sVal instanceof CheckStatus) {
			lVals.add(((CheckStatus)sVal).name());
		} else if (sVal instanceof EList<?>) {
			String s="";
			for (Object o:((EList<?>)sVal)) {
				if (!s.equals("")) {
					s+=",";
				}
				if (o instanceof Described) {
					s+=((Described)o).getName();
				} else if (o instanceof ParameterValue) {
					s+=((ParameterValue)o).getValue();
				} else {
					s+=o.toString();
				}
			}
			s="["+s+"]";
			lVals.add(s);
		} else {
			lVals.add(sVal.toString());
		}
	}
	/** computes the table name name/key:"CR_Param1+Param2+..ParamN" */
	private static String getTabName(Check c) {
		List<Parameter> lParams = c.getParameters();
		if (lParams.size()==0) {
			return "CR__NONE";
		}
		Collections.sort(lParams, new DescribedComparator(true));
		String sResult="";
		for (Parameter p:lParams) {
			if (!sResult.equals("")) {
				sResult+="+";
			}
			sResult+=p.getName();
		}
		return "CR_"+sResult;
	}

	/**
	 * generates the header, i.e.
	 * TITLE Check Results for X Checks in <Project>
	 * CONTENTS Check descriptions and results for <Project>
	 * FILE-FORMAT CR-Table Version 1.0
	 *
	 * STATUS Draft / Presented / Released: Draft
	 * HISTORY (Date, Change, Autor)
	 *
	 */
	private static List<List<String>> checkOverview(List<Check> lChecks) {
		final List<List<String>> lines = new ArrayList<List<String>>();
		lines.add(new LinkedList<String>()); // empty line (for rotating nothing)
		final List<String> lTitle = new LinkedList<String>();
		lines.add(lTitle);
		lTitle.add("TITLE"); //$NON-NLS-1$
		String sProjectName = HierarchyModel.getProjectSuper(lChecks.get(0)).getName();
		lTitle.add("Check Results for " + lChecks.size()+" Checks in "+sProjectName); 
		final List<String> lContents = new LinkedList<String>();
		lines.add(lContents);
		lContents.add("CONTENTS"); //$NON-NLS-1$
		lContents.add("Check descriptions and results for " + sProjectName); //$NON-NLS-1$

		final List<String> lFormat = new LinkedList<String>();
		lines.add(lFormat);
		lFormat.add("FILE_FORMAT"); //$NON-NLS-1$
		String tcaversion = "CR-Table Version 1.0  (PMT Protoype 11/2018)"; //$NON-NLS-1$
		lFormat.add(tcaversion);

		lines.add(new LinkedList<String>());

		final List<String> lStatus = new LinkedList<String>();
		lines.add(lStatus);
		lStatus.add("STATUS (Generated/Filled/Final):"); //$NON-NLS-1$
		lStatus.add("Generated"); //$NON-NLS-1$
		lines.add(new LinkedList<String>());
		final LinkedList<String> lDate = new LinkedList<String>();
		lDate.add("ARTIFACT");
		lDate.add("CHECKED DATE or VERSION");
		lDate.add("PATH");
		lines.add(lDate);
		for (final Artifact a:HierarchyModel.getAllCheckedArtifacts(lChecks)) {
			final LinkedList<String> lArt = new LinkedList<String>();
			lArt.add(a.getName());
			if (a.getRevision()!=null && !a.getRevision().trim().equals("")) {
				lArt.add(a.getRevision());
			} else if (a.getModified()!=null && !a.getModified().toString().trim().equals("")) {
				lArt.add(a.getModified().toString());
			} else {
				lArt.add("");
			}
			lArt.add(a.getPath());
			lines.add(lArt);
		}
		lines.add(new LinkedList<String>());
		final LinkedList<String> lRoles = new LinkedList<String>();
		lRoles.add("ROLE");
		lRoles.add("NAME");
		lines.add(lRoles);
		for (final Person a:HierarchyModel.getAllResponsiblePersons(lChecks)) {
			final LinkedList<String> lRole = new LinkedList<String>();
			lRole.add(a.getName());
			lRole.add(a.getFullName());
			lines.add(lRole);
		}
		lines.add(new LinkedList<String>());

		final List<String> lHistory = new LinkedList<String>();
		lines.add(lHistory);
		lHistory.add("HISTORY (Date, Change, Autor)"); //$NON-NLS-1$
		final List<String> lGenerated = new LinkedList<String>();
		lines.add(lGenerated);
		final String sUser = System.getenv("username"); //$NON-NLS-1$
		final String sDate = getToday();
		lGenerated.add(sDate);
		lGenerated.add("Generated from VVT-Model of " + sProjectName);
		lGenerated.add(sUser);
		return lines;
	}
	public static String getToday() {
		final Date datNow = new Date();
		final SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd"); //$NON-NLS-1$
		final String sDate = sd.format(datNow);
		return sDate;
	}
	public static String getNow() {
		final Date datNow = new Date();
		final SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss"); //$NON-NLS-1$
		final String sDate = sd.format(datNow);
		return sDate;
	}


	public static int importCheckResults(List<Check> lChecks, String sFileName,Map<String, List<List<String>>> neu, List<String> logs) {
		int iNewElements=0;

		List<Check> lAllChecks = getAllContainedChecks(lChecks);

		Project project=HierarchyModel.getProjectSuper(lChecks.get(0));

		Map<String,String> mChekedArtifactDates = new HashMap<String, String>();	
		Set<Artifact> allArtifacts = HierarchyModel.getAllCheckedArtifacts(lAllChecks);
		allArtifacts.addAll(HierarchyModel.getAllRequiredArtifacts(lAllChecks));
		Map<String,Artifact> mArtifactByName = new HashMap<String, Artifact>();
		for (Artifact a:allArtifacts) {
			mArtifactByName.put(a.getName(),a);
		}
		Map<CheckResult,String> mCheckResultArtifactNames = new HashMap<CheckResult, String>();	
		List<String> lOrderdTabKeys=new LinkedList<String>();
		lOrderdTabKeys.addAll(getTabOrder());
		for (String sTab:neu.keySet()) {
			if (!lOrderdTabKeys.contains(sTab)) {
				lOrderdTabKeys.add(sTab);
			}
		}
		Person pVerifier=null;
		for (String sTab:lOrderdTabKeys) {
			if (sTab.equals(OVERVIEW)) {
				logs.add("importing checked artifact dates from tab "+OVERVIEW);
				List<List<String>> lTab = neu.get(sTab);
				int posArtifacts=findRowForName("ARTIFACT", lTab);
				int posRole=findRowForName("ROLE", lTab);
				if (posArtifacts<0) {
					logs.add("no Keyword ARTIFACT found in overview table");
				} else if (posRole<posArtifacts) {
					logs.add("no Keyword ROLE found in overview table after keyword ARTIFACT");
				} else {
					int pos=posArtifacts+1;
					while (pos<posRole) {
						List<String> lRow=lTab.get(pos);
						if (lRow.size()>1 && lRow.get(0)!=null && !lRow.get(0).trim().equals("") && lRow.get(1)!=null) {
							mChekedArtifactDates.put(lRow.get(0), lRow.get(1));
							logs.add(lRow.get(0) +": "+lRow.get(1));
						}
						pos++;
					}
				}
				int posHistory = findRowForName("HISTORY (Date, Change, Autor)", lTab);
				if (posHistory<posRole) {
					logs.add("no Keyword 'HISTORY (Date, Change, Autor)' found in overview table after keyword ROLE");
				} else {
					int pos=posRole+1;
					while (pos<posHistory) {
						List<String> lRow=lTab.get(pos);
						logs.add("importing persons from "+lRow);
						if (lRow.size()>1 && lRow.get(0)!=null && !lRow.get(0).trim().equals("") && lRow.get(1)!=null && !lRow.get(1).trim().equals("") ) {
							logs.add(lRow.get(0) +": "+lRow.get(1));
							Person p=findPerson(project,lRow.get(0));
							if (p==null) {
								logs.add("Cannot assign "+lRow.get(1)+" to unknown person "+lRow.get(0));
								logs.add("Creating new person "+lRow.get(0));
								p=factory.createPerson();
								p.setName(lRow.get(0));
								p.setFullName(lRow.get(1));
								project.getPersons().add(p);
							} else {
								// check if there is another name assigned to it 
								if (p.getFullName()==null || p.getFullName().trim().equals("")) {
									p.setFullName(lRow.get(1));
									logs.add("Setting FullName of "+lRow.get(0)+" to "+lRow.get(1));
								} else {
									if (!p.getFullName().equals(lRow.get(1))) {
										logs.add("Cannot overwrite name of "+lRow.get(0)+" from "+p.getFullName()+" to "+lRow.get(1)+" Creating copy of "+lRow.get(0));
										Person p2=EcoreUtil.copy(p);
										p2.setFullName(lRow.get(1));
										project.getPersons().add(p2);
										p=p2;
									}
								}
							}
							// now set the verifier
							if (p.getName().toLowerCase().startsWith("verifier")) {
								pVerifier=p;
							}
						}
						pos++;
					}
				}
			} else if (sTab.equals(ARTIFACT_DESCRIPTIONS)) {
				logs.add("importing artifact dates/revisions from tab "+ARTIFACT_DESCRIPTIONS);
				List<List<String>> lTab = neu.get(sTab);
				int pos=1;
				while (lTab.size()>pos) {
					List<String> lRow=lTab.get(pos);
					logs.add("reading artifact row:"+lRow);
					if (lRow.size()>2 && lRow.get(0)!=null && !lRow.get(0).trim().equals("") && lRow.get(2)!=null && !lRow.get(2).trim().equals("")) {
						if (!mArtifactByName.containsKey(lRow.get(0))) {
							logs.add("Artifact "+lRow.get(0)+" not found in verified by selected checks");
						} else {
							Artifact a=mArtifactByName.get(lRow.get(0));
							logs.add("Artifact "+lRow.get(0)+" set Revision: "+lRow.get(2));
							a.setRevision(lRow.get(2));
						}
					}
					if (lRow.size()>3 && lRow.get(0)!=null && !lRow.get(0).trim().equals("") && lRow.get(3)!=null && !lRow.get(3).trim().equals("")) {
						if (!mArtifactByName.containsKey(lRow.get(0))) {
							logs.add("Artifact "+lRow.get(0)+" not found in verified by selected checks");
						} else {
							Artifact a=mArtifactByName.get(lRow.get(0));
							logs.add("Artifact "+lRow.get(0)+" set Modified: "+lRow.get(3));
							a.setModified(lRow.get(3));
						}
					}
					pos++;
				}
			} else if (sTab.equals(ISSUE_DESCRIPTIONS)) {
				logs.add("importing issue from tab "+ISSUE_DESCRIPTIONS);
				List<List<String>> lTab = neu.get(sTab);
				int pos=1;
				while (lTab.size()>pos) {
					List<String> lRow=lTab.get(pos);
					logs.add("reading issue row:"+lRow);
					String sName=""; if (lRow.size()>0) {sName=lRow.get(0);}
					String sID=""; if (lRow.size()>1) {sID=lRow.get(1);}
					String sDescription=""; if (lRow.size()>2) {sDescription=lRow.get(2);}
					String sLongDescription=""; if (lRow.size()>3) {sLongDescription=lRow.get(3);}
					String sComment=""; if (lRow.size()>4) {sComment=lRow.get(4);}
					String sLink=""; if (lRow.size()>5) {sLink=lRow.get(5);}
					String sSevertiy=""; if (lRow.size()>6) {sSevertiy=lRow.get(6);}
					String sWorkaround=""; if (lRow.size()>7) {sWorkaround=lRow.get(7);}
					String sArtifact=""; if (lRow.size()>8) {sArtifact=lRow.get(8);}
					String sFoundInVersionOrDate=""; if (lRow.size()>9) {sFoundInVersionOrDate=lRow.get(9);}
					String sFixedInVersionOrDate=""; if (lRow.size()>10) {sFixedInVersionOrDate=lRow.get(10);}
					Issue iFound=findOrCreateIssue(project,sName,sID, logs);
					if (!sDescription.equals(iFound.getDescription())) {
						iFound.setDescription(sDescription);
						logs.add("set issue description to '"+sDescription+"'.");
					}
					if (!sLongDescription.equals(iFound.getLongDescription())) {
						iFound.setLongDescription(sLongDescription);
						logs.add("set issue long description to '"+sLongDescription+"'.");
					}
					if (!sComment.equals(iFound.getComment())) {
						iFound.setComment(sComment);
						logs.add("set issue comment to '"+sComment+"'.");
					}
					if (!sLink.equals(iFound.getLink())) {
						iFound.setLink(sLink);
						logs.add("set issue link to '"+sLink+"'.");
					}
					if (!sSevertiy.equalsIgnoreCase(iFound.getSeverity().name())) {
						try {
							Severity severity = Severity.valueOf(sSevertiy);
							iFound.setSeverity(severity);
							logs.add("set issue severity to '"+sSevertiy+"'.");
						} catch(Exception ex) {
							logs.add("ERROR: could not parse severity from '"+sSevertiy+"'"+ex.getMessage());
							logs.add("allowed severities are:"+Severity.values());
						}
					}
					if (!sWorkaround.equals(iFound.getWorkaround())) {
						iFound.setWorkaround(sWorkaround);
						logs.add("set issue workaround to '"+sWorkaround+"'.");
					}
					if (!sArtifact.equals("")) {
						Artifact a=findOrCreateArtifact(project,sArtifact,logs);
						if (iFound.getArtifact()!=a) {
							if (iFound.getArtifact()!=null) {
								logs.add("Warning: changed Artifact of Issue "+iFound.getName()+" ["+iFound.getId()+"] from "
										+iFound.getArtifact().getName()+" to "+sArtifact);
							}
							iFound.setArtifact(a);
						}
					}
					if (!sFoundInVersionOrDate.equals(iFound.getFoundInRevisionOrDate())) {
						iFound.setFoundInRevisionOrDate(sFoundInVersionOrDate);
						logs.add("set issue found in version or date to '"+sFoundInVersionOrDate+"'.");
					}
					if (!sFixedInVersionOrDate.equals(iFound.getFixedInRevisionOrDate())) {
						iFound.setFixedInRevisionOrDate(sFixedInVersionOrDate);
						logs.add("set issue fixed in version or date to '"+sFixedInVersionOrDate+"'.");
					}
					pos++;
				}
			} else if (sTab.startsWith("CR_")) {
				logs.add("importing check results from "+sTab);
				List<List<String>> lTab = neu.get(sTab);
				if (lTab.size()==0) {
					logs.add("WARNING: Ignoring empty table "+sTab);
				} else {
					List<String> lHeader=lTab.get(0);
					int iHeaderPos=0;
					for (String sHead:lHeader) {
						if (iHeaderPos>0 && sHead.startsWith(RESULT)) {
							String sCheckName=sHead.substring(RESULT.length());
							Check c=findCheckForName(lAllChecks,sCheckName.trim());
							if (c==null) {
								logs.add("ERROR no check "+sCheckName+" found in selected check. Ignoring results");
							} else {
								int iRow=0;
								for (List<String> lRow:lTab) {
									try {
										if (iRow>0 && lRow.size()>0) {
											String sFirst=lRow.get(0);
											if (sFirst.equals(NOT_APPLICABLE)) {
												iNewElements+=addCheckResult(c, lRow, iHeaderPos, logs,null, sTab,mCheckResultArtifactNames, pVerifier);
											} else {
												List<ParameterValue> lPVFound=null;
												Set<List<ParameterValue>> allRequiredCombinations = getAllRequiredCombinations(c.getParameters());
												String sExplain="";
												for (List<ParameterValue> lPV:allRequiredCombinations) {
													String sPs=printListParamterValues(lPV);
													if (sPs.equalsIgnoreCase(sFirst)) {
														lPVFound=lPV;
													} else {
														if (sExplain.length()<80) {
															if(!sExplain.equals("")) {
																sExplain+=",";
															} 
															sExplain+="'"+sPs+"'";
														} else {
															sExplain+=".";
														}
													}
												}
												if (lPVFound==null) {
													if (c.getParameters().size()==1) {
														logs.add("Warning: no parameter value "+sFirst+" for parameter(s) "+ParameterUtils.printListParamters(c.getParameters())+" found for Check "+c.getName()+
																" checked "+allRequiredCombinations.size()+" values ("+sExplain+") for "+ParameterUtils.printListParamters(c.getParameters())+". In "+lRow);
														// add missing value and try again
														Parameter p=c.getParameters().get(0);
														ParameterValue pvNew = factory.createParameterValue();
														String sVal=sFirst;
														if (sVal.startsWith(p.getName()+"=")) {
															sVal=sVal.substring(p.getName().length()+1).trim();
														}
														pvNew.setValue(sVal);
														p.getParameterValues().add(pvNew);
														allRequiredCombinations = getAllRequiredCombinations(c.getParameters());
														for (List<ParameterValue> lPV:allRequiredCombinations) {
															String sPs=printListParamterValues(lPV);
															if (sPs.equalsIgnoreCase(sFirst)) {
																lPVFound=lPV;
															}
														}
														if (lPVFound!=null) {
															logs.add("Successfully added parameter value "+sVal+" to "+p.getName());
															iNewElements+=addCheckResult(c, lRow, iHeaderPos, logs,lPVFound,sTab,mCheckResultArtifactNames, pVerifier);
														} else {
															logs.add("could not add parameter value "+sVal+" correctly to "+p.getName());
														}
													} else {
														logs.add("Error: no parameter value "+sFirst+" for parameter(s) "+ParameterUtils.printListParamters(c.getParameters())+" found for Check "+c.getName()+
																" checked "+allRequiredCombinations.size()+" values ("+sExplain+") for "+ParameterUtils.printListParamters(c.getParameters())+". Ignoring "+lRow);
													}
												} else {
													iNewElements+=addCheckResult(c, lRow, iHeaderPos, logs,lPVFound,sTab,mCheckResultArtifactNames, pVerifier);
												}
											}
										}
										iRow++;
									} catch (Exception ex) {
										ex.printStackTrace();
										logs.add("Error: could not add results from "+lRow+" in tab "+sTab+". Please check format / ask Validas for Exception trace analysis");
									}
								}
							}
						}
						iHeaderPos++;
					}
				}
				iNewElements++;
			} else {
				logs.add("Skipping additional information in "+sTab);
			}
		}
		logs.add("Setting artifact dates (from Excel) into "+mChekedArtifactDates.keySet().size()+" artifacts");		
		for (String sArtifact:mChekedArtifactDates.keySet()) {
			Artifact a=findArtifact(project,sArtifact);
			if (a==null) {
				logs.add("Error cannot find artifact "+sArtifact+". Ignoring information found in tab "+OVERVIEW);
			} else {
				String sDate=mChekedArtifactDates.get(sArtifact);
				// check if it is a date
				Date date=parseDate(sDate);
				if (date!=null) {
					a.setModified(sDate);
					logs.add("setting (verified) date "+sDate+" to artifact "+sArtifact);
				} else {
					// otherwise set it as revision
					a.setRevision(sDate);
					logs.add("setting (verified) revision "+sDate+" to artifact "+sArtifact+" ('"+sDate+"'could not be parsed as a date)");
				}
			}
		}
		logs.add("Setting checked artifact dates in "+mCheckResultArtifactNames.keySet().size()+" check results");
		// set the dates for the checks
		for (CheckResult cr:mCheckResultArtifactNames.keySet()) {
			String sArtifactName = mCheckResultArtifactNames.get(cr);
			if (!mChekedArtifactDates.containsKey(sArtifactName)) {
				logs.add("Warning no checked date found for Artifact "+sArtifactName+" in check result of "+((Check)cr.eContainer()).getName());
			} else {
				String sDate = mChekedArtifactDates.get(sArtifactName);
				cr.setArtifactRevisionOrDate(sDate);
				logs.add("Set ArtifactRevisionOrData in "+sArtifactName+" in check result of "+((Check)cr.eContainer()).getName()+" to "+sDate);
			}
		}
		String comment = "";
		if (project.getComment()!=null) {
			comment=project.getComment()+"\n";
		}
		project.setComment(comment+getNow()+": Imported test results from "+sFileName);

		// Set dirty flag via undoable IdentityCommand
		final EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(project);
		final IdentityCommand command = new IdentityCommand("") {
			
			@Override
			public boolean canUndo() {
			    return false;
			}
			
		};
		command.setDescription("SaveFlag");
		// No redo / undo for changes which have been done before
		editingDomain.getCommandStack().flush();		
		editingDomain.getCommandStack().execute(command);

		return iNewElements;
	}

	private static Artifact findOrCreateArtifact(Project project, String sName, List<String> logs) {
		for (Artifact i:project.getArtifacts()) {
			if (sName.equals(i.getName())) {
				return i;
			}
		}
		Artifact iRes = factory.createArtifact();
		iRes.setName(sName);
		logs.add("imported new Artifact "+sName+" for Issue");
		return iRes;
	}
	private static Issue findOrCreateIssue(Project project, String sIdOrName,List<String> logs) {
		for (Issue i:project.getIssues()) {
			// System.out.println("checking issue "+i.getId());
			if (sIdOrName.equals(i.getId())) {
				return i;
			}
		}
		for (Issue i:project.getIssues()) {
			if (sIdOrName.equals(i.getName())) {
				return i;
			}
		}
		Issue iRes = factory.createIssue();
		iRes.setId(sIdOrName);
		iRes.setName("Issue number "+sIdOrName);
		logs.add("Warning: imported new UNDESCRIBED Issue '"+iRes.getName()+"' ["+sIdOrName+"]");
		project.getIssues().add(iRes);
		return iRes;
	}

	private static Issue findOrCreateIssue(Project project, String sName, String sID,List<String> logs) {
		if (sID!=null && !sID.trim().equals("")) {
			for (Issue i:project.getIssues()) {
				if (sID.equals(i.getId())) {
					return i;
				}
			}
		}
		if (sName!=null && !sName.trim().equals("")) {
			for (Issue i:project.getIssues()) {
				if (sName.equals(i.getName())) {
					return i;
				}
			}
		}
		Issue iRes = factory.createIssue();
		iRes.setName(sName);
		iRes.setId(sID);
		logs.add("imported new Issue "+sName+" ["+sID+"]");
		project.getIssues().add(iRes);
		return iRes;
	}
	private static Artifact findArtifact(Project project, String sArtifact) {
		for (Artifact a:project.getArtifacts()) {
			if (sArtifact.equals(a.getName())) {
				return a;
			}
		}
		return null;
	}
	private static Person findPerson(Project project, String string) {
		for (Person p:project.getPersons()) {
			if (p.getName().equals(string)) {
				return p;
			}
		}
		return null;
	}
	private static int addCheckResult(Check c,List<String> lRow, int iHeaderPos, List<String> logs, 
			List<ParameterValue> lPVFound, String sTabName, Map<CheckResult, String> mCheckResultArtifactNames,
			Person pVerifier) {
		int bCreatedNew=0;
		String sFoundResult=findRowValue(lRow,iHeaderPos);
		String sCheckName = c.getName();
		Project project = HierarchyModel.getProjectSuper(c);
		if (sFoundResult.equals("")) {
			logs.add("Warning no result found for "+sCheckName);
		} 
		String sFoundDate=findRowValue(lRow,iHeaderPos+1);
		if (sFoundDate.equals("")) {
			logs.add("Warning no date found for "+sCheckName);
		}
		Date dFoundDate=parseDate(sFoundDate);
		if (dFoundDate==null) {
			if (sFoundDate!=null && !sFoundDate.trim().equals("")) {
				System.out.println("could not parse date from "+sFoundDate+"="+parseDate(sFoundDate));
			}
			logs.add("Error invalid date "+sFoundDate+" found for "+sCheckName+" ignoring");
			return 0;
		}
		String sFoundIssues=findRowValue(lRow,iHeaderPos+2);
		String sFoundExplain=findRowValue(lRow,iHeaderPos+3);
		if (sFoundExplain.equals("")) {
			logs.add("Warning no explanation found for "+sCheckName);
		}
		if (!sFoundResult.equals("") || !sFoundDate.equals("") || !sFoundExplain.equals("")) {
			// now search for existing check (Parameters) with same date
			for (CheckResult cr:c.getCheckResults()) {
				if (hasNextCheckResult(cr)) {
					continue;
				}
				Date d=parseDate(cr.getTimeStamp());
				if (d==null) {
					logs.add("Error: no date found for existing result "+cr.getName()+" in check "+c.getName());
					continue;
				}
				boolean bFoundMatchingCheckResult=true;
				if (lPVFound!=null) {
					for (Instance i:cr.getInstances()) {
						if (!lPVFound.contains(i.getParameterValue())) {
							bFoundMatchingCheckResult=false;
						}
					}
					for (ParameterValue pv:lPVFound) {
						boolean bFound=false;
						for (Instance i:cr.getInstances()) {
							if (pv.equals(i.getParameterValue())) {
								bFound=true;
							}
						}
						if (!bFound) {
							bFoundMatchingCheckResult=false;
						}
					}
				}
				if (bFoundMatchingCheckResult) {
					if (dFoundDate.after(d)) {
						logs.add("adding newer ("+sFoundDate+">"+d+") result for "+sCheckName);
					} else if(dFoundDate.before(d)) {
						logs.add("warning: do not add OLDER ("+sFoundDate+"<"+d+") result for "+sCheckName);
						return 0;
					} else {
						logs.add("info: do not add result with same time step ("+sFoundDate+") again for "+sCheckName);
						return 0;
					}
				}
			}
			CheckResult crFound=factory.createCheckResult();
			if (c.getCheckedArtifact()!=null) {
				mCheckResultArtifactNames.put(crFound, c.getCheckedArtifact().getName());
			}
			bCreatedNew++;
			c.getCheckResults().add(crFound);
			crFound.setDescription("Check has been performed as described using Excel Sheet "+sTabName+".");
			logs.add("Creating new CheckResult for "+sCheckName+": "+sFoundResult+","+sFoundDate+","+sFoundExplain);
			if (lPVFound!=null) {
				sCheckName+=" "+printListParamterValues(lPVFound);
			}
			if (sFoundResult.equalsIgnoreCase("PASS") || sFoundResult.equalsIgnoreCase("PASSED") || sFoundResult.equalsIgnoreCase("TRUE") ||  sFoundResult.equalsIgnoreCase("OK") || sFoundResult.equalsIgnoreCase("YES")) {
				crFound.setVerdict(CheckStatus.PASSED);
				crFound.setName(sCheckName+" OK");
			} else if (sFoundResult.equalsIgnoreCase("FAIL") || sFoundResult.equalsIgnoreCase("FAILED") || sFoundResult.equalsIgnoreCase("FALSE") || sFoundResult.equalsIgnoreCase("NOK") || sFoundResult.equalsIgnoreCase("NO")) {
				crFound.setVerdict(CheckStatus.FAILED);
				crFound.setName(sCheckName+" NOK");
			} else if (sFoundResult.equalsIgnoreCase("ANALYZED")) {
				crFound.setVerdict(CheckStatus.ANALYZED);
				crFound.setName(sCheckName+" ANALYZED");
			} else if (sFoundResult.equalsIgnoreCase("ASSIGNED")) {
				crFound.setName(sCheckName+" TBD");
				crFound.setVerdict(CheckStatus.ASSIGNED);
			} else if (sFoundResult.equalsIgnoreCase("CREATED")) {
				crFound.setVerdict(CheckStatus.CREATED);
				crFound.setName(sCheckName+" TBD");
			} else {
				crFound.setVerdict(CheckStatus.CREATED);
				crFound.setName(sCheckName+" ??");
				logs.add("Warning found unknown check result "+sFoundResult+" expecting PASS/FAIL/CREATED/ANALYZED/ASSIGNED");
			}
			if (!sFoundDate.equals("")) {
				// OS: dates do not work (wrong dates parsed)
				// Date d=parseDate(sFoundDate);
				// crFound.setTimeStamp(d);
				crFound.setTimeStamp(sFoundDate);
			}
			// now import known bugs (create them if not existing)
			if (!sFoundIssues.equals("")) {
				while (!sFoundIssues.equals("")) {
					String sFirst=sFoundIssues;
					if (sFirst.indexOf(",")>0) {
						sFirst=sFirst.substring(0, sFirst.indexOf(",")).trim();
						sFoundIssues=sFoundIssues.substring(sFoundIssues.indexOf(",")+1).trim();
					} else {
						sFirst=sFoundIssues;
						sFoundIssues="";
					}
					// search for IDFs (first) and names
					Issue iFound=findOrCreateIssue(project, sFirst, logs);
					if (!crFound.getIssues().contains(iFound)) {
						logs.add("added issue "+iFound.getName()+" ["+iFound.getId()+"] to result");
						crFound.getIssues().add(iFound);
					}
				}
			}
			crFound.setJustification(sFoundExplain);
			if (lPVFound!=null) {
				// search for existing Instances or create them
				for (ParameterValue pv:lPVFound) {
					Instance iFound=null;
					for (Instance i:crFound.getInstances()) {
						if (i.getParameterValue()==pv) {
							iFound=i;
						}
					}
					if (iFound==null) {
						// search in Checks Instances
						for (Instance i:c.getInstances()) {
							if (i.getParameterValue()==pv) {
								iFound=i;
							}
						}
						if (iFound==null) {
							// create one
							iFound=factory.createInstance();
							iFound.setParameterValue(pv);
							iFound.setParameter((Parameter)pv.eContainer());
							c.getInstances().add(iFound);
							logs.add("Created Instance for parameter value "+pv.getValue()+" of "+iFound.getParameter().getName()+" in Check "+c.getName());
							bCreatedNew++;
						}
						crFound.getInstances().add(iFound);
					}
				}
			}
			if (pVerifier!=null) {
				crFound.setAuthor(pVerifier);
				if (!c.getAuthor().contains(pVerifier)) {
					c.getAuthor().add(pVerifier);
				}
			}
		} else {
			logs.add("Info: Ignoring empty check result for "+c.getName());
		}	
		return bCreatedNew;
	}

	private final static DateFormat dateformatter_SHORT_ENG = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ENGLISH);
	private static SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/mm/dd", Locale.ENGLISH);
	private static SimpleDateFormat dateFormatter2 = new SimpleDateFormat("mm/dd/yy", Locale.ENGLISH);
	private static SimpleDateFormat dateFormatter1 = new SimpleDateFormat("dd/mm/yyyy", Locale.GERMAN);
	private static SimpleDateFormat timeFormatter = new SimpleDateFormat("yyyy/mm/dd - HH:mm:ss", Locale.ENGLISH);

	private static SimpleDateFormat dfYear = new SimpleDateFormat("yyyy");
	
	public static Date parseDate(String sFoundDate) {
		try {
			dateFormatter.setLenient(false);
			Date dResult = dateFormatter.parse(sFoundDate);
			//			String sParsed = dateFormatter.format(dResult);
			//			System.out.println("1. parsed "+sParsed+" from "+sFoundDate);
			return dResult;
		} catch (Exception ex) {
			//			System.err.println("Could not parse date1 from "+sFoundDate+":"+ex.getMessage()+" with "+dateFormatter.toPattern());
		}
		try {
			dateFormatter1.setLenient(false);
			Date dResult = dateFormatter1.parse(sFoundDate);
			// OS: somehow dates like "1/31/19" get parsed here (see VP-118), therefore check the year :-/
			String year = dfYear.format(dResult);
			int iYear = new Integer(year).intValue();
			if (iYear>2000) {
				//				String sParsed = dateFormatter1.format(dResult);
				//				System.out.println("2. parsed "+sParsed+" from "+sFoundDate);
				return dResult;
			} else {
				System.out.println("strange year "+iYear);
			}
		} catch (Exception ex) {
			//			System.err.println("Could not parse date1 from "+sFoundDate+":"+ex.getMessage()+" with "+dateFormatter1.toPattern());
		}
		try {
			timeFormatter.setLenient(false);
			Date dResult = timeFormatter.parse(sFoundDate);
			//			String sParsed = timeFormatter.format(dResult);
			//			System.out.println("3. parsed "+sParsed+" from "+sFoundDate);
			return dResult;
		} catch (Exception ex) {
			//			System.err.println("Could not parse date2 from "+sFoundDate+":"+ex.getMessage()+" with "+timeFormatter.toPattern());
		}
		try {
			dateFormatter2.setLenient(false);
			Date dResult = dateFormatter2.parse(sFoundDate);
			//			String sParsed = dateFormatter2.format(dResult);
			//			System.out.println("4. parsed "+sParsed+" from "+sFoundDate);
			return dResult;
		} catch (Exception ex) {
			//			System.err.println("Could not parse date1 from "+sFoundDate+":"+ex.getMessage()+" with "+dateFormatter.toPattern());
			//			System.err.println("Could not parse date2 from "+sFoundDate+":"+ex.getMessage()+" with "+timeFormatter.toPattern());
			//			System.err.println("Could not parse date3 from "+sFoundDate+":"+ex.getMessage()+" with "+dateFormatter2.toPattern());
		}
		return null;
	}
	private static String findRowValue(List<String> lRow, int i) {
		if (lRow.size()<i+1) {
			return "";
		} 
		String sRes= lRow.get(i);
		if (sRes==null) {
			return "";
		}
		return sRes;
	}
	private static Check findCheckForName(List<Check> lAllChecks, String sName) {
		for (Check c:lAllChecks) {
			if (c.getName()!=null && c.getName().trim().equals(sName)) {
				return c;
			}
		}
		return null;
	}

	/** computes the set of missing parameter values for the given check, i.e. all value combinations - those that have check-results */
	public static Set<List<ParameterValue>> getMissingParameterValues(Check check) {
		Set<List<ParameterValue>> sRes = getAllRequiredCombinations(check);
		for (CheckResult cr:check.getCheckResults()) {
			Set<ParameterValue> sPVofCR=new HashSet<ParameterValue>();
			for (Instance i:cr.getInstances()) {
				if (i.getParameterValue()!=null) {
					sPVofCR.add(i.getParameterValue());
				}
			}
			// now check the list parameter values and remove the found ones
			List<ParameterValue> lPVFound=null;
			for (List<ParameterValue> lPV:sRes) {
				if (lPV.containsAll(sPVofCR)) {
					lPVFound=lPV;
					// do now check for duplicates (cannot be true)
				}
			}
			if (lPVFound!=null) {
				sRes.remove(lPVFound);
			}
		}
		return sRes;
	}
	/** determines if a check Result has a newer result (for the same instances) */
	public static boolean hasNextCheckResult(CheckResult cr) {
		// first compute all check results from the check
		Set<CheckResult> sCRs = new HashSet<CheckResult>();
		if (!(cr.eContainer() instanceof Check)) {
			System.err.println("strange case of hasNextCheckResult: invalid Check Result container "+cr.eContainer().eClass().getName());
			return false;
		}
		Check cParent = (Check)cr.eContainer();
		sCRs.addAll(cParent.getCheckResults());
		for (CheckResult crCand:sCRs) {
			if (crCand!=cr) {
				// System.out.println("comparing "+cr.getName()+" ("+cr.getArtifactRevisionOrDate()+") with "+crCand.getName()+" ("+crCand.getArtifactRevisionOrDate()+")");
				boolean bSameInstances=true;
				for (Instance i:crCand.getInstances()) {
					if (!cr.getInstances().contains(i)) {
						bSameInstances=false;
					}
				}
				if (bSameInstances) {
					// check if the date is newer
					Date dCand=parseDate(crCand.getTimeStamp());
					Date d=parseDate(cr.getTimeStamp());
					if (dCand!=null && d!=null) {
						if (dCand.after(d)) {
							return true;
						} 
						if (d.after(dCand)) {
							continue;
						}
					}				
					// if dates are not given, compare the artifact dates/revisions
					dCand=parseDate(crCand.getArtifactRevisionOrDate());
					d=parseDate(cr.getArtifactRevisionOrDate());
					if (dCand!=null && d!=null && dCand.after(d)) {
						return true;
					}
					if (dCand==null && d==null) {
						// try to compare them as numbers
						try {
							double doubleCand=new Double(crCand.getArtifactRevisionOrDate()).doubleValue();
							double doubleC=new Double(cr.getArtifactRevisionOrDate()).doubleValue();
							if (doubleCand>doubleC) {
								return true;
							}
						} catch (NumberFormatException nfe) {
							System.out.println("could not parse number from revision:"+nfe.getMessage());
						}
					}
				}
			}
		}
		return false;
	}

	public static List<CheckResult> getActualCheckResults(Check c) {
		List<CheckResult> lResult=new LinkedList<CheckResult>();
		for (CheckResult cr:c.getCheckResults()) {
			if (!hasNextCheckResult(cr)) {
				lResult.add(cr);
			}
		}
		Collections.sort(lResult, CheckResultComparator);
		return lResult;
	}
	/** computes the equivalence map for check results, 
	 * i.e. every check result is mapped to the set of this and other CR that belong to the same check&instance 
	 * Note: only other checks are returned, i.e. not every element is mapped to it's own
	 **/
	public static Map<CheckResult,Set<CheckResult>> getSameCheckResultsMap(Check cParent) {
		Map<CheckResult,Set<CheckResult>> mResult = new HashMap<CheckResult, Set<CheckResult>>();
		for (CheckResult cr:cParent.getCheckResults()) {
			for (CheckResult crCand:cParent.getCheckResults()) {
				if (crCand!=cr) {
					// System.out.println("comparing "+cr.getName()+" ("+cr.getArtifactRevisionOrDate()+") with "+crCand.getName()+" ("+crCand.getArtifactRevisionOrDate()+")");
					boolean bSameInstances=true;
					for (Instance i:crCand.getInstances()) {
						if (!cr.getInstances().contains(i)) {
							bSameInstances=false;
						}
					}
					if (bSameInstances) {
						Set<CheckResult> sCR;
						if (mResult.containsKey(cr)) {
							sCR=mResult.get(cr);
						} else {
							sCR=new HashSet<CheckResult>();
							sCR.add(cr);
							mResult.put(cr, sCR);
						}
						sCR.add(crCand);
					}
				}
			}
		}
		return mResult;
	}

	public static boolean hasPreviousCheckResult(CheckResult cr) {
		// TODO Auto-generated method stub
		return false;
	}

	public static int getNumberOfCheckResults(List<Check> selected) {
		int iFoundCheckResults=0;
		for (Check c:selected) {
			TreeIterator<EObject> it=c.eAllContents();
			while (it.hasNext()) {
				EObject eo=it.next();
				if (eo instanceof CheckResult) {
					iFoundCheckResults++;
				}
			}
		}
		return iFoundCheckResults;
	}
	public static int getNumberOfInstances(List<Check> selected) {
		int iFoundCheckResults=0;
		for (Check c:selected) {
			TreeIterator<EObject> it=c.eAllContents();
			while (it.hasNext()) {
				EObject eo=it.next();
				if (eo instanceof Instance) {
					iFoundCheckResults++;
				}
			}
		}
		return iFoundCheckResults;
	}
	public static int getNumberOfOldCheckResults(List<Check> selected) {
		int iFoundCheckResults=0;
		for (Check c:selected) {
			TreeIterator<EObject> it=c.eAllContents();
			while (it.hasNext()) {
				EObject eo=it.next();
				if (eo instanceof CheckResult && hasNextCheckResult((CheckResult)eo)) {
					iFoundCheckResults++;
				}
			}
		}
		return iFoundCheckResults;
	}

	/** returns all check results that have no next */
	public static Set<CheckResult> getRelevantCheckResults(List<Check> selected) {
		Set<CheckResult> iFoundCheckResults=new HashSet<CheckResult>();
		for (Check c:selected) {
			TreeIterator<EObject> it=c.eAllContents();
			while (it.hasNext()) {
				EObject eo=it.next();
				if (eo instanceof CheckResult && !hasNextCheckResult((CheckResult)eo)) {
					iFoundCheckResults.add((CheckResult)eo);
				}
			}
		}
		return iFoundCheckResults;
	}

	/** returns all check results that have a next */
	public static Set<CheckResult> getOldCheckResults(List<Check> selected) {
		Set<CheckResult> iFoundCheckResults=new HashSet<CheckResult>();
		for (Check c:selected) {
			TreeIterator<EObject> it=c.eAllContents();
			while (it.hasNext()) {
				EObject eo=it.next();
				if (eo instanceof CheckResult && hasNextCheckResult((CheckResult)eo)) {
					iFoundCheckResults.add((CheckResult)eo);
				}
			}
		}
		return iFoundCheckResults;
	}

	/** returns all check results that belong to the same check and same instances */
	public static Set<CheckResult> getSameCheckResults(CheckResult cr) {
		if (!(cr.eContainer() instanceof Check)) {
			System.err.println("strange case of getSameCheckResults: invalid Check Result container "+cr.eContainer().eClass().getName());
			return null;
		}
		Check cParent = (Check)cr.eContainer();
		Map<CheckResult, Set<CheckResult>> m=getSameCheckResultsMap(cParent);
		if (!m.containsKey(cr)) {
			return null;
		}
		return m.get(cr);
	}

	public static Comparator<CheckResult> CheckResultComparator = new Comparator<CheckResult>() {
		@Override
		public int compare(CheckResult cr, CheckResult crCand) {
			// check if the date is newer
			Date dCand=parseDate(crCand.getTimeStamp());
			Date d=parseDate(cr.getTimeStamp());
			if (dCand!=null && d!=null) {
				if (dCand.after(d)) {
					return 1;
				} 
				if (d.after(dCand)) {
					return -1;
				} 
				return 0;
			}
			// if dates are not given, compare the artifact dates/revisions
			dCand=parseDate(crCand.getArtifactRevisionOrDate());
			d=parseDate(cr.getArtifactRevisionOrDate());
			if (dCand!=null && d!=null && dCand.after(d)) {
				return -1;
			}
			if (dCand!=null && d!=null) {
				if (dCand.after(d)) {
					return 1;
				} 
				if (d.after(dCand)) {
					return -1;
				} 
				return 0;
			}
			if (dCand==null && d==null) {
				// try to compare them as numbers
				try {
					double doubleCand=new Double(crCand.getArtifactRevisionOrDate()).doubleValue();
					double doubleC=new Double(cr.getArtifactRevisionOrDate()).doubleValue();
					if (doubleCand>doubleC) {
						return 1;
					}
					if (doubleCand<doubleC) {
						return -1;
					}
					return 0;
				} catch (NumberFormatException nfe) {
					System.out.println("could not parse number from revision:"+nfe.getMessage());
				}
			}
			return 0;
		}
	};
	/** returns the sorted list with all same CRs */
	public static List<CheckResult> getSortedSameCheckResults(CheckResult cr) {
		Set<CheckResult> sameCheckResults = getSameCheckResults(cr);
		if (sameCheckResults==null) {
			return null;
		}
		return getSortedSameCheckResults(sameCheckResults);
	}
	/** returns the sorted list according to the date or revision */
	public static List<CheckResult> getSortedSameCheckResults(Set<CheckResult> sCRs) {
		List<CheckResult> lResult = new LinkedList<CheckResult>(sCRs);
		Collections.sort(lResult, CheckResultComparator);
		return lResult;
	}

	/**
	 * removes all check results (and instances)
	 * @param selected
	 * @return
	 */
	public static List<String> removeAllCheckResults(List<Check> selected) {
		final List<String> logs = new LinkedList<String>();
		int iReset=0;
		for (Check c:selected) {
			Map<Check,Set<CheckResult>> mCRToRemove = new HashMap<Check, Set<CheckResult>>();
			Map<Check,Set<Instance>> mInstToRemove = new HashMap<Check, Set<Instance>>();
			TreeIterator<EObject> it=c.eAllContents();
			while (it.hasNext()) {
				EObject eo=it.next();
				if (eo instanceof CheckResult) {
					CheckResult cr=(CheckResult)eo;
					EObject ec=cr.eContainer();
					if (ec instanceof Check) {
						Check check=(Check)ec;
						iReset++;
						logs.add(""+iReset+". removing CheckResult "+cr.getName()+" with verdict "+cr.getVerdict()+" from "+check.getName());
						Set<CheckResult> sToRemove;
						if (mCRToRemove.containsKey(check)) {
							sToRemove=mCRToRemove.get(check);
						} else {
							sToRemove=new HashSet<CheckResult>();
							mCRToRemove.put(check, sToRemove);
						}
						sToRemove.add(cr);
					} else {
						logs.add("cannot remove check result from "+ec.eClass().getName());
					}
				}
				if (eo instanceof Instance) {
					Instance cr=(Instance)eo;
					EObject ec=cr.eContainer();
					if (ec instanceof Check) {
						Check check=(Check)ec;
						iReset++;
						logs.add(""+iReset+". removing Instance "+ParameterUtils.getInstanceString(cr)+" from "+check.getName());
						Set<Instance> sToRemove;
						if (mInstToRemove.containsKey(check)) {
							sToRemove=mInstToRemove.get(check);
						} else {
							sToRemove=new HashSet<Instance>();
							mInstToRemove.put(check, sToRemove);
						}
						sToRemove.add(cr);
					} else {
						logs.add("cannot remove check result from "+ec.eClass().getName());
					}
				}
			}
			for (Check cR:mCRToRemove.keySet()) {
				cR.getCheckResults().removeAll(mCRToRemove.get(cR));
			}
			for (Check cR:mInstToRemove.keySet()) {
				cR.getInstances().removeAll(mInstToRemove.get(cR));
			}
		}
		return logs;
	}

	public static List<String> removeOldCheckResults(List<Check> selected) {
		final List<String> logs = new LinkedList<String>();
		int iReset=0;
		for (Check c:selected) {
			Map<Check,Set<CheckResult>> mToRemove = new HashMap<Check, Set<CheckResult>>();
			TreeIterator<EObject> it=c.eAllContents();
			while (it.hasNext()) {
				EObject eo=it.next();
				if (eo instanceof CheckResult && hasNextCheckResult((CheckResult)eo)) {
					CheckResult cr=(CheckResult)eo;
					EObject ec=cr.eContainer();
					if (ec instanceof Check) {
						Check check=(Check)ec;
						iReset++;
						logs.add(""+iReset+". removing Old CheckResult "+cr.getName()+" with verdict "+cr.getVerdict()+" from "+check.getName());
						Set<CheckResult> sToRemove;
						if (mToRemove.containsKey(check)) {
							sToRemove=mToRemove.get(check);
						} else {
							sToRemove=new HashSet<CheckResult>();
							mToRemove.put(check, sToRemove);
						}
						sToRemove.add(cr);
					} else {
						logs.add("ERROR: cannot remove old check result from "+ec.eClass().getName());
					}
				}
			}
			for (Check cR:mToRemove.keySet()) {
				cR.getCheckResults().removeAll(mToRemove.get(cR));
			}
		}
		return logs;
	}
	public static int getNumberOfUnassignedChecks(List<Check> selected) {
		int iFoundCheckStatus=0;
		for (Check c:selected) {
			if (c.getVerdict()!=CheckStatus.ASSIGNED) {
				iFoundCheckStatus++;
			}
			TreeIterator<EObject> it=c.eAllContents();
			while (it.hasNext()) {
				EObject eo=it.next();
				if (eo instanceof Check && ((Check)eo).getVerdict()!=CheckStatus.ASSIGNED) {
					iFoundCheckStatus++;
				}
			}
		}
		return iFoundCheckStatus;
	}

	public static int getNumberOfAllRequiredResults(List<Check> selected) {
		int iRes=0;
		for (Check c:selected) {
			if (c.getSubChecks().size()==0 || !c.isImplicit()) {
				int size = getAllRequiredParameterValues(c).size();
				if (size>0) {
					iRes+=size;
				} else {
					iRes++;
				}
			}
			iRes+=getNumberOfAllRequiredResults(c.getSubChecks());
		}
		return iRes;
	}

	public static int getNumberOfAvailableResults(List<Check> selected) {
		int iRes=0;
		for (Check c:selected) {
			for (CheckResult cr:c.getCheckResults()) {
				if(!hasNextCheckResult(cr)) {
					iRes++;
				}
			}
			iRes+=getNumberOfAvailableResults(c.getSubChecks());
		}
		return iRes;
	}

	public static int getNumberOfPASSResults(List<Check> selected) {
		int iRes=0;
		for (Check c:selected) {
			for (CheckResult cr:c.getCheckResults()) {
				if(cr.getVerdict()==CheckStatus.PASSED && !hasNextCheckResult(cr)) {
					iRes++;
				}
			}
			iRes+=getNumberOfPASSResults(c.getSubChecks());
		}
		return iRes;
	}

	public static int getNumberOfAllChecks(List<Check> selected) {
		int iRes=selected.size();
		for (Check c:selected) {
			iRes+=getNumberOfAllChecks(c.getSubChecks());
		}
		return iRes;
	}
	public static int getNumberOfAllChecksWithStatus(List<Check> selected,CheckStatus cs) {
		int iRes=0;
		for (Check c:selected) {
			if (c.getVerdict()==cs) {
				iRes++;
			}
		}
		for (Check c:selected) {
			iRes+=getNumberOfAllChecksWithStatus(c.getSubChecks(),cs);
		}
		return iRes;
	}
	public static int getNumberOfChecksStatus(List<CheckStatus> l,CheckStatus cs) {
		int iRes=0;
		for (CheckStatus c:l) {
			if (c==cs) {
				iRes++;
			}
		}
		return iRes;
	}

	/** computes the best status, i.e. PASS if found */
	public static CheckStatus getBestCheckStatus(CheckStatus cs1, CheckStatus cs2) {
		if (cs1==CheckStatus.PASSED || cs2==CheckStatus.PASSED) {
			return CheckStatus.PASSED;
		}
		if (cs1==CheckStatus.ANALYZED || cs2==CheckStatus.ANALYZED) {
			return CheckStatus.ANALYZED;
		}
		if (cs1==CheckStatus.ASSIGNED || cs2==CheckStatus.ASSIGNED) {
			return CheckStatus.ASSIGNED;
		}
		if (cs1==CheckStatus.CREATED || cs2==CheckStatus.CREATED) {
			return CheckStatus.CREATED;
		}
		if (cs1==CheckStatus.FAILED || cs2==CheckStatus.FAILED) {
			return CheckStatus.FAILED;
		}
		// impossible case
		return cs1;
	}
	/** computes the best status, i.e. PASS if found */
	public static CheckStatus getWorstCheckStatus(CheckStatus cs1, CheckStatus cs2) {
		if (cs1==CheckStatus.FAILED || cs2==CheckStatus.FAILED) {
			return CheckStatus.FAILED;
		}
		if (cs1==CheckStatus.CREATED || cs2==CheckStatus.CREATED) {
			return CheckStatus.CREATED;
		}
		if (cs1==CheckStatus.ASSIGNED || cs2==CheckStatus.ASSIGNED) {
			return CheckStatus.ASSIGNED;
		}
		if (cs1==CheckStatus.ANALYZED || cs2==CheckStatus.ANALYZED) {
			return CheckStatus.ANALYZED;
		}
		if (cs1==CheckStatus.PASSED || cs2==CheckStatus.PASSED) {
			return CheckStatus.PASSED;
		}
		// impossible case
		return cs1;
	}

	/** resets all checks to created, returns the number of changed checks and writes messages into logs */
	public static int resetChecks(List<Check> selected,List<String> logs) {
		int iRes=0;
		for (Check c:selected) {
			if (c.getVerdict()!=CheckStatus.CREATED) {
				iRes++;
				logs.add(""+iRes+". Reset Check "+c.getName()+" from "+c.getVerdict());
				c.setVerdict(CheckStatus.CREATED);
			}
			List<Check> subChecks = c.getSubChecks();
			iRes+=resetChecks(subChecks,logs);
		}
		return iRes;
	}
	/** sets check status to assigned and writes messages into logs */
	public static int assignChecks(List<Check> selected,List<String> logs) {
		int iRes=0;
		for (Check c:selected) {
			if (c.getVerdict()!=CheckStatus.ASSIGNED) {
				iRes++;
				if (c.getAuthor().size()==0) {
					logs.add(""+iRes+". ERROR Cannot assign check "+c.getName()+": No Author defined");
				} else if (c.getAuthor().get(0).getFullName()!=null && !c.getAuthor().get(0).getFullName().trim().equals("")) {
					logs.add(""+iRes+". ERROR Cannot assign check "+c.getName()+": No Full-Name given for Author "+c.getAuthor().get(0).getName());
				} else {
					logs.add(""+iRes+". Assign Check "+c.getName()+" from "+c.getVerdict()+" to "+c.getAuthor().get(0).getFullName());
					c.setVerdict(CheckStatus.ASSIGNED);
				}
			}
			List<Check> subChecks = c.getSubChecks();
			iRes+=assignChecks(subChecks,logs);
		}
		return iRes;
	}

	/** sets check status to assigned and writes messages into logs */
	public static int analyzeChecks(List<Check> selected,List<String> logs) {
		
		// Initialize for undo / redo before starting recursive analysis
		CompoundCommand commands = new CompoundCommand("");
		commands.setDescription("update status");
		
		int iRes=0;
		for (Check c:selected) {
			iRes+=analyzeChecks(c,logs, commands);
		}
		
		// Add Identity command to block undo / redo
		IdentityCommand identityCommand = new IdentityCommand("") {
			
			@Override
			public boolean canUndo() {
				return false;
			}
			
		};
		identityCommand.setDescription("undo/redo lock");
		commands.append(identityCommand);
		
		// Publish
		if( selected.size() > 0 ) {
			final EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(selected.get(0));
			if( editingDomain != null ) {
				editingDomain.getCommandStack().execute(commands);
			}
		}
		
		return iRes;
	}
	public static int analyzeChecks(Check check,List<String> logs, CompoundCommand commands) {
		int iRes=0;
		for (Check c:check.getSubChecks()) {
			iRes+=analyzeChecks(c,logs, commands);
		}
		List<CheckResult> lCRs=getActualCheckResults(check);
		CheckStatus csWorstResult=CheckStatus.PASSED;
		String sResultMsg="";
		if (lCRs.size()==1) {
			CheckResult cr=lCRs.iterator().next();
			csWorstResult=cr.getVerdict();
			sResultMsg+="has one result:"+csWorstResult;
		}
		if (lCRs.size()>1) {
			List<CheckStatus> lCSs=getCheckStatiCheckResult(lCRs);
			Set<CheckStatus> sCSs = new HashSet<CheckStatus>(lCSs);
			csWorstResult=getWorstVerdict(sCSs);
			sResultMsg+="has "+lCRs.size()+" results (worst="+csWorstResult.name()+"):"+printStatistic(lCSs);
		}
		CheckStatus csWorstCheck=CheckStatus.PASSED;
		String sCheckMsg="";
		if (check.getSubChecks().size()==1) {
			Check cr=check.getSubChecks().iterator().next();
			csWorstCheck=cr.getVerdict();
			sCheckMsg+="has one sub-check:"+csWorstCheck;
		}
		if (check.getSubChecks().size()>1) {
			List<CheckStatus> lCSs=getCheckStatiCheck(check.getSubChecks());
			Set<CheckStatus> sCSs = new HashSet<CheckStatus>(lCSs);
			csWorstCheck = getWorstVerdict(sCSs);
			sCheckMsg+="has "+check.getSubChecks().size()+" sub-checks (worst="+csWorstCheck.name()+"):"+printStatistic(lCSs);
		}
		CheckStatus csWorst = getWorstCheckStatus(csWorstResult, csWorstCheck);
		if (lCRs.size()+check.getSubChecks().size()==0) {
			logs.add("No sub-verdicts found: keeping same Verdict of "+check.getName()+" ("+check.getVerdict()+")");
		} else {
			if (csWorst!=check.getVerdict()) { 
				iRes++;
				String sMsg="";
				if (!sResultMsg.equals("") && !sCheckMsg.equals("")) {
					sMsg=sResultMsg+" and "+sCheckMsg;
				} else if (sResultMsg.equals("")) {
					sMsg=sCheckMsg;
				} else if (sCheckMsg.equals("")) {
					sMsg=sResultMsg;
				}
				sMsg = "Analyzed new Verdict "+csWorst+" of "+check.getName()+" ("+check.getVerdict()+"):"+sMsg;
				logs.add(sMsg);
				
				// Create check editing commands
				final EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(check);
				final Command commandVerdict = SetCommand.create(
						editingDomain, 
						check, 
						VvtPackage.Literals.CHECK.getEStructuralFeature(VvtPackage.CHECK__VERDICT),
						csWorst);	
				
				final Command commandComment = SetCommand.create(
						editingDomain, 
						check, 
						VvtPackage.Literals.CHECK.getEStructuralFeature(VvtPackage.CHECK__COMMENT),
						(new StringBuilder().append(check.getComment())
											.append("\nVVT (")
											.append(getNow())
											.append("):")
											.append(sMsg)).toString());

				commands.append(commandVerdict);
				commands.append(commandComment);

			} else {
				logs.add("analyzed same Verdict "+csWorst+" of "+check.getName()+" ("+check.getVerdict()+")");
			}
		}
		
		return iRes;
	}



	public static List<CheckStatus> getCheckStatiCheckResult(List<CheckResult> lCRs) {
		List<CheckStatus> sResult=new LinkedList<CheckStatus>();
		for (CheckResult cr:lCRs) {
			sResult.add(cr.getVerdict());
		}
		return sResult;
	}
	public static List<CheckStatus> getCheckStatiCheck(List<Check> lCRs) {
		List<CheckStatus> sResult=new LinkedList<CheckStatus>();
		for (Check cr:lCRs) {
			sResult.add(cr.getVerdict());
		}
		return sResult;
	}

	public static String printStatistic(List<CheckStatus> l) {
		String sResult="";
		for (CheckStatus cs:CheckStatus.values()) {
			int iAnz=getNumberOfChecksStatus(l, cs);
			if (iAnz>0) {
				if (!sResult.equals("")) {
					sResult+=", ";
				}
				sResult+=iAnz+" "+cs.name();
			}
		}
		return sResult;
	}
	public static CheckStatus getBestVerdict(Set<CheckStatus> s) {
		if (s.size()==0) {
			return null;
		}
		CheckStatus csResult=CheckStatus.PASSED;
		for (CheckStatus cs:s) {
			csResult=getBestCheckStatus(csResult, cs);
		}
		return csResult;
	}

	public static CheckStatus getWorstVerdict(Set<CheckStatus> s) {
		if (s.size()==0) {
			return null;
		}
		CheckStatus csResult=CheckStatus.PASSED;
		for (CheckStatus cs:s) {
			csResult=getWorstCheckStatus(csResult, cs);
		}
		return csResult;
	}

}
