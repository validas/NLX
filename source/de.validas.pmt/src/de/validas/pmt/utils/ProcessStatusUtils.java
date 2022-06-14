/**
 * 
 */
package de.validas.pmt.utils;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

//import com.sun.org.apache.bcel.internal.generic.LLOAD;

import de.validas.pmt.utils.VariantModel.ACTIVATION;
import metaModel.referenceProcess.Process;
import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ProcessStatus;
import metaModel.referenceProcess.Requirement;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.Tool;
import metaModel.referenceProcess.VerificationModule;
import metaModel.suptertype.Named;
import metaModel.suptertype.Variantable;
import metaModel.terms.Binding;
import metaModel.terms.BoolTerm;
import metaModel.terms.Parameter;

/**
 * @author slotosch
 * methods to compute project status
 */
public class ProcessStatusUtils {

	private static final String TAB_NAME_STATUS = "STATUS";
	private static final int TAB_TYPE = 1;
	private static final int TAB_NAME = 2;
	private static final int TAB_STATE = 3;
	private static final int TAB_ID = 4;
	private static final int TAB_QUALNAME = 5;
	private static final int TAB_DESCRIPTION = 6;
	private static final int TAB_EFFORT = 7;
	private static final int TAB_PROGRESS = 8;
	private static final int TAB_START = 9;
	private static final int TAB_END = 10;

	private static DecimalFormat df = new DecimalFormat("0.00");

	/**
	 * computes the best status of the process module (including super-elements)
	 * DEFINED < READY < IN_PROGRESS < DONE
	 * @param pm
	 * @return
	 */
	public static ProcessStatus getProjectStatusSuper(ProcessModule pm,Named nScope)  {
		// first check for done (hierarchically)
		if (isDoneProjectStatusSuper(pm)) {
			return ProcessStatus.DONE;
		}
		ProcessStatus psPrerequisites =pm.getStatus();
		for (Artifact a:pm.getInputArtifacts()) {
			if (VariantModel.isActive(a, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				psPrerequisites= minStatus(psPrerequisites, getProjectStatusSuper(a));	
			}
		}
		for (ProcessModule pmB:pm.getAfterProcessModules()) {
			if (VariantModel.isActive(pmB, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				psPrerequisites= minStatus(psPrerequisites, getProjectStatusSuper(pmB,nScope));	
			}
		}
		return psPrerequisites;
	}

	public static ProcessStatus getProjectStatusSuper(Artifact pm)  {
		if (pm.eContainer() instanceof Artifact) {
			return maxStatus(pm.getStatus(), getProjectStatusSuper((Artifact)pm.eContainer()));
		}
		return pm.getStatus();
	}

	public static boolean isDoneProjectStatusSuper(ProcessModule pm) {
		if (pm.getStatus()==ProcessStatus.DONE) {
			return true;
		}
		if (pm.eContainer() instanceof ProcessModule) {
			return isDoneProjectStatusSuper((ProcessModule)pm.eContainer());
		}
		return false;
	}
	/**
	 * computes the best/maximal status according to: 
	 *  DEFINED < READY < IN_PROGRESS < DONE
	 * @param p1
	 * @param p2
	 * @return maximal status
	 * Note does not need to explore the ordinal definition of PS
	 */
	public static ProcessStatus maxStatus(ProcessStatus p1, ProcessStatus p2) {
		if (p1==ProcessStatus.DONE || p2==ProcessStatus.DONE) {
			return ProcessStatus.DONE;
		}
		if (p1==ProcessStatus.IN_PROGRESS || p2==ProcessStatus.IN_PROGRESS) {
			return ProcessStatus.IN_PROGRESS;
		}
		if (p1==ProcessStatus.READY || p2==ProcessStatus.READY) {
			return ProcessStatus.READY;
		}
		return ProcessStatus.DEFINED;
	}

	/**
	 * computes the best/maximal status according to: 
	 *  DEFINED < READY < IN_PROGRESS < DONE
	 * @param p1
	 * @param p2
	 * @return maximal status
	 * Note does not need to explore the ordinal definition of PS
	 */
	public static ProcessStatus minStatus(ProcessStatus p1, ProcessStatus p2) {
		if (p1==ProcessStatus.DEFINED|| p2==ProcessStatus.DEFINED) {
			return ProcessStatus.DEFINED;
		}
		if (p1==ProcessStatus.READY || p2==ProcessStatus.READY) {
			return ProcessStatus.READY;
		}
		if (p1==ProcessStatus.IN_PROGRESS || p2==ProcessStatus.IN_PROGRESS) {
			return ProcessStatus.IN_PROGRESS;
		}
		return ProcessStatus.DONE;
	}

	public static List<String> updateStatus(Named named,Named nScope) {
		if (named instanceof Artifact) {
			return updateStatusArtifact((Artifact)named,nScope);
		} else if (named instanceof ProcessModule) {
			return updateStatusProcessModule((ProcessModule)named,nScope);
		} else if (named instanceof Process) {
			LinkedList<String> lRes= new LinkedList<String>();
			for (Artifact art:VariantModel.Named_getAllArtifacts(nScope)) {
				lRes.addAll(updateStatusArtifact(art, nScope));
			}
			for (ProcessModule pm:VariantModel.Named_getAllProcessModules(nScope)) {
				lRes.addAll(updateStatusProcessModule(pm, nScope));
			}
			return lRes;
		} 
		LinkedList<String> lRes= new LinkedList<String>();
		lRes.add("cannot update status of selected "+named.getName()+"("+named.eClass().getName()+"). Only Artifacts, Process and ProcessModules allowed");
		return lRes;
	}

	private static boolean debugStatus=false;
	private static List<String> updateStatusProcessModule(ProcessModule pm,Named nScope) {
		LinkedList<String> lRes= new LinkedList<String>();
		String sStat="DEBUG: Status of "+pm.getName()+":"+pm.getStatus().name();
		if (debugStatus) {
			System.out.println(sStat);
		}
		// start bottom up (since status is computed hierarchically)
		for (ProcessModule pmSub:DeactivationModel.ProcessModule_getSubModulesIncludingRefs(pm, nScope)) {
			if (VariantModel.isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.addAll(updateStatusProcessModule(pmSub, nScope));
			}
		}
		ProcessStatus psMin=ProcessStatus.DONE;
		for (Artifact a:DeactivationModel.ProcessModule_getInputs(pm, nScope)) {
			psMin=minStatus(psMin, getProjectStatusSuper(a));
		}
		ProcessStatus psAfter=ProcessStatus.DONE;
		for (ProcessModule a:DeactivationModel.ProcessModule_getAfterProcessModules(pm, nScope)) {
			psAfter=minStatus(psAfter, getProjectStatusSuper(a,nScope));
		}
		ProcessStatus psSub=ProcessStatus.DONE;
		for (ProcessModule pmSub:DeactivationModel.ProcessModule_getSubModulesIncludingRefs(pm, nScope)) {
			psSub=minStatus(psSub, getProjectStatusSuper(pmSub,nScope));
		}
		if (psMin==ProcessStatus.DONE && psAfter==ProcessStatus.DONE && psSub==ProcessStatus.DONE && getProjectStatusSuper(pm,nScope)==ProcessStatus.DEFINED) {
			lRes.add("Update status of ProcessModule "+pm.getName()+" from DEFINED to READY");
			pm.setStatus(ProcessStatus.READY);
		} else {
			if (debugStatus) {
				lRes.add(sStat);
			}
		}
		return lRes;
	}


	private static List<String> updateStatusArtifact(Artifact art,Named nScope) {
		LinkedList<String> lRes= new LinkedList<String>();
		// start bottom up (since status is computed hierarchically)
		for (Artifact aSub:art.getSubArtifacts()) {
			if (VariantModel.isActive(aSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.addAll(updateStatusArtifact(aSub, nScope));
			}
		}
		for (Artifact aSub:art.getSubArtifactReferences()) {
			if (VariantModel.isActive(aSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.addAll(updateStatusArtifact(aSub, nScope));
			}
		}
		ProcessStatus psMin=ProcessStatus.DONE;
		for (ProcessModule a:art.getCreatedByProcessModules()) {
			if (VariantModel.isActive(a, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				psMin=minStatus(psMin,getProjectStatusSuper(a,nScope));
			}
		}
		if (psMin==ProcessStatus.DONE && getProjectStatusSuper(art)==ProcessStatus.DEFINED) {
			lRes.add("Update status of Artifact "+art.getName()+" from DEFINED to READY");
			art.setStatus(ProcessStatus.READY);
		}
		return lRes;
	}

	public static List<String> debugProjectStatus(Named named,Named nScope) {
		if (named instanceof Artifact) {
			return debugStatusArtifact((Artifact)named,nScope);
		} else if (named instanceof ProcessModule) {
			return debugStatusProcessModule((ProcessModule)named,nScope);
		} else if (named instanceof Process) {
			LinkedList<String> lRes= new LinkedList<String>();
			for (Artifact art:VariantModel.Named_getAllArtifacts(nScope)) {
				lRes.addAll(debugStatusArtifact(art, nScope));
			}
			for (ProcessModule pm:VariantModel.Named_getAllProcessModules(nScope)) {
				lRes.addAll(debugStatusProcessModule(pm, nScope));
			}
			return lRes;
		} 
		LinkedList<String> lRes= new LinkedList<String>();
		lRes.add("cannot debug status of selected "+named.getName()+"("+named.eClass().getName()+"). Only Artifacts, Process and ProcessModules allowed");
		return lRes;
	}

	private static List<String> debugStatusProcessModule(ProcessModule pm,Named nScope) {
		LinkedList<String> lRes= new LinkedList<String>();
		String sTitle="Status of ProcessModule "+pm.getName()+"="+getProjectStatusSuper(pm,nScope).name()+" ("+pm.getStatus().getName()+")";
		lRes.add("");
		lRes.add(repeat("-",sTitle.length()));
		lRes.add(sTitle);
		lRes.add(repeat("-",sTitle.length()));
		if (HierarchyModel.getStakeHolderSuper(pm)!=null) {
			lRes.add("Responsible: "+HierarchyModel.getStakeHolderSuper(pm).getName());		
		} else {
			lRes.add("NO Responsible Role for : "+pm.getName());	
		}
		try {
			lRes.add("Effort: "+ProjectPlanner.getEffort(pm,nScope));
		} catch (Exception e) {
			e.printStackTrace();
			lRes.add("Problem with Effort of "+pm.getName()+":"+e.getMessage());
		}
		lRes.add("Progress: "+pm.getProgress());
		if (pm.getPlannedStartDate()!=null) {lRes.add("PlannedStart: "+pm.getPlannedStartDate());}
		if (pm.getPlannedEndDate()!=null) {lRes.add("PlannedEnd: "+pm.getPlannedEndDate());}
		ProcessStatus psMin=ProcessStatus.DONE;
		for (Artifact a:HierarchyModel.getAllInputs(pm)) {
			if (VariantModel.isActive(a, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add("Input: "+a.getName()+" = "+getProjectStatusSuper(a).getName());
				psMin=minStatus(psMin, getProjectStatusSuper(a));
			}
		}
		lRes.add("Minimal Status of Inputs = "+psMin.name());
		ProcessStatus psAfter=ProcessStatus.DONE;
		for (ProcessModule pmSub:pm.getAfterProcessModules()) {
			if (VariantModel.isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add("After: "+pmSub.getName()+" = "+getProjectStatusSuper(pmSub,nScope).getName());
				psAfter=minStatus(psAfter, getProjectStatusSuper(pmSub,nScope));
			}
		}
		lRes.add("Minimal Status of After = "+psAfter.name());
		ProcessStatus psSub=ProcessStatus.DONE;
		for (ProcessModule pmSub:pm.getSubProcessModules()) {
			if (VariantModel.isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				psSub=minStatus(psSub, getProjectStatusSuper(pmSub,nScope));
			}
		}
		for (ProcessModule pmSub:pm.getSubProcessModuleReferences()) {
			if (VariantModel.isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				psSub=minStatus(psSub, getProjectStatusSuper(pmSub,nScope));
			}
		}
		if (pm.getSubProcessModules().size()+pm.getSubProcessModuleReferences().size()>0) {
			lRes.add("Minimal Status of Sub = "+psSub.name());
		}

		if (psMin==ProcessStatus.DONE && psAfter==ProcessStatus.DONE  && psSub==ProcessStatus.DONE && getProjectStatusSuper(pm,nScope)==ProcessStatus.DEFINED) {
			lRes.add("ProcessModule "+pm.getName()+" needs update from DEFINED to READY");
		}
		// start bottom up (since status is computed hierarchically)
		for (ProcessModule pmSub:pm.getSubProcessModules()) {
			if (VariantModel.isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.addAll(debugStatusProcessModule(pmSub, nScope));
			}
		}
		for (ProcessModule pmSub:pm.getSubProcessModuleReferences()) {
			if (VariantModel.isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.addAll(debugStatusProcessModule(pmSub, nScope));
			}
		}

		return lRes;
	}


	private static List<String> debugStatusArtifact(Artifact art,Named nScope) {
		LinkedList<String> lRes= new LinkedList<String>();
		String sTitle="Status of Artifact "+art.getName()+"="+getProjectStatusSuper(art).name()+" ("+art.getStatus().getName()+")";
		lRes.add("");
		lRes.add(repeat("-",sTitle.length()));
		lRes.add(sTitle);
		lRes.add(repeat("-",sTitle.length()));
		if (HierarchyModel.getStakeHolderSuper(art)!=null) {
			lRes.add("Responsible: "+HierarchyModel.getStakeHolderSuper(art).getName());		
		} else {
			lRes.add("NO Responsible Role for : "+art.getName());	
		}
		ProcessStatus psMin=ProcessStatus.DONE;
		for (ProcessModule a:art.getCreatedByProcessModules()) {
			if (VariantModel.isActive(a, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add("Created By: "+a.getName()+" = "+getProjectStatusSuper(a,nScope).getName());
				psMin=minStatus(psMin, getProjectStatusSuper(a,nScope));
			}
		}
		lRes.add("Minimal Status of Creators = "+psMin.name());
		if (psMin==ProcessStatus.DONE && getProjectStatusSuper(art)==ProcessStatus.DEFINED) {
			lRes.add("Artifact "+art.getName()+" needs update from DEFINED to READY");
		}
		for (Artifact aSub:art.getSubArtifacts()) {
			if (VariantModel.isActive(aSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.addAll(debugStatusArtifact(aSub, nScope));
			}
		}
		for (Artifact aSub:art.getSubArtifactReferences()) {
			if (VariantModel.isActive(aSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.addAll(debugStatusArtifact(aSub, nScope));
			}
		}
		return lRes;
	}

	private static String repeat(String string, int length) {
		if (length<=0) {
			return "";
		}
		return string+repeat(string,length-1);
	}

	public static List<String>getProjectStatus(Process process) {
		List<String> lRes = new LinkedList<String>();
		Named nScope = process;
		lRes.add("Project Status of "+process.getName()+":");
		Set<ProcessModule> sAllPMs = new HashSet<ProcessModule>();
		for (ProcessModule pmRoot:VariantModel.Process_getAllProcessModules(process)) {
			sAllPMs.add(pmRoot);
		}
		Set<ProcessModule> sOpenPMs = new HashSet<ProcessModule>();
		Set<ProcessModule> sReadyPMs = new HashSet<ProcessModule>();
		Set<ProcessModule> sUnassignedPMs = new HashSet<ProcessModule>();
		Map<StakeHolder,Set<ProcessModule>> mOpenPMs = new HashMap<StakeHolder, Set<ProcessModule>>();
		Map<StakeHolder,Set<ProcessModule>> mReadyPMs = new HashMap<StakeHolder, Set<ProcessModule>>();
		float fOverallEffort=0;
		float fDone=0;
		for (ProcessModule pm:sAllPMs) {
			float fPM=pm.getEffort();
			try {
				ProjectPlanner.getEffort(pm,process);
			} catch (Exception e) {
				lRes.add("Problem with effort of "+pm.getName()+":"+e.getMessage());
			}
			fOverallEffort+=fPM;
			StakeHolder shPM = HierarchyModel.getStakeHolderSuper(pm);
			if (shPM==null) {
				sUnassignedPMs.add(pm);
			}
			if (getProjectStatusSuper(pm,nScope)!=ProcessStatus.DONE) {
				sOpenPMs.add(pm);
				if (shPM!=null) {
					addToMap(mOpenPMs,shPM,pm);
				}
				if (pm.getProgress()>0) {
					if (pm.getProgress()>1) {
						System.err.println("strange progres case in "+pm.getName()+" (progress should be between 0 and 1 and not "+pm.getProgress()+"). Ignoring");
					} else {
						fDone+=pm.getProgress()*fPM;
					}
				}
			} else {
				fDone+=fPM;
			}
			if (getProjectStatusSuper(pm,nScope)==ProcessStatus.READY) {
				sReadyPMs.add(pm);
				if (shPM!=null) {
					addToMap(mReadyPMs,shPM,pm);
				}
			}
		}
		// check the requirements
		final Set<Requirement> sAllRequirements = VariantModel.Named_getAllClaimedAndContainedRequirements(nScope);
		final Set<Compliance> sAllCompliances = new HashSet<Compliance>();
		int iAnzRequiredProcessModules=0;
		int iAnzRequiredVerificationModules=0;
		for (final Requirement r : sAllRequirements) {
			for (Compliance c:r.getCompliances()) {
				sAllCompliances.add(c);
				iAnzRequiredProcessModules+=c.getProcessModules().size();
				iAnzRequiredVerificationModules+=c.getVerificationModules().size();
			}
		}
		lRes.add("Requirements: "+sAllRequirements.size());
		lRes.add("Compliances: "+sAllCompliances.size()+" ("+df.format(100.0*sAllCompliances.size()/sAllRequirements.size())+"%)");
		lRes.add("Required Process Modules:"+iAnzRequiredProcessModules);
		lRes.add("Required Verification Modules:"+iAnzRequiredVerificationModules);
		lRes.add("Tasks DONE: "+(sAllPMs.size()-sOpenPMs.size())+" (out of "+sAllPMs.size()+"): Effort "+fDone+"="+df.format((fDone*100/fOverallEffort))+"%");
		if (sUnassignedPMs.size()>0) {
			lRes.add("Unassigned Tasks:"+sUnassignedPMs.size());
			for (ProcessModule pm:sUnassignedPMs) {
				lRes.add("Unassigned: "+pm.getName());
			}
		}
		lRes.add("Tasks OPEN:"+sOpenPMs.size());
		lRes.add("Tasks READY:"+sReadyPMs.size());
		for (StakeHolder sh:mReadyPMs.keySet()) {
			Set<ProcessModule> sTasksForSH=mReadyPMs.get(sh);
			float fEffort=0;
			for (ProcessModule pm:sTasksForSH) {
				try {
					fEffort+=ProjectPlanner.getEffort(pm,nScope);
				} catch (Exception e) {
					e.printStackTrace();
					lRes.add("Problem with effort of "+pm.getName()+":"+e.getMessage());
				}
			}
			lRes.add("StakeHolder: "+sh.getName()+" has "+sTasksForSH.size()+" ready tasks (Effort "+fEffort+")");
			for (ProcessModule pm:sTasksForSH) {
				try {
					lRes.add("READY for "+sh.getName()+":"+pm.getName()+ " (Effort "+ProjectPlanner.getEffort(pm,nScope)+")");
				} catch (Exception e) {
					e.printStackTrace();
					lRes.add("Problem with effort of "+pm.getName()+":"+e.getMessage());
				}
			}
		}

		// same for Artifacts

		Set<Artifact> sAllArts = new HashSet<Artifact>();
		for (Artifact aRoot:VariantModel.Named_getAllArtifacts(nScope)) {
			for (Artifact aSub:HierarchyModel.getAllArtifacts(aRoot)) {
				if (VariantModel.isActive(aSub, nScope)!=ACTIVATION.ACTIVE_NEVER && aSub.isPartOfProduct()) {
					sAllArts.add(aSub);
				}
			}
		}
		Set<Artifact> sOpenArts = new HashSet<Artifact>();
		Set<Artifact> sReadyArts = new HashSet<Artifact>();
		Set<Artifact> sUnassignedArts = new HashSet<Artifact>();
		Map<StakeHolder,Set<Artifact>> mOpenArts = new HashMap<StakeHolder, Set<Artifact>>();
		Map<StakeHolder,Set<Artifact>> mReadyArts = new HashMap<StakeHolder, Set<Artifact>>();
		for (Artifact art:sAllArts) {
			StakeHolder shArt = HierarchyModel.getStakeHolderSuper(art);
			if (shArt==null) {
				sUnassignedArts.add(art);
			}
			if (getProjectStatusSuper(art)!=ProcessStatus.DONE) {
				sOpenArts.add(art);
				if (shArt!=null) {
					addToMap(mOpenArts,shArt,art);
				}
			}
			if (getProjectStatusSuper(art)==ProcessStatus.READY) {
				sReadyArts.add(art);
				if (shArt!=null) {
					addToMap(mReadyArts,shArt,art);
				}
			}
		}
		lRes.add("Artifacts DONE: "+(sAllArts.size()-sOpenArts.size())+" (out of "+sAllArts.size()+"): ="+df.format((sAllArts.size()-sOpenArts.size())*100.0/sAllArts.size())+"%");
		if (sUnassignedArts.size()>0) {
			lRes.add("Unassigned Artifacts:"+sUnassignedArts.size());
			for (Artifact art:sUnassignedArts) {
				lRes.add("Unassigned: "+art.getName());
			}
		}
		lRes.add("Artifacts OPEN:"+sOpenArts.size());
		lRes.add("Artifacts READY:"+sReadyArts.size());
		for (StakeHolder sh:mReadyArts.keySet()) {
			Set<Artifact> sArtsForSH=mReadyArts.get(sh);
			lRes.add("StakeHolder: "+sh.getName()+" has "+sArtsForSH.size()+" ready artifacts");
			for (Artifact pm:sArtsForSH) {
				lRes.add("READY for "+sh.getName()+":"+pm.getName());
			}
		}
		return lRes;
	}

	private static void addToMap(Map<StakeHolder, Set<ProcessModule>> mPMs, StakeHolder sh, ProcessModule pm) {
		if (!mPMs.containsKey(sh)) {
			Set<ProcessModule> s=new HashSet<ProcessModule>();
			mPMs.put(sh, s);
		}
		mPMs.get(sh).add(pm);
	}
	private static void addToMap(Map<StakeHolder, Set<Artifact>> mArts, StakeHolder sh, Artifact pm) {
		if (!mArts.containsKey(sh)) {
			Set<Artifact> s=new HashSet<Artifact>();
			mArts.put(sh, s);
		}
		mArts.get(sh).add(pm);
	}

	/** Excel interface of Status */
	/******************************/

	private static List<String> getParamTabHeader() {
		List<String> lHeader=new LinkedList<String>();
		lHeader.add("Type"); // TAB_TYPE
		lHeader.add("Name"); // TAB_NAME
		lHeader.add("State"); // TAB_STATE
		lHeader.add("ID"); // TAB_ID
		lHeader.add("Qualified Name"); // TAB_QUALNAME
		lHeader.add("Description"); // TAB_DESCRIPTION
		lHeader.add("Effort"); // TAB_EFFORT
		lHeader.add("Progress"); // TAB_PROGRESS
		lHeader.add("Planned Start"); // TAB_START
		lHeader.add("Planned End"); // TAB_END
		return lHeader;
	}

	public static Map<String,List<List<String>>> exportToExcel(ProcessModule named) throws Exception {
		Map<String,List<List<String>>> mResult = new HashMap<String, List<List<String>>>();
		Set<ProcessModule> sAllModules = HierarchyModel.getAllProcessModulesWithRecursionCheck(named);
		Set<ProcessModule> sActive=new HashSet<ProcessModule>();
		for (ProcessModule p:sAllModules) {
			if (!DeactivationModel.getDeactivatedSuper(p, named) &&
					VariantModel.isActive(p, named)!=ACTIVATION.ACTIVE_NEVER ) {
				sActive.add(p);
			}
		}
		Set<Artifact> sArtifacts = new HashSet<Artifact>();
		for (ProcessModule p:sActive) {
			for (Artifact a:p.getInputArtifacts()) {
				if (!DeactivationModel.getDeactivatedSuper(a, named) &&
						VariantModel.isActive(a, named)!=ACTIVATION.ACTIVE_NEVER ) {
					sArtifacts.add(a);
				}
			}
			for (Artifact a:p.getOutputArtifacts()) {
				if (!DeactivationModel.getDeactivatedSuper(a, named) &&
						VariantModel.isActive(a, named)!=ACTIVATION.ACTIVE_NEVER ) {
					sArtifacts.add(a);
				}
			}
		}
		// now add the elements to the excel tab
		List<List<String>> lTabParam= new LinkedList<List<String>>();
		mResult.put(TAB_NAME_STATUS, lTabParam);
		lTabParam.add(getParamTabHeader());
		// first add Artifacts
		// sort them using qual-IDs
		List<Artifact> lAs=new LinkedList<Artifact>(sArtifacts);
		Collections.sort(lAs, new Comparator<Artifact>() {
			@Override
			public int compare(Artifact o1, Artifact o2) {
				return getQualName(o1).compareTo(getQualName(o2));
			}
		});
		for (Artifact a:lAs) {
			List<String> lRow=new LinkedList<String>();
			lTabParam.add(lRow);
			lRow.add("Artifact");
			lRow.add(a.getName());
			lRow.add(a.getStatus().getName());
			lRow.add(a.getID());
			lRow.add(getQualName(a));
			lRow.add(a.getDescription());
			lRow.add(""); // no effort for documents
			lRow.add(""); // no progress for documents
			lRow.add(""); // no start for documents
			lRow.add(""); // no end for documents
		}
		// then add PMs
		// sort them using qual-IDs
		List<ProcessModule> lPs=new LinkedList<ProcessModule>(sActive);
		Collections.sort(lPs, new Comparator<ProcessModule>() {
			@Override
			public int compare(ProcessModule o1, ProcessModule o2) {
				return getQualName(o1).compareTo(getQualName(o2));
			}
		});
		for (ProcessModule pm:lPs) {
			List<String> lRow=new LinkedList<String>();
			lTabParam.add(lRow);
			if (pm instanceof VerificationModule) {
				lRow.add("VerificationModule");
			} else {
				lRow.add("ProcessModule");
			}

			lRow.add(pm.getName());
			lRow.add(pm.getStatus().getName());
			lRow.add(pm.getID());
			lRow.add(getQualName(pm));
			lRow.add(pm.getDescription());
			String sEff=formatExcelHelper(""+pm.getEffort());
			// System.out.println("exporting effort for "+pm.getName()+":"+sEff);
			lRow.add(sEff); 
			lRow.add(formatExcelHelper(""+pm.getProgress()));
			if (pm.getPlannedEndDate()!=null) {
				lRow.add(""+pm.getPlannedEndDate()); 
			} else {
				lRow.add("");
			}
			if (pm.getPlannedStartDate()!=null) {
				lRow.add(""+pm.getPlannedStartDate()); 
			} else {
				lRow.add("");
			}
		}
		return mResult;
	}

	// helper to do some excel formating (float numbers are interpreted from Excel-Exporter :-(
	private static String formatExcelHelper(String sInput) {
		if (sInput.endsWith(".0")) {
			return sInput.substring(0,sInput.length()-2);
		}
		return "'"+sInput;
	}
	private static String getQualName(Artifact a) {
		if (a.eContainer() instanceof Artifact) {
			return getQualName((Artifact)a.eContainer())+"."+a.getName();
		}
		if (a.eContainer() instanceof Process) {
			return a.getName();
		}
		if (a.eContainer() instanceof ProcessModule) {
			return getQualName((ProcessModule)a.eContainer())+"."+a.getName();
		}
		return "unknown case in getQualName1("+a.getName()+"): "+a.eContainer().eClass().getName();
	}
	private static String getQualName(ProcessModule a) {
		if (a.eContainer() instanceof ProcessModule) {
			return getQualName((ProcessModule)a.eContainer())+"."+a.getName();
		}
		if (a.eContainer() instanceof Process) {
			return a.getName();
		}
		if (a.eContainer() instanceof ProcessModule) {
			return getQualName((ProcessModule)a.eContainer())+"."+a.getName();
		}
		return "unknown case in getQualName2("+a.getName()+"): "+a.eContainer().eClass().getName();
	}

	/** Excel import of status */
	public static int importStatusFromExcel(ProcessModule selected, Map<String, List<List<String>>> neu,
			List<String> logs) {
		int iSum=0;
		if (!neu.containsKey(TAB_NAME_STATUS)) {
			logs.add("ERROR no tab '"+TAB_NAME_STATUS+"' found in opened file. Aborting.");
			return -1;
		}
		List<List<String>> lLines = neu.get(TAB_NAME_STATUS);
		logs.add("Processing "+(lLines.size()-1)+" status lines:");
		int iRow=0;
		for (List<String>lRow:lLines) {
			iRow++;
			if (iRow>1) { // skip table header
				// check for mandatory elements
				if (lRow.size()<=TAB_TYPE) {
					logs.add("Warning in row "+iRow+": no type entry (column:"+TAB_TYPE+") found in "+lRow+": ignoring line.");
					continue;
				}
				String sType=lRow.get(TAB_TYPE-1);
				if (lRow.size()<=TAB_NAME) {
					logs.add("Warning in row "+iRow+": no name entry (column:"+TAB_NAME+") found in "+lRow+": ignoring line.");
					continue;
				}
				String sName=lRow.get(TAB_NAME-1);
				if (lRow.size()<=TAB_STATE) {
					logs.add("Warning in row "+iRow+": no state entry (column:"+TAB_STATE+") found in "+lRow+": ignoring line.");
					continue;
				}
				String sState=lRow.get(TAB_STATE-1);
				ProcessStatus psState=null;
				if (sState.equalsIgnoreCase("defined")) {
					psState=ProcessStatus.DEFINED;
				} else if (sState.equalsIgnoreCase("done")) {
					psState=ProcessStatus.DONE;
				} else if (sState.equalsIgnoreCase("ready")) {
					psState=ProcessStatus.READY;
				} else if (sState.equalsIgnoreCase("in_progress")) {
					psState=ProcessStatus.IN_PROGRESS;
				} else if (sState.equalsIgnoreCase("planned")) {
					psState=ProcessStatus.PLANNED;
				} else {
					logs.add("Warning in row "+iRow+": invalid state "+sState+" found. Allowed states are: DEFINED,DONE,READY,IN_PROGRESS,PLANNED. Ignoring line.");
					continue;
				}
				if (lRow.size()<=TAB_QUALNAME) {
					logs.add("Warning in row "+iRow+": no qualified name entry (column:"+TAB_QUALNAME+") found in "+lRow+": ignoring line.");
					continue;
				}
				String sQualName=lRow.get(TAB_QUALNAME-1);
				// getting optional information
				String sID="";
				if (lRow.size()>=TAB_ID && lRow.get(TAB_ID-1)!=null) {
					sID=lRow.get(TAB_ID-1);
				}
				String sDescription="";
				if (lRow.size()>=TAB_DESCRIPTION && lRow.get(TAB_DESCRIPTION-1)!=null) {
					sDescription=lRow.get(TAB_DESCRIPTION-1);
				}
				String sEffort="";
				float fEffort=0;
				if (lRow.size()>=TAB_EFFORT && lRow.get(TAB_EFFORT-1)!=null) {
					sEffort=lRow.get(TAB_EFFORT-1);
					if (!sEffort.equals("")) {
						try {
							fEffort=Float.parseFloat(sEffort);
						} catch(NumberFormatException nfe) {
							logs.add("Warning in row "+iRow+": invalid float effort value "+sEffort+":"+nfe.getMessage()+". Ignoring value.");
						}
					}
				}
				String sProgress="";
				float fProgress=0;
				if (lRow.size()>=TAB_PROGRESS && lRow.get(TAB_PROGRESS-1)!=null) {
					sProgress=lRow.get(TAB_PROGRESS-1);
					if (!sProgress.equals("")) {
						try {
							fProgress=Float.parseFloat(sProgress);
						} catch(NumberFormatException nfe) {
							logs.add("Warning in row "+iRow+": invalid float progress value "+sProgress+":"+nfe.getMessage()+". Ignoring value.");
						}
					}
				}
				String sStart="";
				if (lRow.size()>=TAB_START && lRow.get(TAB_START-1)!=null) {
					sStart=lRow.get(TAB_START-1);
				}
				String sEnd="";
				if (lRow.size()>=TAB_END && lRow.get(TAB_END-1)!=null) {
					sEnd=lRow.get(TAB_END-1);
				}
				// now search the element and update it
				if (sType.equalsIgnoreCase("artifact")) {
					Artifact aFound = findArtifact(selected,sQualName,selected);
					if (aFound==null) {
						logs.add("Warning in row "+iRow+": cannot find Artifact "+sQualName+". Ignoring");
						// OS: do not try to create a new one, since this would make the process inconsistent
					} else {
						if (aFound.getStatus()!=psState) {
							iSum++;
							logs.add("Update "+iSum+" status of artifact "+aFound.getName()+" from "+aFound.getStatus()+" to "+psState);
							aFound.setStatus(psState);
						}
						if (!sName.equals(aFound.getName()) && aFound.getName()!=null) {
							iSum++;
							logs.add("Update "+iSum+" Name of artifact "+aFound.getName()+" from "+aFound.getName()+" to "+sName);
							aFound.setName(sName);
						}
						if (!sID.equals(aFound.getID()) && aFound.getID()!=null) {
							iSum++;
							logs.add("Update "+iSum+" ID of artifact "+aFound.getName()+" from "+aFound.getID()+" to "+sID);
							aFound.setID(sID);
						}
						if (!sDescription.equals(aFound.getDescription()) && aFound.getDescription()!=null) {
							iSum++;
							logs.add("Update "+iSum+" Description of artifact "+aFound.getName()+" from "+aFound.getDescription()+" to "+sDescription);
							aFound.setDescription(sDescription);
						}
						// other values (effort,progress,start,end) cannot be set for Artifacts
					}
				} else if (sType.equalsIgnoreCase("VerificationModule")
						|| sType.equalsIgnoreCase("ProcessModule")){ 
					ProcessModule pmFound = findProcessModule(selected,sQualName,selected);
					if (pmFound==null) {
						logs.add("Warning in row "+iRow+": cannot find ProcessModule "+sQualName+". Ignoring");
						// OS: do not try to create a new one, since this would make the process inconsistent
					} else {
						if (pmFound.getStatus()!=psState) {
							iSum++;
							logs.add("Update "+iSum+" status of ProcessModule "+pmFound.getName()+" from "+pmFound.getStatus()+" to "+psState);
							pmFound.setStatus(psState);
						}
						if (!sName.equals(pmFound.getName()) && pmFound.getName()!=null) {
							iSum++;
							logs.add("Update "+iSum+" Name of ProcessModule "+pmFound.getName()+" from "+pmFound.getName()+" to "+sName);
							pmFound.setName(sName);
						}
						if (!sID.equals(pmFound.getID()) && pmFound.getID()!=null) {
							iSum++;
							logs.add("Update "+iSum+" ID of ProcessModule "+pmFound.getName()+" from "+pmFound.getID()+" to "+sID);
							pmFound.setID(sID);
						}
						if (!sDescription.equals(pmFound.getDescription()) && pmFound.getDescription()!=null) {
							iSum++;
							logs.add("Update "+iSum+" Description of ProcessModule "+pmFound.getName()+" from "+pmFound.getDescription()+" to "+sDescription);
							pmFound.setDescription(sDescription);
						}
						// set other values: effort,progress,start,end
						if (fEffort!=pmFound.getEffort()) {
							iSum++;
							logs.add("Update "+iSum+" Effort of ProcessModule "+pmFound.getName()+" from "+pmFound.getEffort()+" to "+fEffort);
							pmFound.setEffort(fEffort);
						}
						if (fProgress!=pmFound.getProgress()) {
							iSum++;
							logs.add("Update "+iSum+" Progress of ProcessModule "+pmFound.getName()+" from "+pmFound.getProgress()+" to "+fProgress);
							pmFound.setProgress(fProgress);
						}
						if (!sStart.equals(pmFound.getPlannedStartDate()) && pmFound.getPlannedStartDate()!=null) {
							iSum++;
							logs.add("Update "+iSum+" PlannedStartDate of ProcessModule "+pmFound.getName()+" from "+pmFound.getPlannedStartDate()+" to "+sStart);
							pmFound.setPlannedStartDate(sStart);
						}
						if (!sEnd.equals(pmFound.getPlannedEndDate()) && pmFound.getPlannedEndDate()!=null) {
							iSum++;
							logs.add("Update "+iSum+" PlannedEndDate of ProcessModule "+pmFound.getName()+" from "+pmFound.getPlannedEndDate()+" to "+sEnd);
							pmFound.setPlannedEndDate(sEnd);
						}
					}

				} else {
					logs.add("Warning: unknown type '"+sType+" found in row "+iRow+". Expecting Artifact, ProcessModule or VerificationModule. Ignoring");
				}
			}
		}
		if (iSum>0) {
			logs.add(1, "Updated "+iSum+" states. Please save your model.");
		}
		return iSum;
	}

	private static ProcessModule findProcessModule(ProcessModule selected, String sQualName,Named nScope) {
		return findProcessModule(selected,sQualName,nScope,true);
	}

	private static ProcessModule findProcessModule(ProcessModule selected, String sQualName,Named nScope,boolean bStartWithProcess) {
		if (bStartWithProcess) {
			Process pSuper = HierarchyModel.getProzessSuper(selected);
			String sFirst=getFirstQual(sQualName);
			for (ProcessModule pm:DeactivationModel.Process_getProcessModules(pSuper, nScope)) {
				if (sFirst.equals(pm.getName())) {
					String restQual = getRestQual(sQualName);
					if (restQual.equals("")) {
						return pm;
					}
					return findProcessModule(pm, restQual,nScope,false);
				}
			}
			return null;
		}
		String sFirst=getFirstQual(sQualName);
		for (ProcessModule pm:DeactivationModel.ProcessModule_getSubModulesIncludingRefs(selected, nScope)) {
			if (sFirst.equals(pm.getName())) {
				String restQual = getRestQual(sQualName);
				if (restQual.equals("")) {
					return pm;
				}
				return findProcessModule(pm, restQual,nScope,false);
			}
		}
		return null;
	}

	private static Artifact findArtifact(ProcessModule selected, String sQualName, Named nScope) {
		return findArtifact(selected,sQualName,nScope,true);
	}

	private static Artifact findArtifact(ProcessModule selected, String sQualName,Named nScope, boolean bStartWithProcess) {
		String sFirst=getFirstQual(sQualName);
		if (bStartWithProcess) {
			Process pSuper = HierarchyModel.getProzessSuper(selected);
			for (Artifact a:DeactivationModel.Process_getArtifacts(pSuper, nScope)) {
				if (sFirst.equals(a.getName())) {
					String restQual = getRestQual(sQualName);
					if (restQual.equals("")) {
						return a;
					}
					return findArtifact(a, restQual,nScope);
				}
			}
			// search in processmodules for artifacts
			for (ProcessModule pm:DeactivationModel.Process_getProcessModules(pSuper, nScope)) {
				if (sFirst.equals(pm.getName())) {
					String restQual = getRestQual(sQualName);
					if (restQual.equals("")) {
						// process is not a valid artifact
						return null;
					}
					return findArtifact(pm, restQual,nScope,false);
				}
			}
			return null;
		}
		for (Artifact a:DeactivationModel.ProcessModule_getArtifacts(selected, nScope)) {
			if (sFirst.equals(a.getName())) {
				String restQual = getRestQual(sQualName);
				if (restQual.equals("")) {
					return a;
				}
				return findArtifact(a, restQual,nScope);
			}
		}
		// search in processmodules for artifacts
		for (ProcessModule pm:DeactivationModel.ProcessModule_getSubModulesIncludingRefs(selected, nScope)) {
			if (sFirst.equals(pm.getName())) {
				String restQual = getRestQual(sQualName);
				if (restQual.equals("")) {
					// process is not a valid artifact
					return null;
				}
				return findArtifact(pm, restQual,nScope,false);
			}
		}
		return null;
	}

	private static Artifact findArtifact(Artifact selected, String sQualName, Named nScope) {
		String sFirst=getFirstQual(sQualName);
		for (Artifact pm:DeactivationModel.Artifact_getSubArtifacts(selected, nScope)) {
			if (sFirst.equals(pm.getName())) {
				String restQual = getRestQual(sQualName);
				if (restQual.equals("")) {
					return pm;
				}
				return findArtifact(pm, restQual,nScope);
			}
		}
		return null;
	}

	private static String getFirstQual(String sQualName) {
		if (sQualName.indexOf(".")>0) {
			return sQualName.substring(0, sQualName.indexOf("."));
		}
		return sQualName;
	}
	private static String getRestQual(String sQualName) {
		if (sQualName.indexOf(".")>0) {
			return sQualName.substring(sQualName.indexOf(".")+1);
		}
		return "";
	}

}
