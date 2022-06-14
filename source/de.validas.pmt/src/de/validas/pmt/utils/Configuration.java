/**
 * 
 */
package de.validas.pmt.utils;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import metaModel.referenceProcess.Process;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.Requirement;
import metaModel.suptertype.Named;
import metaModel.terms.Binding;
import metaModel.terms.ProcessParameter;
import metaModel.terms.ProjectParameter;
import metaModel.terms.Constant;
import metaModel.terms.Parameter;
import metaModel.terms.PlanningParameter;
import metaModel.terms.Term;

/**
 * @author slotosch
 * represents the configuration of a Process
 */
public class Configuration {

	private String name;
	public String getName() { return name; }
	private Process process;
	public Process getProcess() { return process; }
	private Process rootProcess=null;
	public Process getRootProcess() { return rootProcess; }
	private ProcessModule rootProcessModule=null;
	public ProcessModule getRootProcessModule() { return rootProcessModule; }
	private Set<ProcessParameter> sAllCPs=new HashSet<ProcessParameter>();
	public Set<ProcessParameter> getAllProcessParameters() { return sAllCPs; }
	private Set<PlanningParameter> sAllPlanPs=new HashSet<PlanningParameter>();
	public Set<PlanningParameter> getAllPlanningParameters() { return sAllPlanPs; }
	private Set<ProjectParameter> sAllProjectPs=new HashSet<ProjectParameter>();
	public Set<ProjectParameter> getAllProjectParameters() { return sAllProjectPs; }
	private Set<Binding> sAllBindings=new HashSet<Binding>();
	public Set<Binding> getAllBindings() { return sAllBindings; }
	private Set<ProcessModule> sUsedPMs=new HashSet<ProcessModule>();
	public Set<ProcessModule> getUsedProcessModules() { return sUsedPMs; }
	private Set<Requirement> sUsedReqs=new HashSet<Requirement>();
	public Set<Requirement> getUsedRequirements() { return sUsedReqs; }

	/**  Configuration with the used ("claiming") processes in it */
	public Configuration(Process process,String name) {
		this.name=name;
		this.rootProcess=process;
		TreeIterator<EObject> ti = process.eAllContents();
		this.process=process;
		while (ti.hasNext()) {
			EObject eo=ti.next();
			if (eo instanceof ProcessParameter) {
				sAllCPs.add((ProcessParameter)eo);
			}
			if (eo instanceof PlanningParameter) {
				sAllPlanPs.add((PlanningParameter)eo);
			}
			if (eo instanceof ProjectParameter) {
				sAllProjectPs.add((ProjectParameter)eo);
			}
			if (eo instanceof Binding) {
				sAllBindings.add((Binding)eo);
			}
			if (eo instanceof ProcessModule && ((ProcessModule)eo).getClaimedComplianceRequirements().size()>0) {
				sUsedPMs.add((ProcessModule)eo);
			}
			if (eo instanceof Requirement && ((Requirement)eo).getClaimingProcessModules().size()>0) {
				sUsedReqs.add((Requirement)eo);
			}
		}
	}
	/**  Configuration with the used ("claiming") processes in it */
	public Configuration(ProcessModule pm,String name) {
		this.name=name;
		this.rootProcessModule=pm;
		sUsedPMs.add(pm);
		TreeIterator<EObject> ti = pm.eAllContents();
		this.process=HierarchyModel.getProzessSuper(pm);
		while (ti.hasNext()) {
			EObject eo=ti.next();
			if (eo instanceof ProcessParameter) {
				sAllCPs.add((ProcessParameter)eo);
			}
			if (eo instanceof PlanningParameter) {
				sAllPlanPs.add((PlanningParameter)eo);
			}
			if (eo instanceof ProjectParameter) {
				sAllProjectPs.add((ProjectParameter)eo);
			}
			if (eo instanceof Binding) {
				sAllBindings.add((Binding)eo);
			}
			if (eo instanceof ProcessModule) {
				sUsedPMs.add((ProcessModule)eo);
			}
			if (eo instanceof Requirement) {
				// cannot be the case
				sUsedReqs.add((Requirement)eo);
			}
		}
	}

	public int countClaims(ProcessModule pmRoot, Named nScope) {
		int iResult=0;
		for (ProcessModule pm:VariantModel.ProcessModule_getAllProcessModules(pmRoot,nScope)) {
			for (Requirement r:pm.getClaimedComplianceRequirements()) {
				iResult++;
			}
		}
		return iResult;
	}

	public int countRequirements() {
		int iResult=0;
		for (Requirement pm:sUsedReqs) {
			for (ProcessModule r:pm.getClaimingProcessModules()) {
				iResult++;
			}
		}
		return iResult;
	}

	public static List<String> printConfiguration(Process nScope) {
		List<String> lRes = new LinkedList<String>();
		lRes.add("Configuraton "+nScope.getName()+" of "+nScope.eClass().getName()+":");
		for (Parameter cp:VariantModel.Named_getAllParameters(nScope)) {
			Term c=getValue(cp,nScope);
			if (c==null) {
				lRes.add(cp.getName()+"= ?");
			} else {
				lRes.add(cp.getName()+"="+TermUtils.printTerm(c));
			}
		}
		for (ProcessModule pm:VariantModel.Process_getAllProcessModules(nScope)) {
			for (Requirement r:pm.getClaimedComplianceRequirements()) {
				lRes.add(pm.getName()+" claims "+r.getName());
			}
		}
		for (Requirement pm:VariantModel.Process_getAllRequirements(nScope)) {
			for (ProcessModule r:pm.getClaimingProcessModules()) {
				lRes.add(pm.getName()+" satisfied by "+r.getName());
			}
		}

		return lRes;
	}

	public static boolean isProcessComplete(Process p) {
		for (ProcessParameter cp:VariantModel.Named_getAllProcessParameters(p)) {
			Term c=getValue(cp,p);
			if (c==null || !TypeChecker.isConstant(c)) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPlanningComplete(Process p) {
		for (PlanningParameter cp:VariantModel.Named_getAllPlanningParameters(p)) {
			Term c=getValue(cp,p);
			if (c==null || !TypeChecker.isConstant(c)) {
				return false;
			}
		}
		return true;
	}
	public static boolean isProjectComplete(Process p) {
		for (ProjectParameter cp:VariantModel.Named_getAllProjectParameters(p)) {
			Term c=getValue(cp,p);
			if (cp.getValueFromListParameter()!=null) {
				if (getValue(cp.getValueFromListParameter(),p)==null 
						||!TypeChecker.isConstant((getValue(cp.getValueFromListParameter(),p)))) {
					return false;
				}
			} else if (c==null || !TypeChecker.isConstant(c)) {
				return false;
			}
		}
		return true;
	}
	
	public static Term getValue(Parameter param,Process p) {
		for (Binding b:VariantModel.Named_getAllBindings(p)) {
			if (b.getParameter()==param) {
				return b.getValue();
			}
		}
		// System.out.println("no value found for "+param.getName());
		return null;
	}
	
}
