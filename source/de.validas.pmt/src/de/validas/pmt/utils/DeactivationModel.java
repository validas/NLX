package de.validas.pmt.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import de.validas.pmt.utils.VariantModel.ACTIVATION;
import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.IVerifier;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.Process;
import metaModel.suptertype.Named;
import metaModel.suptertype.Variantable;

/**
 * routines to compute real elements / ignore deactivated
 * @author slotosch
 *
 */
public class DeactivationModel {

	/** checks if the element is deactivated */
	public static boolean getDeactivatedSuper(EObject eo,Named nScope) {
		if (eo instanceof Named && ((Named)eo).isDeactivated()) {
			return true;
		}
		if (nScope==eo) {
			return false;
		}
		if (eo.eContainer() instanceof EObject) {
			return getDeactivatedSuper((EObject)eo.eContainer(),nScope);
		}
		return false;
	}


	public static List<ProcessModule> Artifact_getReadByProcessModules(Artifact artifact,Named nScope) {
		List<ProcessModule> lResult = new LinkedList<ProcessModule>();
		for (ProcessModule x: artifact.getReadByProcessModules()) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				lResult.add(x);
			}
		}
		return lResult;
	}
	
	public static Set<Artifact> ProcessModule_getInputs(ProcessModule pm,Named nScope) {
		Set<Artifact> lResult = new HashSet<Artifact>();
		for (Artifact x: pm.getInputArtifacts()) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				lResult.add(x);
			}
		}
		return lResult;
	}
	public static Set<ProcessModule> ProcessModule_getAfterProcessModules(ProcessModule pm,Named nScope) {
		Set<ProcessModule> lResult = new HashSet<ProcessModule>();
		for (ProcessModule x: pm.getAfterProcessModules()) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				lResult.add(x);
			}
		}
		return lResult;
	}
	public static Set<ProcessModule> ProcessModule_getSubModulesIncludingRefs(ProcessModule pm,Named nScope) {
		Set<ProcessModule> lResult = new HashSet<ProcessModule>();
		for (ProcessModule x: pm.getSubProcessModules()) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				lResult.add(x);
			}
		}
		for (ProcessModule x: pm.getSubProcessModuleReferences()) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				lResult.add(x);
			}
		}
		return lResult;
	}
	public static Set<ProcessModule> Process_getProcessModules(Process pm,Named nScope) {
		Set<ProcessModule> lResult = new HashSet<ProcessModule>();
		for (ProcessModule x: pm.getProcessModules()) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				lResult.add(x);
			}
		}
		return lResult;
	}

	public static Set<Artifact> Process_getArtifacts(Process pm,Named nScope) {
		Set<Artifact> lResult = new HashSet<Artifact>();
		for (Artifact x: pm.getArtifacts()) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				lResult.add(x);
			}
		}
		return lResult;
	}

	public static Set<Artifact> ProcessModule_getArtifacts(ProcessModule pm,Named nScope) {
		Set<Artifact> lResult = new HashSet<Artifact>();
		for (Artifact x: pm.getArtifacts()) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				lResult.add(x);
			}
		}
		return lResult;
	}

	public static Set<Artifact> ProcessModule_getOutputs(ProcessModule pm,Named nScope) {
		Set<Artifact> lResult = new HashSet<Artifact>();
		for (Artifact x: pm.getOutputArtifacts()) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				lResult.add(x);
			}
		}
		return lResult;
	}
	
	/** computes the local artifacts, that are created and used within the process */
	public static Set<Artifact> ProcessModule_getLocalArtifacts(ProcessModule pm,Named nScope) {
		Set<Artifact> lResult = new HashSet<Artifact>();
		for (Artifact x: HierarchyModel.getLocalArtifacts(pm)) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				lResult.add(x);
			}
		}
		return lResult;
	}


	public static Set<Artifact> Artifact_getSubArtifacts(Artifact artifact,Named nScope) {
		Set<Artifact> sResult = new HashSet<Artifact>(artifact.getSubArtifacts());
		Set<Artifact> sSub = new HashSet<Artifact>(artifact.getSubArtifacts());
		sSub.addAll(artifact.getSubArtifactReferences());
		for (Artifact x:sSub) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				sResult.add(x);
			}
		}
		return sResult;
	}

	public static Map<ProcessModule,Artifact> Artifact_getAllCreatedByProcessModules(Artifact artifact,Named nScope) {
		Map<ProcessModule, Artifact> mResult = new HashMap<ProcessModule, Artifact>();
		Map<ProcessModule, Artifact> allCreadedByProcessModules = HierarchyModel.getAllCreatedByProcessModules(artifact);
		for (ProcessModule x: allCreadedByProcessModules.keySet()) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				mResult.put(x, allCreadedByProcessModules.get(x));
			}
		}
		return mResult;
	}

	public static Map<ProcessModule,Artifact> Artifact_getAllReadByProcessModules(Artifact artifact,Named nScope) {
		Map<ProcessModule, Artifact> mResult = new HashMap<ProcessModule, Artifact>();
		Map<ProcessModule, Artifact> allReadByProcessModules = HierarchyModel.getAllReadByProcessModules(artifact);
		for (ProcessModule x: allReadByProcessModules.keySet()) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				mResult.put(x, allReadByProcessModules.get(x));
			}
		}
		return mResult;
	}

	public static List<ProcessModule> Artifact_getCreatedByProcessModules(Artifact artifact,Named nScope) {
		List<ProcessModule> lResult = new LinkedList<ProcessModule>();
		for (ProcessModule x: artifact.getCreatedByProcessModules()) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				lResult.add(x);
			}
		}
		return lResult;
	}

	public static List<IVerifier> Artifact_getVerifiedBy(Artifact artifact,Named nScope) {
		List<IVerifier> lResult = new LinkedList<IVerifier>();
		for (IVerifier x: artifact.getVerifiedBy()) {
			if (!HierarchyModel.getDeactivatedSuper(x)) {
				lResult.add(x);
			}
			if (x instanceof Variantable && VariantModel.isActive((Variantable)x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				lResult.add(x);
			}
		}
		return lResult;
	}

	public static Map<Artifact,ProcessModule> Artifact_getAllInputsFromArtifact(ProcessModule artifact,Named nScope) {
		Map<Artifact, ProcessModule> mResult = new HashMap<Artifact, ProcessModule>();
		Map<Artifact, ProcessModule> allInputsFromArtifact = HierarchyModel.getAllInputsFromArtifact(artifact);
		for (Artifact x: allInputsFromArtifact.keySet()) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				mResult.put(x, allInputsFromArtifact.get(x));
			}
		}
		return mResult;
	}

	public static Map<Artifact,ProcessModule> Artifact_getAllOutputsFromArtifact(ProcessModule artifact,Named nScope) {
		Map<Artifact, ProcessModule> mResult = new HashMap<Artifact, ProcessModule>();
		Map<Artifact, ProcessModule> allOutputsFromArtifact = HierarchyModel.getAllOutputsFromArtifact(artifact);
		for (Artifact x: allOutputsFromArtifact.keySet()) {
			if (VariantModel.isActive(x, nScope)!=ACTIVATION.ACTIVE_NEVER 
					&& !getDeactivatedSuper(x,nScope)) {
				mResult.put(x, allOutputsFromArtifact.get(x));
			}
		}
		return mResult;
	}
}
