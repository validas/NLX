/**
 * 
 */
package de.validas.pmt.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import de.validas.vvt.Project;
//import jdk.internal.dynalink.support.TypeUtilities;
import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.Criterion;
import metaModel.referenceProcess.IVerified;
import metaModel.referenceProcess.Model;
import metaModel.referenceProcess.Process;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.Requirement;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.Tool;
import metaModel.referenceProcess.VerificationModule;
import metaModel.suptertype.Named;
import metaModel.suptertype.SafetyLevel;
import metaModel.suptertype.Variantable;
import metaModel.terms.Binding;
import metaModel.terms.BoolTerm;
import metaModel.terms.ListType;
import metaModel.terms.ParamRef;
import metaModel.terms.Parameter;
import metaModel.terms.PlanningParameter;
import metaModel.terms.ProcessParameter;
import metaModel.terms.ProcessVariable;
import metaModel.terms.ProjectParameter;
import metaModel.terms.Term;
import metaModel.terms.Type;

/**
 * @author slotosch
 * handles the variants in the model:
 * An element in the model is active, if it is present in the model, i.e. not deactivated
 * An element can be deactivated by explicit deactivation or by a Variant term that evaluates to false.
 * In case many terms are present, all have to evaluate to false in order to deactivate the element.
 * The corresponding are searched from local to global (once Bindings & Types will be modular as well)
 * 
 * Note: Presence of Terms are computed by checking all containers of the elements (including references)
 * This means if a process is in an deactivated super-process it is only deactivated, 
 * if it is not used/references from within an other (active) processes
 * This can be seen in Example PMT-11

 */

public class VariantModel {

	/** global variable to get rid of the list parameters */
	public static boolean printListParameters = true;

	/** the possible activation states */
	public enum ACTIVATION {ACTIVE_ALLWAYS, ACTIVE_SOMETIMES, ACTIVE_NEVER};
	/**
	 * computes is the element is active, by checking it's Variant conditions
	 * @param v
	 * @return
	 */
	public static ACTIVATION isActive(Variantable v,Named nMaxScope) {
		// System.out.println("isActive("+v.getName()+" in "+nMaxScope.getName()+")");
		if (v==null ||v.isDeactivated()) {
			return ACTIVATION.ACTIVE_NEVER;
		}
		// check variants of in process (that might also use global variables)
		if (!(nMaxScope instanceof Process)) { 
			Process pRoot=HierarchyModel.getProzessSuper(nMaxScope);
			if (isActive(v, pRoot)==ACTIVATION.ACTIVE_NEVER) {
				return ACTIVATION.ACTIVE_NEVER;
			}
		}
		if (v.getVariants().size()==0 && v==nMaxScope) {
			return ACTIVATION.ACTIVE_ALLWAYS;
		}
		boolean bAllFalse=v.getVariants().size()>0;
		boolean bAllTrue=v.getVariants().size()>0;
		for (Term bt:v.getVariants()) {
			try {
				Term tEval=Evaluator.evalTerm(bt, v, nMaxScope);
				if (TermComparator.equalTerms(tEval, Evaluator.getTRUE())) {
					bAllFalse=false;
				}
				if (TermComparator.equalTerms(tEval, Evaluator.getFALSE())) {
					bAllTrue=false;
				}
			} catch (Exception e) {
				// if vars are not bound, this causes exceptions
				// e.printStackTrace();
				bAllFalse=false;
				bAllTrue=false;
			}
		}
		ACTIVATION aResult=null;
		if (bAllFalse) {
			aResult = ACTIVATION.ACTIVE_NEVER;
			return aResult;
		} else if (bAllTrue) {
			aResult = ACTIVATION.ACTIVE_ALLWAYS;
		} else {
			aResult = ACTIVATION.ACTIVE_SOMETIMES;
		}
		if (v==nMaxScope) {
			return aResult;
		}
		if (v.eContainer() instanceof Variantable) {
			Variantable vSuper=(Variantable) v.eContainer();
			if (HierarchyModel.isIncluded(vSuper, nMaxScope)) {
				aResult=addACTIVATION(aResult,isActive(vSuper, nMaxScope));
			}
		}
		// check for references
		if (v instanceof ProcessModule) {
			ProcessModule pmContext = (ProcessModule)v;
			//OS: currently getSubProcessModuleReferences has no opposite to search, hence use HM
			for (ProcessModule pmRefering:HierarchyModel.getSubProcessModuleReferencesInverse(pmContext)) {
				if (HierarchyModel.isIncluded(pmRefering, nMaxScope)) {
					aResult=addACTIVATION(aResult,isActive(pmRefering, nMaxScope));
				}
			}
		}
		return aResult;
	}

	private static ACTIVATION addACTIVATION(ACTIVATION a1, ACTIVATION a2) {
		if (a1==null) {
			return a2;
		}
		if (a2==null) {
			return a1;
		}
		if (a1==ACTIVATION.ACTIVE_NEVER || a2==ACTIVATION.ACTIVE_NEVER) {
			return ACTIVATION.ACTIVE_NEVER;
		}
		if (a2==a1) {
			return a1;
		}
		return ACTIVATION.ACTIVE_SOMETIMES;
	}

	/** some meta model helpers */
	/** gets active ProcessModules */
	public static List<ProcessModule> Process_getProcessModules(Process process) {
		List<ProcessModule> lRes = new LinkedList<ProcessModule>();
		for (ProcessModule pm:process.getProcessModules()) {
			if (isActive(pm, process)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add(pm);
			}
		}
		return lRes;
	}
	/** gets all active ProcessModules */
	public static List<ProcessModule> Process_getAllProcessModules(Process process) {
		List<ProcessModule> lRes = new LinkedList<ProcessModule>();
		for (ProcessModule pm:process.getProcessModules()) {
			if (isActive(pm, process)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add(pm);
				lRes.addAll(ProcessModule_getAllProcessModules(pm, process));
			}
		}
		return lRes;
	}

	/** gets active ProcessModules */
	public static List<ProcessModule> ProcessModule_getSubProcessModules(ProcessModule pm,Named nScope) {
		List<ProcessModule> lRes = new LinkedList<ProcessModule>();
		for (ProcessModule pmSub:pm.getSubProcessModules()) {
			if (isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add(pmSub);
			}
		}
		return lRes;
	}


	/** gets all active Requirements */
	public static List<Requirement> Process_getAllRequirements(Process process) {
		List<Requirement> lRes = new LinkedList<Requirement>();
		for (Requirement pm:process.getRequirements()) {
			if (isActive(pm, process)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add(pm);
				lRes.addAll(Requirement_getAllRequirements(pm, process));
			}
		}
		return lRes;
	}
	/** gets active claimed Requirements */
	public static List<Requirement> ProcessModule_getClaimedRequirements(ProcessModule pm) {
		List<Requirement> lRes = new LinkedList<Requirement>();
		for (Requirement r:pm.getClaimedComplianceRequirements()) {
			if (isActive(r, pm)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add(r);
			}
		}
		return lRes;
	}

	/** gets active requirements (including all required), Note: does not do a cycle check */
	public static List<Requirement> Requirement_getAllRequirements(Requirement pm,Named nScope) {
		List<Requirement> lRes = new LinkedList<Requirement>();
		for (Requirement pmSub:pm.getSubRequirements()) {
			if (isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add(pmSub);
			}
		}
		for (Requirement pmSub:pm.getRequiredRequirements()) {
			if (isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add(pmSub);
			}
		}
		return lRes;
	}

	/** gets active ProcessModuleReferences */
	public static List<ProcessModule> ProcessModule_getSubProcessModuleReferences(ProcessModule pm,Named nScope) {
		List<ProcessModule> lRes = new LinkedList<ProcessModule>();
		for (ProcessModule pmSub:pm.getSubProcessModuleReferences()) {
			if (isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add(pmSub);
			}
		}
		return lRes;
	}

	/** gets active ProcesModules and ProcessModuleReferences (direct children) */
	public static List<ProcessModule> ProcessModule_getChildProcessModules(ProcessModule pm,Named nScope) {
		List<ProcessModule> lRes = new LinkedList<ProcessModule>();
		for (ProcessModule pmSub:ProcessModule_getSubProcessModules(pm,nScope)) {
			if (!lRes.contains(pmSub)) {
				lRes.add(pmSub);
			}
		}
		for (ProcessModule pmSub:ProcessModule_getSubProcessModuleReferences(pm,nScope)) {
			if (!lRes.contains(pmSub)) {
				lRes.add(pmSub);
			}
		}
		return lRes;
	}

	/** gets all active ProcesModules and ProcessModuleReferences (all children) */
	// No Occurs check
	public static Set<ProcessModule> ProcessModule_getAllProcessModules(ProcessModule pm,Named nScope) {
		Set<ProcessModule> sRes = new HashSet<ProcessModule>();
		sRes.add(pm);
		for (ProcessModule pmSub:ProcessModule_getChildProcessModules(pm,nScope)) {
			sRes.addAll(ProcessModule_getAllProcessModules(pmSub,nScope));
		}
		return sRes;
	}

	
	public static Set<Compliance> VerificationModule_getVerifiedCompliances(VerificationModule vm,Named nScope) {
		Set<Compliance> sRes = new HashSet<Compliance>();
		for (Compliance c:vm.getVerifiedCompliances()) {
			// System.out.println("VerificationModule_getAllCritera: checking "+c.getName());
			if (isActive(c, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				sRes.add(c);
			}
		}
		return sRes;
	}

	public static Set<Criterion> VerificationModule_getAllCritera(VerificationModule vm,Named nScope) {
		Set<Criterion> sRes = new HashSet<Criterion>();
		for (Criterion c:vm.getCriteria()) {
			// System.out.println("VerificationModule_getAllCritera: checking "+c.getName());
			if (isActive(c, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				sRes.add(c);
			}
		}
		sRes.addAll(vm.getCriteria());
		for (ProcessModule pmSub:VariantModel.ProcessModule_getChildProcessModules(vm, nScope)) {
			if (pmSub instanceof VerificationModule) {
				sRes.addAll(VerificationModule_getAllCritera((VerificationModule)pmSub,nScope));
			}
		}
		// System.out.println("VerificationModule_getAllCritera("+vm.getName()+"): found "+sRes.size());
		return sRes;
	}

	/** gets all parameters */
	public static Set<Parameter> Named_getAllParameters(Named nScope) {
		Set<Parameter> sRes = new HashSet<Parameter>();
		if (nScope instanceof Process) {
			sRes.addAll(((Process)nScope).getParameters());
			for (ProcessModule pm:Process_getAllProcessModules((Process)nScope)) {
				sRes.addAll(pm.getParameters());
			}
		}
		if (nScope instanceof ProcessModule) {
			// add global parameter & binding
			Process pRoot=HierarchyModel.getProzessSuper(nScope);
			sRes.addAll(pRoot.getParameters());

			sRes.addAll(((ProcessModule)nScope).getParameters());
			sRes.addAll(((ProcessModule)nScope).getParameterReferences());
			for (ProcessModule pm:ProcessModule_getAllProcessModules((ProcessModule)nScope, nScope)) {
				sRes.addAll(pm.getParameters());
				sRes.addAll(pm.getParameterReferences());
				// System.out.println("Named_getAllParameters:"+pm.getName()+":"+pm.getParameters().size()+"+"+pm.getParameterReferences().size()+" -> "+sRes.size());
			}
		}
		if (PMT2VVT.bUseOnlyClaimed && nScope instanceof ProcessModule) {
			Set<Parameter> sUsed=new HashSet<Parameter>();
			for (VerificationModule vm:VVUtils.getAllRelevantVerificationModules((ProcessModule)nScope,nScope,true)) {
				// System.out.println("Parameters for "+vm.getName()+":"+vm.getParameters().size()+"+"+vm.getParameterReferences().size());
				sUsed.addAll(vm.getParameters());
				sUsed.addAll(vm.getParameterReferences());
				sUsed.addAll(ParameterUtils.getPrintableParameters(vm).keySet());
			}
			sRes=sUsed;
		}
		if (!printListParameters) {
			Set<Parameter> sRemove=new HashSet<Parameter>();
			for (Parameter p:sRes) {
				if (p.getIteratorParameters().size()>0) {
					sRemove.add(p);
				}
			}
			sRes.removeAll(sRemove);
		}
		System.out.println("Named_getAllParameters: found "+sRes.size()+" parameters");
		return sRes;
	}
	/** gets all Variantables */
	public static Set<Variantable> Named_getAllVariantables(Named nScope) {
		Set<Variantable> sRes = new HashSet<Variantable>();
		if (nScope instanceof Variantable) {
			if (isActive((Variantable)nScope,nScope)!=ACTIVATION.ACTIVE_NEVER) {
				sRes.add((Variantable)nScope);
			}
		}
		TreeIterator<EObject> it=nScope.eAllContents();
		while (it.hasNext()) {
			EObject eo=it.next();
			if (eo instanceof Variantable) {
				if (isActive((Variantable)eo,nScope)!=ACTIVATION.ACTIVE_NEVER) {
					sRes.add((Variantable)eo);
				}
			}
		}
		return sRes;
	}

	/** gets all process parameters */
	public static Set<ProcessParameter> Named_getAllProcessParameters(Named nScope) {
		Set<ProcessParameter> sRes = new HashSet<ProcessParameter>();
		for (Parameter p:Named_getAllParameters(nScope)) {
			if (p instanceof ProcessParameter) {
				sRes.add((ProcessParameter)p);
			}
		}
		return sRes;
	}
	/** gets all process variables */
	public static Set<ProcessVariable> Named_getAllProcessVariables(Named nScope) {
		Set<ProcessVariable> sRes = new HashSet<ProcessVariable>();
		for (Parameter p:Named_getAllParameters(nScope)) {
			if (p instanceof ProcessVariable) {
				sRes.add((ProcessVariable)p);
			}
		}
		return sRes;
	}
	/** gets all planning parameters */
	public static Set<PlanningParameter> Named_getAllPlanningParameters(Named nScope) {
		Set<PlanningParameter> sRes = new HashSet<PlanningParameter>();
		for (Parameter p:Named_getAllParameters(nScope)) {
			if (p instanceof PlanningParameter) {
				sRes.add((PlanningParameter)p);
			}
		}
		return sRes;
	}
	/** gets all project parameters */
	public static Set<ProjectParameter> Named_getAllProjectParameters(Named nScope) {
		Set<ProjectParameter> sRes = new HashSet<ProjectParameter>();
		for (Parameter p:Named_getAllParameters(nScope)) {
			if (p instanceof ProjectParameter) {
				sRes.add((ProjectParameter)p);
			}
		}
		return sRes;
	}

	/** gets all tools used within the scope */
	public static Set<Tool> Named_getAllTools(Named nScope) {
		Set<Tool> sRes = new HashSet<Tool>();
		if (nScope instanceof Process) {
			sRes.addAll(((Process)nScope).getTools());
		}
		if (nScope instanceof ProcessModule) {
			// add globals
			Process pRoot=HierarchyModel.getProzessSuper(nScope);
			sRes.addAll(pRoot.getTools());

			sRes.addAll(((ProcessModule)nScope).getTools());
			for (ProcessModule pm:ProcessModule_getAllProcessModules((ProcessModule)nScope, nScope)) {
				sRes.addAll(pm.getTools());
			}
		}
		return sRes;
	}

	/** gets all stake-holders used within the scope */
	public static Set<StakeHolder> Named_getAllRoles(Named nScope) {
		Set<StakeHolder> sRes = new HashSet<StakeHolder>();
		if (nScope instanceof Process) {
			sRes.addAll(((Process)nScope).getStakeHolders());
		}
		if (nScope instanceof ProcessModule) {
			// add globals
			Process pRoot=HierarchyModel.getProzessSuper(nScope);
			sRes.addAll(pRoot.getStakeHolders());

			sRes.addAll(((ProcessModule)nScope).getStakeHolders());
			for (ProcessModule pm:ProcessModule_getAllProcessModules((ProcessModule)nScope, nScope)) {
				sRes.addAll(pm.getStakeHolders()); // the defined SH
				if (pm.getStakeHolder()!=null) {
					sRes.add(pm.getStakeHolder()); // the owner
				}
				sRes.addAll(pm.getInvolvedStakeHolders()); // involved
			}
		}
		return sRes;
	}

	/** returns the qualified name */
	public static String Named_getQualName(Named n,Named nScope) {
		if (n==nScope) {
			return "";
		}
		String sSuper="";
		if (n.eContainer() instanceof Named) {
			String named_getQualName = Named_getQualName((Named)n.eContainer(), nScope);
			if (!named_getQualName.equals("")) {
				sSuper=named_getQualName+".";
			}
		}
		return sSuper+n.getName();
	}

	/** gets all Bindings */
	public static Set<Binding> Named_getAllBindings(Named nScope) {
		Set<Binding> sRes = new HashSet<Binding>();
		if (nScope instanceof Process) {
			sRes.addAll(((Process)nScope).getBindings());
			for (ProcessModule pm:Process_getAllProcessModules((Process)nScope)) {
				sRes.addAll(pm.getBindings());
			}
		}
		if (nScope instanceof ProcessModule) {
			// add globals
			Process pRoot=HierarchyModel.getProzessSuper(nScope);
			sRes.addAll(pRoot.getBindings());

			sRes.addAll(((ProcessModule)nScope).getBindings());
			for (ProcessModule pm:ProcessModule_getAllProcessModules((ProcessModule)nScope, nScope)) {
				sRes.addAll(pm.getBindings());
			}
		}
		return sRes;
	}
	/** gets all Artifacts */
	public static Set<Artifact> Named_getAllArtifacts(Named nScope) {
		Set<Artifact> sRes = new HashSet<Artifact>();
		if (nScope instanceof Process) {
			sRes.addAll(((Process)nScope).getArtifacts());
			for (ProcessModule pm:Process_getAllProcessModules((Process)nScope)) {
				addIOHelper(sRes, pm);
			}
		}
		if (nScope instanceof ProcessModule) {
			// add globals
			Process pRoot=HierarchyModel.getProzessSuper(nScope);
			sRes.addAll(pRoot.getArtifacts());

			sRes.addAll(((ProcessModule)nScope).getArtifacts());
			for (ProcessModule pm:ProcessModule_getAllProcessModules((ProcessModule)nScope, nScope)) {
				addIOHelper(sRes, pm);
			}
		}
		return sRes;
	}

	private static void addIOHelper(Set<Artifact> sRes, ProcessModule pm) {
		sRes.addAll(pm.getArtifacts());
		sRes.addAll(pm.getInputArtifacts());
		sRes.addAll(pm.getOutputArtifacts());
		if (pm instanceof VerificationModule) {
			for (IVerified v:((VerificationModule)pm).getVerifies()) {
				if (v instanceof Artifact) {
					sRes.add((Artifact)v);							
				}
			}
		}
	}

	/** gets all VerificationModules */
	public static Set<VerificationModule> Named_getAllVerificationModules(Named nScope) {
		Set<VerificationModule> sRes = new HashSet<VerificationModule>();
		if (nScope instanceof Process) {
			for (ProcessModule pm:Process_getAllProcessModules((Process)nScope)) {
				if (pm instanceof VerificationModule) {
					sRes.add((VerificationModule)pm);
				}
			}
		}
		if (nScope instanceof ProcessModule) {
			if (nScope instanceof VerificationModule) {
				sRes.add((VerificationModule)nScope);
			}
			for (ProcessModule pm:ProcessModule_getAllProcessModules((ProcessModule)nScope, nScope)) {
				if (pm instanceof VerificationModule) {
					sRes.add((VerificationModule)pm);
				}
			}
		}
		return sRes;
	}

	/** gets all ProcessModules */
	public static Set<ProcessModule> Named_getAllProcessModules(Named nScope) {
		Set<ProcessModule> sRes = new HashSet<ProcessModule>();
		if (nScope instanceof Process) {
			for (ProcessModule pm:Process_getAllProcessModules((Process)nScope)) {
				sRes.add((ProcessModule)pm);
			}
		}
		if (nScope instanceof ProcessModule) {
			sRes.add((ProcessModule)nScope);
			for (ProcessModule pm:ProcessModule_getAllProcessModules((ProcessModule)nScope, nScope)) {
				sRes.add((ProcessModule)pm);
			}
		}
		return sRes;
	}

	/** gets all Claimed Requirements as Set */
	public static Set<Requirement> Named_getAllClaimedAndContainedRequirements(Named nScope) {
		Set<Requirement> sRes = new HashSet<Requirement>();
		for (Requirement r:Named_getAllClaimedRequirements(nScope)) {
			sRes.add(r);
			sRes.addAll(Requirement_getAllRequirements(r,nScope));
		}
		return sRes;
	}
	/** gets all Claimed Compliances (and contained) as Set */
	public static Set<Compliance> Named_getAllClaimedAndContainedCompliances(Named nScope) {
		Set<Compliance> sRes = new HashSet<Compliance>();
		for (Requirement r:Named_getAllClaimedRequirements(nScope)) {
			sRes.addAll(Requirement_getCompliances(r, nScope));
			for (Requirement rC:Requirement_getAllRequirements(r,nScope)) {
				sRes.addAll(Requirement_getCompliances(rC, nScope));
			}
		}
		return sRes;
	}
	/** gets all Claimed Requirements as Set */
	public static Set<Requirement> Named_getAllClaimedRequirements(Named nScope) {
		Set<Requirement> sRes = new HashSet<Requirement>();
		if (nScope instanceof Process) {
			for (ProcessModule pm:Process_getAllProcessModules((Process)nScope)) {
				for (Requirement r:pm.getClaimedComplianceRequirements()) {
					if (isActive(r, nScope)!=ACTIVATION.ACTIVE_NEVER) {
						sRes.add(r);
					}
				}
			}
		}
		if (nScope instanceof ProcessModule) {
			for (Requirement r:((ProcessModule)nScope).getClaimedComplianceRequirements()) {
				if (isActive(r, nScope)!=ACTIVATION.ACTIVE_NEVER) {
					sRes.add(r);
				}
			}
			for (ProcessModule pm:ProcessModule_getAllProcessModules((ProcessModule)nScope, nScope)) {
				for (Requirement r:pm.getClaimedComplianceRequirements()) {
					if (isActive(r, nScope)!=ACTIVATION.ACTIVE_NEVER) {
						sRes.add(r);
					}
				}
			}
		}
		return sRes;
	}
	/** gets all Claimed Requirements as Map */
	public static Map<ProcessModule, Set<Requirement>> Named_getAllClaimedRequirementsMap(Named nScope) {
		Map<ProcessModule, Set<Requirement>> mRes = new HashMap<ProcessModule, Set<Requirement>>();
		if (nScope instanceof Process) {
			for (ProcessModule pm:Process_getAllProcessModules((Process)nScope)) {
				if (pm.getClaimedComplianceRequirements().size()>0) {
					Set<Requirement> s=new HashSet<Requirement>();
					for (Requirement r:pm.getClaimedComplianceRequirements()) {
						if (isActive(r, nScope)!=ACTIVATION.ACTIVE_NEVER) {
							s.add(r);
						}
					}
					if (s.size()>0) {
						mRes.put(pm,s);
					}
				}
			}
		}
		if (nScope instanceof ProcessModule) {
			for (ProcessModule pm:ProcessModule_getAllProcessModules((ProcessModule)nScope, nScope)) {
				if (pm.getClaimedComplianceRequirements().size()>0) {
					Set<Requirement> s=new HashSet<Requirement>();
					for (Requirement r:pm.getClaimedComplianceRequirements()) {
						if (isActive(r, nScope)!=ACTIVATION.ACTIVE_NEVER) {
							s.add(r);
						}
					}
					if (s.size()>0) {
						mRes.put(pm,s);
					}
				}
			}
		}
		return mRes;
	}

	/** gets all types used in parameters */
	public static Set<Type> Named_getAllParameterTypes(Named nScope) {
		Set<Type> sRes = new HashSet<Type>();
		for (Parameter p:Named_getAllParameters(nScope)) {
			if (p.getType()!=null) {
				sRes.add(p.getType());
			}
		}
		return sRes;
	}

	/** returns the value (if present), otherwise null */
	public static Term Parameter_getValueInScope(Parameter param, Named nScope) {
		for (Binding b:Named_getAllBindings(nScope)) {
			if (b.getParameter()==param) {
				return b.getValue();
			}
		}
		return null;
	}

	public static List<Compliance> Compliance_getSubCompliances(Compliance comp,Named nScope) {
		List<Compliance> lResult=new LinkedList<Compliance>();
		for (Compliance c:comp.getSubCompliances()) {
			if (isActive(c, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lResult.add(c);
			}
		}
		return lResult;
	}
	public static List<StakeHolder> Compliance_getStakeHolders(Compliance comp,Named nScope) {
		List<StakeHolder> lResult=new LinkedList<StakeHolder>();
		for (StakeHolder c:comp.getStakeHolders()) {
			if (isActive(c, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lResult.add(c);
			}
		}
		return lResult;
	}
	public static List<Artifact> Compliance_getArtifacts(Compliance comp,Named nScope) {
		List<Artifact> lResult=new LinkedList<Artifact>();
		for (Artifact c:comp.getArtifatcs()) {
			if (isActive(c, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lResult.add(c);
			}
		}
		return lResult;
	}
	public static List<ProcessModule> Compliance_getProcessModules(Compliance comp,Named nScope) {
		List<ProcessModule> lResult=new LinkedList<ProcessModule>();
		for (ProcessModule c:comp.getProcessModules()) {
			if (isActive(c, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lResult.add(c);
			}
		}
		return lResult;
	}
	public static List<VerificationModule> Compliance_getVerificationModules(Compliance comp,Named nScope) {
		List<VerificationModule> lResult=new LinkedList<VerificationModule>();
		for (VerificationModule c:comp.getVerificationModules()) {
			if (isActive(c, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lResult.add(c);
			}
		}
		return lResult;
	}

	public static List<Compliance> Requirement_getCompliances(Requirement req,Named nScope) {
		List<Compliance> lResult=new LinkedList<Compliance>();
		for (Compliance c:req.getCompliances()) {
			if (isActive(c, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lResult.add(c);
			}
		}
		return lResult;
	}

	public static List<Requirement> Requirement_getSubRequirements(Requirement req,Named nScope) {
		List<Requirement> lResult=new LinkedList<Requirement>();
		for (Requirement c:req.getSubRequirements()) {
			if (isActive(c, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lResult.add(c);
			}
		}
		return lResult;
	}

	public static List<Requirement> Requirement_getRequiredRequirements(Requirement req,Named nScope) {
		List<Requirement> lResult=new LinkedList<Requirement>();
		for (Requirement c:req.getRequiredRequirements()) {
			if (isActive(c, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lResult.add(c);
			}
		}
		return lResult;
	}

	public static List<ProcessModule> StakeHolder_getOwnedModules(StakeHolder sh,Named nScope) {
		List<ProcessModule> lResult=new LinkedList<ProcessModule>();
		for (ProcessModule c:sh.getOwnedModules()) {
			if (isActive(c, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lResult.add(c);
			}
		}
		return lResult;
	}

	public static List<ProcessModule> StakeHolder_getInvolvedModules(StakeHolder sh,Named nScope) {
		List<ProcessModule> lResult=new LinkedList<ProcessModule>();
		for (ProcessModule c:sh.getInvolvedModules()) {
			if (isActive(c, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lResult.add(c);
			}
		}
		return lResult;
	}

	public static List<Artifact> Artifact_getSubArtifacts(Artifact art,Named nScope) {
		List<Artifact> lRes = new LinkedList<Artifact>();
		for (Artifact pmSub:art.getSubArtifacts()) {
			if (isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add(pmSub);
			}
		}
		return lRes;
	}

	public static List<Artifact> Artifact_getSubArtifactReferences(Artifact art,Named nScope) {
		List<Artifact> lRes = new LinkedList<Artifact>();
		for (Artifact artSub:art.getSubArtifactReferences()) {
			if (isActive(artSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add(artSub);
			}
		}
		return lRes;
	}

	public static List<Artifact> Artifact_getChildArtifacts(Artifact art,Named nScope) {
		List<Artifact> lRes = new LinkedList<Artifact>();
		for (Artifact artSub:Artifact_getSubArtifacts(art,nScope)) {
			if (!lRes.contains(artSub)) {
				lRes.add(artSub);
			}
		}
		for (Artifact artSub:Artifact_getSubArtifactReferences(art,nScope)) {
			if (!lRes.contains(artSub)) {
				lRes.add(artSub);
			}
		}
		return lRes;
	}

	public static List<ProcessModule> Tool_getProzessModules(Tool tool,Named nScope) {
		List<ProcessModule> lRes = new LinkedList<ProcessModule>();
		for (ProcessModule pm:tool.getProcessModules()) {
			if (isActive(pm, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add(pm);
			}
		}
		return lRes;
	}

	public static List<ProcessModule> Artifact_getCreatedByProcessModules(Artifact art,Named nScope) {
		List<ProcessModule> lRes = new LinkedList<ProcessModule>();
		for (ProcessModule pm:art.getCreatedByProcessModules()) {
			if (isActive(pm, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add(pm);
			}
		}
		return lRes;
	}

	public static List<ProcessModule> Artifact_getReadByProcessModules(Artifact art,Named nScope) {
		List<ProcessModule> lRes = new LinkedList<ProcessModule>();
		for (ProcessModule pm:art.getReadByProcessModules()) {
			if (isActive(pm, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				lRes.add(pm);
			}
		}
		return lRes;
	}


	public static List<String> checkVariants(Named n) {
		Process pRoot=HierarchyModel.getProzessSuper(n);
		List<String> lResult=new LinkedList<String>();
		checkVariantNamed(n,lResult,pRoot);
		TreeIterator<EObject> ti = n.eAllContents();
		while (ti.hasNext()) {
			EObject eo=ti.next();
			if (eo instanceof Named) {				
				checkVariantNamed((Named) eo, lResult,pRoot);
			}
		}
		return lResult;
	}

	private static void checkVariantNamed(Named n,List<String> lResult,Named nScope) {
		if (n instanceof Variantable) {
			Variantable v = (Variantable)n;
			for (BoolTerm bt:v.getVariants()) {
				String sEval="";
				try {
					Term tRes=Evaluator.evalTerm(bt, v,nScope);
					sEval="= "+TermUtils.printTerm(tRes);
				} catch (Exception ex) {
					ex.printStackTrace();
					sEval=ex.getMessage();
				}
				lResult.add(n.eClass().getName()+" "+n.getName()+":"+TermUtils.printTerm(bt)+" "+sEval);
			}
		}
	}

	public static Set<Artifact> filterActiveArtifacts(Set<Artifact> s,Named nScope) {
		Set<Artifact> sRes= new HashSet<Artifact>();
		for (Artifact x:s) {
			if (isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				sRes.add(x);
			}
		}
		return sRes;
	}
	public static Set<ProcessModule> filterActiveProcessModules(Set<ProcessModule> s,Named nScope) {
		Set<ProcessModule> sRes= new HashSet<ProcessModule>();
		for (ProcessModule x:s) {
			if (isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				sRes.add(x);
			}
		}
		return sRes;
	}
	public static List<ProcessModule> filterActiveProcessModules(List<ProcessModule> s,Named nScope) {
		List<ProcessModule> sRes= new LinkedList<ProcessModule>();
		for (ProcessModule x:s) {
			if (isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				sRes.add(x);
			}
		}
		return sRes;
	}
	public static Set<StakeHolder> filterActiveStakeHolders(Set<StakeHolder> s,Named nScope) {
		Set<StakeHolder> sRes= new HashSet<StakeHolder>();
		for (StakeHolder x:s) {
			if (isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				sRes.add(x);
			}
		}
		return sRes;
	}
	public static Set<Requirement> filterActiveRequirements(Set<Requirement> s,Named nScope) {
		Set<Requirement> sRes= new HashSet<Requirement>();
		for (Requirement x:s) {
			if (isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				sRes.add(x);
			}
		}
		return sRes;
	}
	public static Set<Compliance> filterActiveCompliances(Set<Compliance> s,Named nScope) {
		Set<Compliance> sRes= new HashSet<Compliance>();
		for (Compliance x:s) {
			if (isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				sRes.add(x);
			}
		}
		return sRes;
	}

}
