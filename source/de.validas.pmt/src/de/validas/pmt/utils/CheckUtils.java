/**
 * 
 */
package de.validas.pmt.utils;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import metaModel.referenceProcess.Criterion;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ReferenceProcessFactory;
import metaModel.referenceProcess.VerificationModule;
import metaModel.referenceProcess.impl.ReferenceProcessFactoryImpl;
import metaModel.terms.Parameter;

/**
 * @author slotosch
 * Some utilities for Checks
 * 1) split complex checks into criteria
 * 2) improve the names (only internally used)
 * both actions are model transformation to improve old models and do not need to go to the user
 */
public class CheckUtils {

	public static ReferenceProcessFactory factory =new ReferenceProcessFactoryImpl();


	/**
	 * checks if the long description contains a " * ...?" that is not contained in the description of a contained criteria 
	 * @param c
	 * @return the number of new Criteria found
	 */
	public static int getNewCriteria(VerificationModule v) {
		String sLD = v.getLongDescription();
		if (sLD==null || sLD.trim().equals("")) {
			return 0;
		}
		List<String> l = parseCriteria(sLD,new LinkedList<String>(),"");
		int iRes=0;
		for (String sD:l) {
			boolean bFound=false;
			for (Criterion c:v.getCriteria()) {
				if (c.getDescription()!=null && c.getDescription().equals(sD)) {
					bFound=true;
				}
			}
			if (!bFound) {
				iRes++;
			}
		}
		return iRes;
	}

	/**
	 * checks if the name of the check is bad, i.e. does not contain the ID or the parameter
	 */
	public static int getBadNameCriteria(VerificationModule v) {
		String sParam=getParamString(v);
		int iRes=0;
		for (Criterion c:v.getCriteria()) {
			if (c.getName()==null || !c.getName().startsWith(sParam)) {
				iRes++;
			} else if (c.getID()!=null && c.getName()!=null && !(c.getName().indexOf(c.getID())>0)) {
				iRes++;
			}
		}
		return iRes;
	}

	/**
	 *create sub-criteria
	 */
	public static int correctBadNameCriteriaAtomic(VerificationModule v,List<String> logs) {
		String sParam=getParamString(v);
		int iRes=0;
		for (Criterion c:v.getCriteria()) {
			boolean bOK=true;
			String sOldName=c.getName();
			if (c.getID()!=null && c.getName()!=null && !(c.getName().indexOf(c.getID())>0)) {
				c.setName(c.getID()+":"+c.getName());
				bOK=false;
			}
			if (c.getName()==null || !c.getName().startsWith(sParam)) {
				c.setName(sParam+"-"+c.getName());
				bOK=false;
			}
			if (!bOK) {
				iRes++;
				logs.add("improved "+sOldName+" -> "+c.getName());
			}
		}
		return iRes;
	}

	/**
	 *create sub-criteria
	 */
	public static int createNewCriteriaAtomic(VerificationModule v,List<String> logs) {
		String sLD = v.getLongDescription();
		if (sLD==null || sLD.trim().equals("")) {
			return 0;
		}
		List<String> l = parseCriteria(sLD,logs,v.getName());
		List<String> sNewDescs = new LinkedList<String>();
		for (String sDesc:l) {
			boolean bFound=false;
			for (Criterion c:v.getCriteria()) {
				if (c.getDescription()!=null && c.getDescription().equals(sDesc)) {
					bFound=true;
				}
			} 
			if (!bFound) {
				sNewDescs.add(sDesc);
				sLD.replace(sDesc, "");
			}
		}
		Set<String> sIDs = new HashSet<String>();
		for (Criterion c:v.getCriteria()) {
			if (c.getID()!=null) {
				sIDs.add(c.getID());
			}
		} 
		//  compute the parameter (for names)
		String sParams=getParamString(v);
		// now add all new Criteria
		int iCnt=0;
		String sIDFix="C";
		if (v.getID()!=null && !v.getID().trim().equals("")) {
			sIDFix=v.getID()+"-"+sIDFix;
		}
		for (String sD:sNewDescs) {
			iCnt++;
			String sID=sIDFix+iCnt;
			while (sIDs.contains(sID)) {
				iCnt++;
				sID=sIDFix+iCnt;
			}
			Criterion c=factory.createCriterion();
			c.setID(sID);
			c.setName(sParams+"-"+sID+" Criterion "+iCnt);
			c.setDescription(sD);
			v.getCriteria().add(c);
			logs.add("Created Criterion "+c.getName()+":"+sD);
		}
		v.setLongDescription("All "+v.getCriteria().size()+" criteria have to be checked successfully in order to comply with this check.\n"+sLD);
		v.setImplicit(true);
		return sNewDescs.size();
	}

	/**
	 * compute the parameter (for names)
	 * @param v
	 * @return
	 */
	private static String getParamString(VerificationModule v) {
		ParameterUtils.getPrintableParameters(v);
		String sParams="";
		for (Parameter p:HierarchyModel.getAllParameters(v)) {
			if (p.getIteratorParameters().size()==0) {
				if (!sParams.equals("")) {
					sParams+="-";
				}
				sParams+=p.getName();
			}
		}
		return sParams;
	}
	public static List<String> parseCriteria(String s,List<String> lLogs,String sName) {
		List<String> lRes=new LinkedList<String>();
		while (s.indexOf("?")>0) {
			int pos=s.indexOf("?");
			int start=s.indexOf("*");
			if (start>0&&start<pos) {
				String sCrit=s.substring(start+1, pos+1).trim();
				lRes.add(sCrit);
				s=s.substring(pos+1);
			} else {
				start=s.indexOf("-");
				if (start>0&&start<pos) {
					String sCrit=s.substring(start+1, pos+1).trim();
					lRes.add(sCrit);
					s=s.substring(pos+1);
				} else {
					// nothing to parse
					lLogs.add("cannot create criteria for "+sName+" from "+s);
					return lRes;
				}
			}
		}
		return lRes;
	}

	public static int getNumberNewCriteria(List<ProcessModule> selected) {
		int iRes=0;
		for (ProcessModule pm:selected) {
			iRes+=getNumberNewCriteria(pm);
		}
		return iRes;
	}
	public static int getNumberNewCriteria(ProcessModule pm) {
		int iRes=0;
		if (pm instanceof VerificationModule) {
			iRes+=getNewCriteria((VerificationModule)pm);
		}
		for (ProcessModule pmSub:pm.getSubProcessModules()) {
			iRes+=getNumberNewCriteria(pmSub);
		}
		for (ProcessModule pmSub:pm.getSubProcessModuleReferences()) {
			iRes+=getNumberNewCriteria(pmSub);
		}
		return iRes;
	}

	public static int createNewCriteria(List<ProcessModule> selected, List<String> logs) {
		int iRes=0;
		for (ProcessModule pm:selected) {
			iRes+=createNewCriteria(pm,logs);
		}
		return iRes;
	}
	public static int createNewCriteria(ProcessModule pm, List<String> logs) {
		int iRes=0;
		if (pm instanceof VerificationModule) {
			iRes+=createNewCriteriaAtomic((VerificationModule)pm,logs);
		}
		for (ProcessModule pmSub:pm.getSubProcessModules()) {
			iRes+=createNewCriteria(pmSub,logs);
		}
		for (ProcessModule pmSub:pm.getSubProcessModuleReferences()) {
			iRes+=createNewCriteria(pmSub,logs);
		}
		return iRes;
	}
	public static int getNumberBadNames(List<ProcessModule> selected) {
		int iRes=0;
		for (ProcessModule pm:selected) {
			iRes+=getNumberBadNames(pm);
		}
		return iRes;
	}
	public static int getNumberBadNames(ProcessModule pm) {
		int iRes=0;
		if (pm instanceof VerificationModule) {
			iRes+=getBadNameCriteria((VerificationModule)pm);
		}
		for (ProcessModule pmSub:pm.getSubProcessModules()) {
			iRes+=getNumberBadNames(pmSub);
		}
		for (ProcessModule pmSub:pm.getSubProcessModuleReferences()) {
			iRes+=getNumberBadNames(pmSub);
		}
		return iRes;
	}

	public static int correctBadNameCriteria(List<ProcessModule> selected, List<String> logs) {
		int iRes=0;
		for (ProcessModule pm:selected) {
			iRes+=correctBadNameCriteria(pm,logs);
		}
		return iRes;
	}
	public static int correctBadNameCriteria(ProcessModule pm, List<String> logs) {
		int iRes=0;
		if (pm instanceof VerificationModule) {
			iRes+=correctBadNameCriteriaAtomic((VerificationModule)pm,logs);
		}
		for (ProcessModule pmSub:pm.getSubProcessModules()) {
			iRes+=correctBadNameCriteria(pmSub,logs);
		}
		for (ProcessModule pmSub:pm.getSubProcessModuleReferences()) {
			iRes+=correctBadNameCriteria(pmSub,logs);
		}
		return iRes;
	}

}
