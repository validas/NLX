/**
 * 
 */
package de.validas.pmt.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.Criterion;
import metaModel.referenceProcess.IVerified;
import metaModel.referenceProcess.Model;
import metaModel.referenceProcess.Process;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.Requirement;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.VerificationModule;
import metaModel.suptertype.Named;
import metaModel.suptertype.Variantable;
import metaModel.terms.Binding;
import metaModel.terms.Parameter;
import metaModel.terms.PlanningParameter;
import metaModel.terms.ProcessParameter;
import metaModel.terms.ProcessVariable;
import metaModel.terms.ProjectParameter;
import metaModel.terms.Type;

/**
 * @author slotosch
 * hierarchic model routines
 */
public class HierarchyModel {

	public static Set<ProcessModule> getAllProcesses(ProcessModule pm) {
		Set<ProcessModule> sRes = new HashSet<ProcessModule>();
		sRes.add(pm);
		for (ProcessModule pmSub:pm.getSubProcessModules()) {
			sRes.addAll(getAllProcesses(pmSub));
		}
		for (ProcessModule pmSub:pm.getSubProcessModuleReferences()) {
			if (!sRes.contains(pmSub)) {
				// occurs check  might not suffice for models referencing their own super-processes
				sRes.addAll(getAllProcesses(pmSub));
			}
		}
		return sRes;
	}

	/** return the contained and referenced procces modules */
	public static Set<ProcessModule> getProcesses(ProcessModule pm) {
		Set<ProcessModule> sRes = new HashSet<ProcessModule>();
		sRes.addAll(pm.getSubProcessModules());
		sRes.addAll(pm.getSubProcessModuleReferences());
		return sRes;
	}

	/** return the stakeholders of the contained and referenced procces modules */
	public static Set<StakeHolder> getStakeHoldersForProcesses(ProcessModule pm,int limit) {
		Set<StakeHolder> sRes = new HashSet<StakeHolder>();
		for (ProcessModule pmSub:getProcesses(pm)) {
			sRes.add(getStakeHolderSuper(pmSub,limit));
		}
		return sRes;
	}

	/** return the stakeholders of the contained and referenced proccess modules */
	public static Set<StakeHolder> getStakeHoldersForProcesses(ProcessModule pm) {
		return getStakeHoldersForProcesses(pm,-1);
	}

	public static StakeHolder getStakeHolderSuper(ProcessModule pmRoot,int limit) {
		if (pmRoot.getStakeHolder()!=null) {
			return pmRoot.getStakeHolder();
		}
		if (limit==0) {
			return null;
		}
		if (pmRoot.eContainer() instanceof ProcessModule) {
			StakeHolder shRes =  getStakeHolderSuper((ProcessModule)pmRoot.eContainer(),limit-1);
			if (shRes!=null) {
				return shRes;
			}
		}
		// System.err.println("no Stakeholder found for "+pmRoot.getName());
		return null;
	}
	public static StakeHolder getStakeHolderSuper(ProcessModule pmRoot) {
		return getStakeHolderSuper(pmRoot,-1);
	}
	public static Set<StakeHolder> getAllStakeHolders(ProcessModule pmRoot) {
		Set<StakeHolder> sRes = new HashSet<StakeHolder>();
		Set<ProcessModule> sPMs = getAllProcesses(pmRoot);
		for (ProcessModule pm:sPMs) {
			sRes.addAll(pm.getInvolvedStakeHolders());
			if (pm.getStakeHolder()!=null) {
				sRes.add(pm.getStakeHolder());
			}
		}
		return sRes;
	}
	/** returns all process that create this artifact or an artifact that contains this */
	public static Map<ProcessModule,Artifact> getAllCreatedByProcessModules(Artifact art) {
		Map<ProcessModule,Artifact> mRes= new HashMap<ProcessModule, Artifact>();
		for (ProcessModule p:art.getCreatedByProcessModules()) {
			mRes.put(p, art);
		}
		for (Artifact a:getAllIncludingArtifacs(art)) {
			for (ProcessModule p:a.getCreatedByProcessModules()) {
				mRes.put(p,a);
			}
		}
		return mRes;
	}

	/** returns all process that use this artifact or an artifact that contains this */
	public static Map<ProcessModule,Artifact> getAllReadByProcessModules(Artifact art) {
		Map<ProcessModule,Artifact> mRes= new HashMap<ProcessModule, Artifact>();
		for (ProcessModule p:art.getReadByProcessModules()) {
			mRes.put(p, art);
		}
		for (Artifact a:getAllIncludingArtifacs(art)) {
			for (ProcessModule p:a.getReadByProcessModules()) {
				mRes.put(p,a);
			}
		}
		return mRes;
	}

	/** all other processes that contribute to inputs with their artifacts */
	public static Map<Artifact, ProcessModule> getAllInputsFromArtifact(ProcessModule pm) {
		Map<Artifact, ProcessModule> mRes= new HashMap<Artifact, ProcessModule>();
		for (Artifact a:pm.getInputArtifacts()) {
			mRes.put(a,pm);
		}
		if (pm.eContainer() instanceof ProcessModule) {
			mRes.putAll(getAllInputsFromArtifact((ProcessModule)pm.eContainer()));
		}
		return mRes;
	}

	/** all other processes that contribute to outputs with their artifacts */
	public static Map<Artifact, ProcessModule> getAllOutputsFromArtifact(ProcessModule pm) {
		Map<Artifact, ProcessModule> mRes= new HashMap<Artifact, ProcessModule>();
		for (Artifact a:pm.getOutputArtifacts()) {
			mRes.put(a,pm);
		}
		if (pm.eContainer() instanceof ProcessModule) {
			mRes.putAll(getAllOutputsFromArtifact((ProcessModule)pm.eContainer()));
		}
		return mRes;
	}


	public static Set<Model> getAllIncludingModels(Model model) {
		Set<Model> sResult = new HashSet<Model>();
		sResult.addAll(model.getIncludes());
		for (Model mI:model.getIsIncludedIn()) {
			if (!MMUtils.isCyclic(mI)) {
				sResult.addAll(getAllIncludingModels(mI));
			}
		}
		return sResult;
	}

	public static Set<Artifact> getAllIncludingArtifacs(Artifact art) {
		Set<Artifact> sResult = new HashSet<Artifact>();
		sResult.add(art);
		sResult.addAll(art.getReferedByArtifacts());
		for (Artifact aI:art.getReferedByArtifacts()) {
			if (!MMUtils.isCyclic(aI)) {
				sResult.addAll(getAllIncludingArtifacs(aI));
			}
		}
		if (art instanceof Model) {
			for (Model mI:((Model)art).getIsIncludedIn()) {
				if (!MMUtils.isCyclic(mI)) {
					sResult.addAll(getAllIncludingArtifacs(mI));
				}
			}
		}
		return sResult;
	}

	public static Set<Artifact> getAllArtifacts(ProcessModule pmRoot) {
		Set<Artifact> sRes = new HashSet<Artifact>();
		Set<ProcessModule> sPMs = getAllProcesses(pmRoot);
		for (ProcessModule pm:sPMs) {
			for (Artifact a:pm.getInputArtifacts()) {
				sRes.addAll(getAllArtifacts(a));
			}
			for (Artifact a:pm.getOutputArtifacts()){
				sRes.addAll(getAllArtifacts(a));
			}
		}
		// now check for included artifacts (and references)
		Set<Artifact> sIncluded = new HashSet<Artifact>();

		for (Artifact a:sRes) {
			// System.out.println("checking artifact "+a.getName()+" for PM "+pmRoot.getName());
			if (a instanceof Model) {
				Model mod=(Model) a;
				for (Model m:mod.getIncludes()) {
					if (!isContainedInArtifact(sRes, m) && !isContainedInArtifact(sIncluded, m)) {
						sIncluded.addAll(getAllArtifacts(m));
					}
				}
			}
			sIncluded.addAll(a.getSubArtifactReferences());
		}
		sRes.addAll(sIncluded);
		// remove elements that are contained in others
		Set<Artifact> sToRemove = new HashSet<Artifact>();
		for (Artifact a:sRes) {
			if (getRootArtifactInArtefacts(sRes, a)!=a) {
				// found an element containing a->remove
				sToRemove.add(a);
			}
		}
		sRes.removeAll(sToRemove);
		return sRes;
	}

	/** returns the root artifact in the set of artifacts, or null if not contained */
	public static Artifact getRootArtifactInArtefacts(Set<Artifact> sRoot, Artifact art) {
		if (art.eContainer() instanceof Artifact) {
			Artifact aRoot= getRootArtifactInArtefacts(sRoot, (Artifact)art.eContainer());
			if (aRoot!=null) {
				return aRoot;
			}
		}
		if (sRoot.contains(art)) {
			return art;
		}
		return null;
	}
	/** checks if a is contained in a Root (does not include references) */
	public static boolean isContainedInArtefact(Artifact aRoot,Artifact a) {
		if (a==aRoot) {
			return true;
		}
		if (a.eContainer() instanceof Artifact) {
			return isContainedInArtefact(aRoot, ((Artifact)a.eContainer()));
		}
		return false;
	}
	/** checks if a is contained in a Root (does not include references) */
	public static boolean isContainedInArtifact(Set<Artifact> sRoot,Artifact art) {
		for (Artifact a:sRoot) {
			if (isContainedInArtefact(a,art)) {
				return true;
			}
		}
		return false;
	}
	public static Process getProzessSuper(Named pm) {
		if (pm instanceof Process) {
			return (Process)pm;
		}
		if (pm.eContainer() instanceof Process) {
			return (Process)pm.eContainer();
		}
		if (pm.eContainer() instanceof Named) {
			return getProzessSuper((Named)pm.eContainer());
		}
		String sSuper="";
		if (pm.eContainer()!=null) {
			String sSup="";
			if (pm.eContainer() instanceof EObject) {
				sSup=((EObject)pm.eContainer()).eClass().getName();
			} else {
				sSup=pm.eContainer().getClass().getSimpleName();
			}
			sSuper=" ("+pm.eClass().getName()+" in "+sSup+")";
		}
		System.err.println("cannot find Super-Prozess for "+pm.getName()+sSuper);
		return null;
	}
	/** returns the root artifact in the set of artifacts, or null if not contained */
	public static Requirement getRootRequirementInRequirements(Set<Requirement> sRoot, Requirement art) {
		if (art.eContainer() instanceof Requirement) {
			Requirement aRoot= getRootRequirementInRequirements(sRoot, (Requirement)art.eContainer());
			if (aRoot!=null) {
				return aRoot;
			}
		}
		if (sRoot.contains(art)) {
			return art;
		}
		return null;
	}
	/** checks if a is contained in a Root (does not include references) */
	public static boolean isContainedInRequirement(Requirement aRoot,Requirement a) {
		if (a==aRoot) {
			return true;
		}
		if (a.eContainer() instanceof Requirement) {
			return isContainedInRequirement(aRoot, ((Requirement)a.eContainer()));
		}
		return false;
	}
	/** checks if a is contained in a Root (does not include references) */
	public static boolean isContainedInRequirement(Set<Requirement> sRoot,Requirement art) {
		for (Requirement a:sRoot) {
			if (isContainedInRequirement(a,art)) {
				return true;
			}
		}
		return false;
	}

	/** computes all claims of the process module */
	public static Map<ProcessModule, Set<Requirement>> getRequirementClaims(ProcessModule pm) {
		Map<ProcessModule, Set<Requirement>> mResult = new HashMap<ProcessModule, Set<Requirement>>();
		for (ProcessModule p:getAllProcesses(pm) ) {
			if (p.getClaimedComplianceRequirements().size()>0) {
				Set<Requirement> s= new HashSet<Requirement>();
				s.addAll(p.getClaimedComplianceRequirements());
				mResult.put(p, s);
			}
		}
		return mResult;
	}

	public static Set<IVerified> getAllVerifiedInputs(VerificationModule vm) {
		Set<IVerified> sRes=new HashSet<IVerified>();
		sRes.addAll(vm.getVerifies());
		if (vm.eContainer() instanceof VerificationModule) {
			sRes.addAll(getAllVerifiedInputs((VerificationModule)vm.eContainer()));
		}
		return sRes;
	}
	/**
	 * returns all inputs as follows: if some are found those are the relevant ones, otherwise the containing process is checked
	 * @param vm
	 * @return
	 */
	public static Set<Artifact> getAllVerifiedInputArtifacts(ProcessModule vm) {
		Set<Artifact> sRes=new HashSet<Artifact>();
		for (IVerified iv:vm.getVerifies()) {
			if (iv instanceof Artifact) {
				sRes.add((Artifact)iv);
			}
		}
		if (sRes.size()>0) {
			return sRes;
		}
		if (vm.eContainer() instanceof ProcessModule) {
			sRes.addAll(getAllVerifiedInputArtifacts((ProcessModule)vm.eContainer()));
		}
		return sRes;
	}

	/**
	 * returns all paths (in case the size of this set is one the artifacts can be checked together)
	 * @param vm
	 * @return
	 */
	public static Set<String> getAllVerifiedInputArtifactPaths(ProcessModule vm) {
		Set<String> sRes=new HashSet<String>();
		for (Artifact a:getAllVerifiedInputArtifacts(vm)) {
			String sP=getPathSuper(a);
			sRes.add(sP);
		}
		return sRes;
	}

	/**
	 * returns all paths (in case the size of this set is one the artifacts can be checked together)
	 * @param vm
	 * @return
	 */
	public static Map<String,Set<Artifact>> getAllVerifiedInputArtifactPathMaps(ProcessModule vm) {
		Map<String, Set<Artifact>> mRes=new HashMap<String, Set<Artifact>>();
		for (Artifact a:getAllVerifiedInputArtifacts(vm)) {
			String sP=getPathSuper(a);
			if (!mRes.containsKey(sP)) {
				mRes.put(sP, new HashSet<Artifact>());
			}
			mRes.get(sP).add(a);
		}
		return mRes;
	}

	/**
	 * returns the artifact name (together with it's containing artifact), e.g. "FeatureModel (in TCA Model (in QKit))"
	 * if there is a root (!=null) then this can be the end, e.g. "FeatureModel (in TCAModel)"
	 * @param a: the artifact
	 * @return the qualified artifact name
	 */
	public static String getQualArtifactName(Artifact a,Artifact aRoot) {
		String sRes = a.getName();
		if (a!=aRoot && a.eContainer() instanceof Artifact) {
			sRes+= " (in "+getQualArtifactName((Artifact)a.eContainer(),aRoot)+")";
		}
		return sRes;
	}
	/**
	 * returns the Requirement name (together with it's containing Requirement), e.g. "FeatureModel in TCA Model in QKit"
	 * @param a: the Requirement
	 * @return the qualified Requirement name
	 */
	public static String getQualRequirementName(Requirement a) {
		return getQualRequirementName(a, null);
	}

	/**
	 * returns Qualified Name
	 * @return the full qualified name
	 */
	public static String getQualName(Named a) {
		if (a.eContainer() instanceof Named) {
			String sN=a.getName();
			if (a instanceof Requirement && ((Requirement)a).getID()!=null) {
				sN=((Requirement)a).getID();
			}
			return getQualName((Named)a.eContainer())+" / "+ sN; 
		}
		return a.getName(); 
	}

	/**
	 * returns Qualified Name
	 * @return the full qualified name
	 */
	public static String getQualName(Named a, Named nScope) {
		if (a==nScope) {
			return "";
		}
		if (a.eContainer() instanceof Named) {
			String sQ=  getQualName((Named)a.eContainer(),nScope);
			String sN=a.getName();
			if (a instanceof Requirement && ((Requirement)a).getID()!=null) {
				sN=((Requirement)a).getID();
			}
			if (sQ.equals("")) {
				return sN;
			}
			return sQ+" / "+sN; 
		}
		return a.getName(); 
	}

	/**
	 * returns the Requirement name (together with it's containing Requirement), e.g. "FeatureModel (in TCA Model (in QKit))"
	 * if there is a root (!=null) then this can be the end, e.g. "FeatureModel (in TCAModel)"
	 * @param a: the Requirement
	 * @return the qualified Requirement name
	 */
	public static String getQualRequirementName(Requirement a,Requirement aRoot) {
		String sRes = a.getName();
		if (a!=aRoot && a.eContainer() instanceof Requirement) {
			sRes+= " (in "+getQualRequirementName((Requirement)a.eContainer(),aRoot)+")";
		}
		return sRes;
	}
	/**
	 * returns the ProcessModule name (together with it's containing ProcessModule), e.g. "FeatureModel in TCA Model in QKit"
	 * @param a: the ProcessModule
	 * @return the qualified ProcessModule name
	 */
	public static String getQualProcessModuleName(ProcessModule a) {
		return getQualProcessModuleName(a, null);
	}

	/**
	 * returns the ProcessModule name (together with it's containing ProcessModule), e.g. "FeatureModel (in TCA Model (in QKit))"
	 * if there is a root (!=null) then this can be the end, e.g. "FeatureModel (in TCAModel)"
	 * @param a: the ProcessModule
	 * @return the qualified ProcessModule name
	 */
	public static String getQualProcessModuleName(ProcessModule a,ProcessModule aRoot) {
		String sRes = a.getName();
		if (a!=aRoot && a.eContainer() instanceof ProcessModule) {
			sRes+= " (in "+getQualProcessModuleName((ProcessModule)a.eContainer(),aRoot)+")";
		}
		return sRes;
	}
	/**
	 * returns the artifact name (together with it's containing artifact), e.g. "FeatureModel in TCA Model in QKit"
	 * @param a: the artifact
	 * @return the qualified artifact name
	 */
	public static String getQualArtifactName(Artifact a) {
		return getQualArtifactName(a, null);
	}
	/**
	 * computes all super artifacts (eContainers)
	 */
	public static Set<Artifact> getSuperArtifacts(Artifact a) {
		Set<Artifact> sRes= new HashSet<Artifact>();
		if (a.eContainer() instanceof Artifact) {
			Artifact aParent = (Artifact)a.eContainer();
			sRes.add(aParent);
			sRes.addAll(getSuperArtifacts(aParent));
		}
		return sRes;
	}

	/** 
	 * returns checks if the artifact is cyclic, i.e. contained in itself
	 */
	public static boolean isCyclicArtifact(Artifact a) {
		try {
			getAllArtifactsWithRecursionCheck(a);
			return false;
		} catch(Exception ex) {
			return true;
		}
	}

	/** 
	 * returns checks if the artifact is cyclic, i.e. contained in itself
	 */
	public static boolean isCyclicRequirement(Requirement a) {
		try {
			getAllRequirementsWithRecursionCheck(a);
			return false;
		} catch(Exception ex) {
			return true;
		}
	}

	/** 
	 * returns checks if the artifact is cyclic, i.e. contained in itself
	 */
	public static boolean isCyclicProcessModule(ProcessModule a) {
		try {
			getAllProcessModulesWithRecursionCheck(a);
			return false;
		} catch(Exception ex) {
			return true;
		}
	}

	/** computes the path of the artifact, if empty returns path of Super-Artifact */
	public static String getPathSuper(Artifact a) {
		if (a.getPath()!=null && !a.getPath().trim().equals("")) {
			return a.getPath();
		}
		if (a.eContainer() instanceof Artifact) {
			return getPathSuper((Artifact)a.eContainer());
		}
		return "";
	}


	/** checks if the element is deactivated */
	public static boolean getDeactivatedSuper(EObject eo) {
		if (eo instanceof Named && ((Named)eo).isDeactivated()) {
			return true;
		}
		if (eo.eContainer() instanceof EObject) {
			return getDeactivatedSuper((EObject)eo.eContainer());
		}
		return false;
	}

	/** returns all artifacts that are created from sub-processes and used from sub-processes of this process */
	public static Set<Artifact> getLocalArtifacts(ProcessModule pm) {
		Set<Artifact> sRes = new HashSet<Artifact>();
		Set<Artifact> sAll = new HashSet<Artifact>();
		Set<Artifact> sIns = new HashSet<Artifact>();
		Set<Artifact> sOuts = new HashSet<Artifact>();
		Set<ProcessModule> sAllPs= new HashSet<ProcessModule>();
		sAllPs.addAll(pm.getSubProcessModules());
		sAllPs.addAll(pm.getSubProcessModuleReferences());
		for (ProcessModule pSub:sAllPs) {
			sAll.addAll(pSub.getInputArtifacts());
			sIns.addAll(pSub.getInputArtifacts());
			sAll.addAll(pSub.getOutputArtifacts());
			sOuts.addAll(pSub.getOutputArtifacts());
		}
		for (Artifact a:sAll) {
			if (sIns.contains(a) && sOuts.contains(a)) {
				sRes.add(a);
			}
		}
		return sRes;
	}

	public static Set<Parameter> getAllParameters(ProcessModule pm) {
		Set<Parameter> sRes = new HashSet<Parameter>();
		sRes.addAll(pm.getParameters());
		sRes.addAll(pm.getParameterReferences());
		if (pm.eContainer() instanceof ProcessModule) {
			sRes.addAll(getAllParameters((ProcessModule)pm.eContainer()));
		}
		return sRes;
	}
	public static Set<Parameter> getAllParameters(Named prozess) {
		Set<Parameter> sRes = new HashSet<Parameter>();
		TreeIterator<EObject> ti=prozess.eAllContents();
		while (ti.hasNext()) {
			EObject eo=ti.next();
			if (eo instanceof Parameter) {
				sRes.add((Parameter)eo);
			}
		}
		return sRes;
	}
	public static Set<Binding> getAllBindings(Named prozess) {
		Set<Binding> sRes = new HashSet<Binding>();
		TreeIterator<EObject> ti=prozess.eAllContents();
		while (ti.hasNext()) {
			EObject eo=ti.next();
			if (eo instanceof Binding) {
				sRes.add((Binding)eo);
			}
		}
		return sRes;
	}
	public static Set<Variantable> getAllVariantablesWithConditions(Named prozess) {
		Set<Variantable> sRes = new HashSet<Variantable>();
		TreeIterator<EObject> ti=prozess.eAllContents();
		while (ti.hasNext()) {
			EObject eo=ti.next();
			if (eo instanceof Variantable && ((Variantable)eo).getVariants().size()>0) {
				sRes.add((Variantable)eo);
			}
		}
		return sRes;
	}

	public static Requirement getRequirementSuper(Compliance c) {
		if (c.eContainer() instanceof Requirement) {
			return (Requirement) c.eContainer();
		}
		if (c.eContainer() instanceof Compliance) {
			return getRequirementSuper((Compliance) c.eContainer());
		}
		System.err.println("no requirement forund for Compliance " + c.getName());
		return null;
	}

	public static Set<VerificationModule> getAllVerificationModules(Process prozess) {
		Set<VerificationModule> sRes = new HashSet<VerificationModule>();
		TreeIterator<EObject> ti=prozess.eAllContents();
		while (ti.hasNext()) {
			EObject eo=ti.next();
			if (eo instanceof VerificationModule) {
				sRes.add((VerificationModule)eo);
			}
		}
		return sRes;
	}

	public static Set<Type> getAllTypes(Process prozess) {
		Set<Type> sRes = new HashSet<Type>();
		TreeIterator<EObject> ti=prozess.eAllContents();
		while (ti.hasNext()) {
			EObject eo=ti.next();
			if (eo instanceof Type) {
				sRes.add((Type)eo);
			}
		}
		return sRes;
	}
	public static Set<ProcessParameter> getAllProcessParameters(Named process) {
		Set<ProcessParameter> sRes = new HashSet<ProcessParameter>();
		for (Parameter p:getAllParameters(process)) {
			if (p  instanceof ProcessParameter) {
				sRes.add((ProcessParameter)p);
			}
		}
		return sRes;
	}
	public static Set<ProcessVariable> getAllProcessVariables(Named process) {
		Set<ProcessVariable> sRes = new HashSet<ProcessVariable>();
		for (Parameter p:getAllParameters(process)) {
			if (p  instanceof ProcessVariable) {
				sRes.add((ProcessVariable)p);
			}
		}
		return sRes;
	}
	public static Set<PlanningParameter> getAllPlanningParameters(Named process) {
		Set<PlanningParameter> sRes = new HashSet<PlanningParameter>();
		for (Parameter p:getAllParameters(process)) {
			if (p  instanceof PlanningParameter) {
				sRes.add((PlanningParameter)p);
			}
		}
		return sRes;
	}
	public static Set<ProjectParameter> getAllProjectParameters(Named process) {
		Set<ProjectParameter> sRes = new HashSet<ProjectParameter>();
		for (Parameter p:getAllParameters(process)) {
			if (p  instanceof ProjectParameter) {
				sRes.add((ProjectParameter)p);
			}
		}
		return sRes;
	}

	/** computes all inputs (including super-inputs), but also the inputs to sub-components unless they are outputs from own sub-components */
	public static Set<Artifact> getAllInputs(ProcessModule pm) {
		Set<Artifact> sRes = getAllSuperInputs(pm);
		for (ProcessModule pmSub:pm.getSubProcessModules()) {
			sRes.addAll(getAllSubInputs(pmSub,getAllInputs(pm)));
		}
		for (ProcessModule pmSub:pm.getSubProcessModuleReferences()) {
			sRes.addAll(getAllSubInputs(pmSub,getAllInputs(pm)));
		}
		return sRes;
	}

	/**
	 * returns all inputs of this process (including the Super-Processes), currently does not consider inputs of referencing super processes
	 * @param pm
	 * @return
	 */
	public static Set<Artifact> getAllSuperOutputs(ProcessModule pm,int limit) {
		Set<Artifact> sRes = new HashSet<Artifact>();
		sRes.addAll(pm.getOutputArtifacts());
		if (limit==0) {
			return sRes;
		}
		if (pm.eContainer() instanceof ProcessModule) {
			ProcessModule pmHelp=(ProcessModule)pm.eContainer();
			if (pm.getInstanceOfProcessModule()==pmHelp && pmHelp.eContainer() instanceof ProcessModule) {
				// do not add generic artifact of instantiated modules
				pmHelp=(ProcessModule)pmHelp.eContainer();
			}
			sRes.addAll(getAllSuperOutputs(pmHelp,limit-1));
		}
		return sRes;
	}
	/**
	 * returns all inputs of this process (including the Super-Processes), currently does not consider inputs of referencing super processes
	 * @param pm
	 * @return
	 */
	public static Set<Artifact> getAllSuperOutputs(ProcessModule pm) {
		return getAllSuperOutputs(pm,-1);
	}
	/**
	 * returns all inputs of this process (including the Super-Processes), currently does not consider inputs of referencing super processes
	 * @param pm
	 * @return
	 */
	public static Set<Artifact> getAllSuperInputs(ProcessModule pm,int limit) {
		Set<Artifact> sRes = new HashSet<Artifact>();
		sRes.addAll(pm.getInputArtifacts());
		if (limit==0) {
			return sRes;
		}
		if (pm.eContainer() instanceof ProcessModule) {
			ProcessModule pmHelp=(ProcessModule)pm.eContainer();
			if (pm.getInstanceOfProcessModule()==pmHelp && pmHelp.eContainer() instanceof ProcessModule) {
				// do not add generic artifact of instantiated modules
				pmHelp=(ProcessModule)pmHelp.eContainer();
			}
			sRes.addAll(getAllSuperInputs(pmHelp,limit-1));
		}
		return sRes;
	}
	/**
	 * returns all inputs of this process (including the Super-Processes), currently does not consider inputs of referencing super processes
	 * @param pm
	 * @return
	 */
	public static Set<Artifact> getAllSuperInputs(ProcessModule pm) {
		return getAllSuperInputs(pm,-1);
	}
	/** returns the inputs of the contained sub-elements (that come not from the frame component) */
	public static Set<Artifact> getAllSubInputs(ProcessModule pm,Set<Artifact> sOutputs) {
		Set<Artifact> sRes = new HashSet<Artifact>();
		for (Artifact a:pm.getInputArtifacts()) {
			if (!sOutputs.contains(a)) {
				sRes.add(a);
			}
		}
		for (ProcessModule pmSub:pm.getSubProcessModules()) {
			sRes.addAll(getAllSubInputs(pmSub,sOutputs));
		}
		for (ProcessModule pmSub:pm.getSubProcessModuleReferences()) {
			sRes.addAll(getAllSubInputs(pmSub,sOutputs));
		}
		return sRes;
	}

	public static Set<Artifact> getAllOutputs(ProcessModule pm) {
		Set<Artifact> sRes = new HashSet<Artifact>();
		sRes.addAll(pm.getOutputArtifacts());
		for (ProcessModule pmSub:pm.getSubProcessModules()) {
			sRes.addAll(getAllOutputs(pmSub));
		}
		for (ProcessModule pmSub:pm.getSubProcessModuleReferences()) {
			sRes.addAll(getAllOutputs(pmSub));
		}
		return sRes;
	}

	public static StakeHolder getStakeHolderSuper(Artifact art) {
		return getStakeHolderSuper(art, -1);
	}
	public static StakeHolder getStakeHolderSuper(Artifact art,int limit) {
		if (art.getStakeHolder()!=null) {
			return art.getStakeHolder();
		}
		if (limit==0) {
			return null;
		}
		if (art.eContainer() instanceof Artifact) {
			return getStakeHolderSuper((Artifact)art.eContainer(),limit-1);
		}
		return null;
	}

	/** computes all contained (or referenced) elements */
	public static Set<Artifact> getAllArtifacts(Artifact art) {
		try {
			return getAllArtifactsWithRecursionCheck(art);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new HashSet<Artifact>();
		}
	}

	/** computes all super artifacts (not including art) */
	public static Set<Artifact> getAllSuperArtifacts(Artifact art) {
		Set<Artifact> s = new HashSet<Artifact>();
		if (art.eContainer() instanceof Artifact) {
			s.add((Artifact)art.eContainer());
			s.addAll(getAllSuperArtifacts((Artifact)art.eContainer()));
		}
		return s;
	}

	public static Set<Artifact> getAllArtifactsWithRecursionCheck(Artifact art) throws Exception {
		return getAllArtifactsWithRecursionCheck(art, new HashSet<Artifact>());
	}
	private static Set<Artifact> getAllArtifactsWithRecursionCheck(Artifact art,Set<Artifact> sVisited) throws Exception {
		Set<Artifact> sRes = new HashSet<Artifact>();
		sRes.add(art);
		Set<Artifact> sNewVisited=new HashSet<Artifact>(sVisited);
		sNewVisited.add(art);
		for (Artifact aSub:art.getSubArtifacts()) {
			if (sNewVisited.contains(aSub)) {
				throw new Exception("cyclic dependency: "+getQualArtifactName(art)+" contains visited artifact "+getQualArtifactName(aSub));
			}
			sRes.addAll(getAllArtifactsWithRecursionCheck(aSub,sNewVisited));
		}
		for (Artifact aSub:art.getSubArtifactReferences()) {
			if (sNewVisited.contains(aSub)) {
				throw new Exception("cyclic dependency: "+getQualArtifactName(art)+" refers visited artifact "+getQualArtifactName(aSub));
			}
			sRes.addAll(getAllArtifactsWithRecursionCheck(aSub,sNewVisited));
		}
		if (art instanceof Model) {
			Model model = (Model)art;
			for (Model mSub:model.getIncludes()) {
				if (sNewVisited.contains(mSub)) {
					throw new Exception("cyclic dependency: "+getQualArtifactName(art)+" includes visited model "+getQualArtifactName(mSub));
				}
				sRes.addAll(getAllArtifactsWithRecursionCheck(mSub,sNewVisited));
			}
		}
		return sRes;
	}

	public static Set<Requirement> getAllRequirementsWithRecursionCheck(Requirement req) throws Exception {
		return getAllRequirementsWithRecursionCheck(req, new HashSet<Requirement>());
	}
	private static Set<Requirement> getAllRequirementsWithRecursionCheck(Requirement req,Set<Requirement> sVisited) throws Exception {
		Set<Requirement> sRes = new HashSet<Requirement>();
		sRes.add(req);
		Set<Requirement> sNewVisited=new HashSet<Requirement>(sVisited);
		sNewVisited.add(req);
		for (Requirement rSub:req.getSubRequirements()) {
			if (sNewVisited.contains(rSub)) {
				throw new Exception("cyclic dependency: "+getQualRequirementName(req)+" contains visited Requirement "+getQualRequirementName(rSub));
			}
			sRes.addAll(getAllRequirementsWithRecursionCheck(rSub,sNewVisited));
		}
		for (Requirement rSub:req.getRequiredRequirements()) {
			if (sNewVisited.contains(rSub)) {
				throw new Exception("cyclic dependency: "+getQualRequirementName(req)+" requires visited Requirement "+getQualRequirementName(rSub));
			}
			sRes.addAll(getAllRequirementsWithRecursionCheck(rSub,sNewVisited));
		}
		return sRes;
	}
	public static Set<Requirement> getAllContainedRequirementsWithMe(Requirement req) {
		Set<Requirement> sRes = new HashSet<Requirement>();
		sRes.add(req);
		for (Requirement rSub:req.getSubRequirements()) {
			sRes.addAll(getAllContainedRequirementsWithMe(rSub));
		}
		return sRes;
	}
	public static Set<Requirement> getAllContainedRequirementsWithMe(List<Requirement> lRs) {
		Set<Requirement> sRes = new HashSet<Requirement>();
		for (Requirement r:lRs) {
			sRes.addAll(getAllContainedRequirementsWithMe(r));
		}
		return sRes;
	}

	public static Set<ProcessModule> getAllProcessModulesWithRecursionCheck(ProcessModule pm) throws Exception {
		return getAllProcessModulesWithRecursionCheck(pm, new HashSet<ProcessModule>());
	}
	private static Set<ProcessModule> getAllProcessModulesWithRecursionCheck(ProcessModule pm,Set<ProcessModule> sVisited) throws Exception {
		Set<ProcessModule> sRes = new HashSet<ProcessModule>();
		sRes.add(pm);
		Set<ProcessModule> sNewVisited=new HashSet<ProcessModule>(sVisited);
		sNewVisited.add(pm);
		for (ProcessModule pSub:pm.getSubProcessModules()) {
			if (sNewVisited.contains(pSub)) {
				throw new Exception("cyclic dependency: "+getQualProcessModuleName(pm)+" contains visited ProcessModule "+getQualProcessModuleName(pSub));
			}
			sRes.addAll(getAllProcessModulesWithRecursionCheck(pSub,sNewVisited));
		}
		for (ProcessModule pSub:pm.getSubProcessModuleReferences()) {
			if (sNewVisited.contains(pSub)) {
				throw new Exception("cyclic dependency: "+getQualProcessModuleName(pm)+" contains referred visited ProcessModule "+getQualProcessModuleName(pSub));
			}
			sRes.addAll(getAllProcessModulesWithRecursionCheck(pSub,sNewVisited));
		}
		return sRes;
	}
	/** returns a common root that includes the complete set */
	public static Artifact getCommonRoot(Set<Artifact> s) {
		for (Artifact a:s) {
			if (getAllArtifacts(a).containsAll(s)) {
				return a;
			}
		}
		for (Artifact a:s) {
			for (Artifact aParent:getAllParentArtifacts(a)) {
				if (getAllArtifacts(aParent).containsAll(s)) {
					return aParent;
				}
			}
		}		
		return null;
	}

	public static Set<Artifact> getAllParentArtifacts(Artifact art) {
		try {
			return getAllParentArtifactsWithRecursionCheck(art);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new HashSet<Artifact>();
		}
	}
	public static Set<Artifact> getAllParentArtifactsWithRecursionCheck(Artifact art) throws Exception {
		return getAllParentArtifactsWithRecursionCheck(art, new HashSet<Artifact>());
	}
	private static Set<Artifact> getAllParentArtifactsWithRecursionCheck(Artifact art,Set<Artifact> sVisited) throws Exception {
		Set<Artifact> sRes = new HashSet<Artifact>();
		sRes.add(art);
		Set<Artifact> sNewVisited=new HashSet<Artifact>(sVisited);
		sNewVisited.add(art);
		if (art.eContainer() instanceof Artifact) {
			Artifact aSuper = (Artifact)art.eContainer();
			if (sNewVisited.contains(aSuper)) {
				throw new Exception("cyclic dependency: "+getQualArtifactName(art)+" contains visited artifact "+getQualArtifactName(aSuper));
			}
			sRes.addAll(getAllParentArtifactsWithRecursionCheck(aSuper,sNewVisited));
		}
		for (Artifact aRef:art.getReferedByArtifacts()) {
			if (sNewVisited.contains(aRef)) {
				throw new Exception("cyclic dependency: "+getQualArtifactName(art)+" refers visited artifact "+getQualArtifactName(aRef));
			}
			sRes.addAll(getAllParentArtifactsWithRecursionCheck(aRef,sNewVisited));
		}
		if (art instanceof Model) {
			Model model = (Model)art;
			for (Model mSuper:model.getIsIncludedIn()) {
				if (sNewVisited.contains(mSuper)) {
					throw new Exception("cyclic dependency: "+getQualArtifactName(art)+" included in visited model "+getQualArtifactName(mSuper));
				}
				sRes.addAll(getAllParentArtifactsWithRecursionCheck(mSuper,sNewVisited));
			}
		}
		return sRes;
	}

	/** computes the inverse relation of getSubProcessModuleReferences by iterating over all PMs
	 * TODO: remove this once the MM is adapted */
	public static Set<ProcessModule> getSubProcessModuleReferencesInverse(ProcessModule pm) {
		Set<ProcessModule> sRes = new HashSet<ProcessModule>();
		Process prRoot = getProzessSuper(pm);
		if (prRoot==null) {
			System.err.println("strange case: no Process found for Module "+pm.getName());
			return sRes;
		}
		TreeIterator<EObject> it = prRoot.eAllContents();
		while (it.hasNext()) {
			EObject eo=it.next();
			if (eo instanceof ProcessModule) {
				if (((ProcessModule)eo).getSubProcessModuleReferences().contains(eo)) {
					sRes.add((ProcessModule)eo);
				}
			}
		}
		return sRes;
	}

	/** checks if v is included in nMaxScope */
	public static boolean isIncluded(Variantable vContext, Named nMaxScope) {
		if (vContext==nMaxScope) {
			return true;
		}
		if (nMaxScope!=null) {
			TreeIterator<EObject> it = nMaxScope.eAllContents();
			while (it.hasNext() ) {
				EObject eo=it.next();
				if (eo==vContext) {
					return true;
				}
			}
		}
		return false;
	}

	public static Set<Binding> getAllBindingsSuper(Named n,Named nScope) {
		Set<Binding> sRes=new HashSet<>();
		if (n instanceof ProcessModule) {
			sRes.addAll(((ProcessModule)n).getBindings());
		}
		if (n instanceof Process) {
			sRes.addAll(((Process)n).getBindings());
			return sRes;
		}
		if (n==nScope) {
			return sRes;
		}
		if (n.eContainer() instanceof Named) {
			sRes.addAll(getAllBindingsSuper((Named)n.eContainer(),nScope));
		}
		return sRes;
	}
}
