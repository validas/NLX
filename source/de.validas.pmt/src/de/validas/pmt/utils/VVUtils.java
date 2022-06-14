/**
 * 
 */
package de.validas.pmt.utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.Process;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.Requirement;
import metaModel.referenceProcess.VerificationModule;
import metaModel.suptertype.Named;
import metaModel.terms.Parameter;

/**
 * @author slotosch
 * some utilities for V&V checks (used in Compliance report generator and PMT2VV)
 */
public class VVUtils {

	public static Set<VerificationModule> getAllRelevantVerificationModules(ProcessModule pmRoot,Named nScope, boolean bUseOnlyClaimed) {
		final Set<VerificationModule> allVMs = new HashSet<VerificationModule>();
		Set<ProcessModule> sPMs = VariantModel.ProcessModule_getAllProcessModules(pmRoot, nScope);
		// System.out.println("getAllRelevantVerificationModules checking "+pmRoot.getName()+" with "+sPMs.size());
		for (final ProcessModule pm : sPMs) {
			// System.out.println("getAllRelevantVerificationModules: checking "+pm.getName());
			if (pm instanceof VerificationModule) {
				allVMs.add((VerificationModule) pm);
			}
		}
		if (bUseOnlyClaimed==false) {
			return addContainedVMs(allVMs,nScope);
		}
		return addContainedVMs(filterClaimedVerificationModules(pmRoot, allVMs),nScope);
	}
	
	/** ads contained VMs */
	public static Set<VerificationModule> addContainedVMs(Set<VerificationModule> sVMs,Named nScope) {
		Set<VerificationModule> sRes = new HashSet<>();
		for (VerificationModule vm:sVMs) {
			sRes.addAll(addContainedVMs(vm,nScope)); 
		}
		return sRes;
	}

	/** ads contained VMs */
	public static Set<VerificationModule> addContainedVMs(VerificationModule vm,Named nScope) {
		Set<VerificationModule> sRes = new HashSet<>();
		sRes.add(vm);
		for (ProcessModule pm:VariantModel.ProcessModule_getChildProcessModules(vm, nScope)) {
			if (pm instanceof VerificationModule) {
				sRes.addAll(addContainedVMs((VerificationModule)pm, nScope));
			}
		}
		return sRes;
	}

	public static Set<VerificationModule> filterClaimedVerificationModules(ProcessModule pmRoot,Set<VerificationModule> allVMs) {
		final Set<Requirement> claimedRequirements = new HashSet<Requirement>();
		for (Requirement r:pmRoot.getClaimedComplianceRequirements()) {
			claimedRequirements.add(r);
			try {
				claimedRequirements.addAll(HierarchyModel.getAllRequirementsWithRecursionCheck(r));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		final Set<VerificationModule> claimedVMs = new HashSet<VerificationModule>();
		for (Requirement r:claimedRequirements) {
			for (Compliance c:r.getCompliances()) {
				for (VerificationModule vm:c.getVerificationModules()) {
					if (allVMs.contains(vm)) {
						claimedVMs.add(vm);
					}
				}
			}
		}
		return claimedVMs;

	}
	public static Map<String, Map<Artifact, Set<VerificationModule>>> getVerificationPathMap(
			final Set<VerificationModule> sExplicitVMs) {
			// now sort the checks
			final Map<String, Map<Artifact, Set<VerificationModule>>> mChecks = new HashMap<String, Map<Artifact, Set<VerificationModule>>>();
			for (final VerificationModule vvMod : sExplicitVMs) {
				final Map<String, Set<Artifact>> mPaths = HierarchyModel.getAllVerifiedInputArtifactPathMaps(vvMod);
				for (final String sP : mPaths.keySet()) {
					if (!mChecks.containsKey(sP)) {
						mChecks.put(sP, new HashMap<Artifact, Set<VerificationModule>>());
					}
					final Map<Artifact, Set<VerificationModule>> m = mChecks.get(sP);
					for (final Artifact a : mPaths.get(sP)) {
						if (!m.containsKey(a)) {
							m.put(a, new HashSet<VerificationModule>());
						}
						m.get(a).add(vvMod);
					}
				}
			}
			return mChecks;
		}

	/** returns the sorted list of parameters that are relevant for this module */
	public static List<Parameter> getRelevantParameters(ProcessModule pmMain) {
		final Map<Parameter, Object> mPs = ParameterUtils.getPrintableParameters(pmMain);
		final List<Parameter> lAllPrintParams = new LinkedList<Parameter>();
		lAllPrintParams.addAll(mPs.keySet());
		Collections.sort(lAllPrintParams, new NamedComparator());
		return lAllPrintParams;
	}

}
