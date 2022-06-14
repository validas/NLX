/**
 * 
 */
package de.validas.pmt.utils;

import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import de.validas.pmt.utils.VariantModel.ACTIVATION;
import metaModel.referenceProcess.Process;
import metaModel.referenceProcess.ProcessModule;
import metaModel.suptertype.Named;
import metaModel.terms.Parameter;
import metaModel.terms.PlanningParameter;

/**
 * @author slotosch
 * performs some project planning checks
 */
public class ProjectPlanner {

	public static List<String> checkProjectPlanned(Process n,String sName) {
		List<String> lRes =  Configuration.printConfiguration(n);
		TreeIterator<EObject> ti = n.eAllContents();
		boolean bAllOK=true;
		while (ti.hasNext()) {
			EObject eo=ti.next();
			if (eo instanceof ProcessModule) {
				ProcessModule pm=(ProcessModule)eo;
				try {
					float fEffort=getEffort(pm,n);
					lRes.add("Effort  for  "+pm.eClass().getName()+" "+pm.getName()+" = "+fEffort);
				} catch (Exception ex) {
					bAllOK=false;
					lRes.add("No effort estimated for  "+pm.eClass().getName()+" "+pm.getName()+":"+ex.getMessage());
				}
			}
		}
		lRes.add("PLANNING PARAMETERS COMPLETE="+Configuration.isPlanningComplete(n));
		lRes.add("EFFORTS OK ="+bAllOK);
		return lRes;
	}

	public static float getEffort(Process process,Named nScope) throws Exception {
		float fRes=0;
		for (ProcessModule pm:process.getProcessModules()) {
			if (VariantModel.isActive(pm, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				fRes+=getEffort(pm,nScope);
			}
		}
		return fRes;
	}
	public static float getEffort(ProcessModule pm,Named nScope) throws Exception {
		// determine multiplication factor
		int iFactor=1;
		boolean bHasInstances=false;
		for (Parameter p:HierarchyModel.getAllParameters(pm)) {
			// System.out.println(pm.getName()+": checking parameter "+p.getName()+":"+getShowParameter(p,pm)) ;
			if (p instanceof PlanningParameter && ParameterUtils.getShowParameter(p,pm) ) {
				bHasInstances=true;
			}
		}
		if (pm.getNumberOfInstances()==0 && bHasInstances) {
			throw new Exception(pm.getName()+" has Parameters, but number of instances==0");
		}
		iFactor=pm.getNumberOfInstances();
		if (iFactor==0) {
			// not specified: change to 1 (default)
			iFactor=1;
		}
		if (pm.getEffort()>0) {
			return iFactor*pm.getEffort();
		}
		float fRes=0;
		try {
			for (ProcessModule pmSub:pm.getSubProcessModules()) {
				if (VariantModel.isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
					fRes+=getEffort(pmSub, nScope);
				}
			}
			for (ProcessModule pmSub:pm.getSubProcessModuleReferences()) {
				if (VariantModel.isActive(pmSub, nScope)!=ACTIVATION.ACTIVE_NEVER) {
					fRes+=getEffort(pmSub, nScope);
				}
			}
		} catch (Exception ex) {
			throw new Exception("could not compute effort for "+pm.getName()+":"+ex.getMessage());
		}
		if (fRes>0) {
			return iFactor*fRes;
		}
		throw new Exception("no effort in "+pm.getName());
	}

}
