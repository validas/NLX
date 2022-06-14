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

import de.validas.pmt.utils.VariantModel.ACTIVATION;
import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.Process;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.Requirement;
import metaModel.referenceProcess.StakeHolder;
import metaModel.referenceProcess.Tool;
import metaModel.referenceProcess.VerificationModule;
import metaModel.suptertype.Named;
import metaModel.suptertype.Variantable;
import metaModel.terms.BoolTerm;
import metaModel.terms.ParamRef;
import metaModel.terms.Parameter;
import metaModel.terms.Term;

/**
 * utilities for the process
 * @author slotosch
 *
 */
public class ProcessUtils {
	public static Map<String,List<List<String>>> exportToExcel(Named named) throws Exception {
		Map<String,List<List<String>>> mResult = new HashMap<String, List<List<String>>>();
		Set<Parameter> sParameters = VariantModel.Named_getAllParameters(named);
		Set<Artifact> sArtifacts = VariantModel.Named_getAllArtifacts(named);
		Set<Requirement> sRequirements = VariantModel.Named_getAllClaimedAndContainedRequirements(named);
		Set<VerificationModule> sVMs = VariantModel.Named_getAllVerificationModules(named);
		Set<ProcessModule> sPMs = VariantModel.Named_getAllProcessModules(named);
		Set<Compliance> sCompliances = VariantModel.Named_getAllClaimedAndContainedCompliances(named);
		Set<StakeHolder> sRoles = VariantModel.Named_getAllRoles(named);
		Set<Tool> sTools = VariantModel.Named_getAllTools(named);
		Set<Variantable> sVariants = VariantModel.Named_getAllVariantables(named);

		List<Requirement> lRequirements = new LinkedList<Requirement>(sRequirements);
		Collections.sort(lRequirements, new NamedComparator(true));
		List<Parameter> lParameters = new LinkedList<Parameter>(sParameters);
		Collections.sort(lParameters, new NamedComparator());
		List<Artifact> lArtifacts = new LinkedList<Artifact>(sArtifacts);
		Collections.sort(lArtifacts, new NamedComparator(true));
		List<VerificationModule> lVMs = new LinkedList<VerificationModule>(sVMs);
		Collections.sort(lVMs, new NamedComparator(true));
		List<ProcessModule> lPMs = new LinkedList<ProcessModule>(sPMs);
		Collections.sort(lPMs, new NamedComparator(true));
		List<Compliance> lCompliances = new LinkedList<Compliance>(sCompliances);
		Collections.sort(lCompliances, new NamedComparator(true));
		List<StakeHolder> lRoles = new LinkedList<StakeHolder>(sRoles);
		Collections.sort(lRoles, new NamedComparator(true));
		List<Tool> lTools = new LinkedList<Tool>(sTools);
		Collections.sort(lTools, new NamedComparator(true));
		List<Variantable> lVariants = new LinkedList<Variantable>(sVariants);
		Collections.sort(lVariants, new NamedComparator(true));
		// now add the elements to the excel tab
		List<List<String>> lTabParam= new LinkedList<List<String>>();
		mResult.put("PARAMETER", lTabParam);
		lTabParam.add(getParamTabHeader());
		for (Parameter p:sParameters) {
			List<String> lRow=new LinkedList<String>();
			lTabParam.add(lRow);
			lRow.add(p.getName());
			if (p.getType()!=null) {
				lRow.add(TermUtils.printType(p.getType()));
			} else {
				lRow.add("");
			}
			addContainer(p, lRow);
		}
		List<List<String>> lTabProcs= new LinkedList<List<String>>();
		mResult.put("PROCESS", lTabProcs);
		lTabProcs.add(getParamTabHeader());
		for (ProcessModule pm:lPMs) {
			List<String> lRow=new LinkedList<String>();
			lTabProcs.add(lRow);
			lRow.add(pm.getName());
			lRow.add("String");
			addContainer(pm, lRow);
		}
		List<List<String>> lTabReqs= new LinkedList<List<String>>();
		mResult.put("REQUIREMENT", lTabReqs);
		lTabReqs.add(getParamTabHeader());
		for (Requirement pm:lRequirements) {
			List<String> lRow=new LinkedList<String>();
			lTabReqs.add(lRow);
			if (pm.getID()!=null && !pm.getID().trim().equals("")) {
				lRow.add(pm.getID());
			} else {
				lRow.add(pm.getName());
			}
			lRow.add("String");
			addContainer(pm, lRow);
		}
		List<List<String>> lTabVMs= new LinkedList<List<String>>();
		mResult.put("VERIFICATION", lTabVMs);
		lTabVMs.add(getParamTabHeader());
		for (VerificationModule vm:lVMs) {
			List<String> lRow=new LinkedList<String>();
			lTabVMs.add(lRow);
			lRow.add(vm.getName());
			lRow.add("String");
			addContainer(vm, lRow);
		}
		List<List<String>> lTabArts= new LinkedList<List<String>>();
		mResult.put("PROCESS_ARTIFACT", lTabArts);
		lTabArts.add(getParamTabHeader());
		for (Artifact art:lArtifacts) {
			List<String> lRow=new LinkedList<String>();
			lTabArts.add(lRow);
			lRow.add(art.getName());
			lRow.add("String");
			addContainer(art, lRow);
		}
		List<List<String>> lTabTools= new LinkedList<List<String>>();
		mResult.put("TOOL", lTabTools);
		lTabTools.add(getParamTabHeader());
		for (Tool t:lTools) {
			List<String> lRow=new LinkedList<String>();
			lTabTools.add(lRow);
			lRow.add(t.getName());
			lRow.add("String");
			addContainer(t, lRow);
		}

		List<List<String>> lTabRoles= new LinkedList<List<String>>();
		mResult.put("ROLE", lTabRoles);
		lTabRoles.add(getParamTabHeader());
		for (StakeHolder sh:lRoles) {
			List<String> lRow=new LinkedList<String>();
			lTabRoles.add(lRow);
			lRow.add(sh.getName());
			lRow.add("String");
			addContainer(sh, lRow);
		}
		List<List<String>> lTabCompl= new LinkedList<List<String>>();
		mResult.put("COMPLIANCE", lTabCompl);
		lTabCompl.add(getParamTabHeader());
		for (Compliance c:lCompliances) {
			List<String> lRow=new LinkedList<String>();
			lTabCompl.add(lRow);
			lRow.add(c.getName());
			lRow.add("String");
			addContainer(c, lRow);
		}
		List<List<String>> lTabVariant= new LinkedList<List<String>>();
		mResult.put("VARIANT", lTabVariant);
		lTabVariant.add(getParamTabHeader());
		for (Variantable c:lVariants) {
			for (BoolTerm bt:c.getVariants()) {
				List<String> lRow=new LinkedList<String>();
				lTabVariant.add(lRow);
				lRow.add(c.getName()+"_"+TermUtils.printTerm(bt));
				lRow.add("Variant-Term");
				addContainer(bt, lRow);
			}
		}
		return mResult;
	}

	private static void addContainer(EObject p, List<String> lRow) {
		if (p.eContainer() instanceof ProcessModule) {
			String sCont=HierarchyModel.getQualProcessModuleName((ProcessModule)p.eContainer());
			lRow.add(sCont);
		} else if (p.eContainer() instanceof Process) {
			String sCont=((Process)p.eContainer()).getName();
			lRow.add(sCont);
		} else if (p.eContainer() instanceof Artifact) {
			String sCont=HierarchyModel.getQualArtifactName((Artifact)p.eContainer());
			lRow.add(sCont);
		} else if (p.eContainer() instanceof Requirement) {
			Requirement r=(Requirement)p.eContainer();
			String sCont=r.getID()+":"+r.getName();
			lRow.add(sCont);
		} else {
			lRow.add("");
		}
	}

	private static List<String> getParamTabHeader() {
		List<String> lHeader=new LinkedList<String>();
		lHeader.add(BindingUtils.PARAMETER_VALUE);
		lHeader.add(BindingUtils.PARAMETER_TYPE);
		lHeader.add(BindingUtils.PARAMETER_CONTAINER);
		return lHeader;
	}

	private static void addProcessModule(Set<Artifact> sArtifacts, Set<VerificationModule> sVMs,Set<ProcessModule> sPMs,
			Set<Compliance> sCompliances, Set<Parameter> sParameters, Set<StakeHolder> sRoles, Set<Tool> sTools,
			Set<Requirement> sRequirements,ProcessModule pm,Named nScope)
					throws Exception {
		if (VariantModel.isActive(pm, nScope)!=ACTIVATION.ACTIVE_NEVER) {
			for (Compliance c:pm.getCompliances()) {
				if (VariantModel.isActive(c, nScope)!=ACTIVATION.ACTIVE_NEVER) {
					sCompliances.add(c);
				}
			}
			sTools.addAll(pm.getTools());
			if (pm instanceof VerificationModule) {
				sVMs.add((VerificationModule)pm);
			} else {				
				sPMs.add(pm);
			}
			addArtifacts(sArtifacts,sParameters, pm,nScope);
			for (Artifact a:HierarchyModel.getAllOutputs(pm)) {
				if (VariantModel.isActive(a, nScope)!=ACTIVATION.ACTIVE_NEVER) {
					sArtifacts.add(a);
				}
			}
			for (Artifact a:HierarchyModel.getAllInputs(pm)) {
				if (VariantModel.isActive(a, nScope)!=ACTIVATION.ACTIVE_NEVER) {
					sArtifacts.add(a);
				}
			}
			for (Artifact a:HierarchyModel.getAllVerifiedInputArtifacts(pm)) {
				if (VariantModel.isActive(a, nScope)!=ACTIVATION.ACTIVE_NEVER) {
					sArtifacts.add(a);
				}
			}
			sRoles.addAll(HierarchyModel.getAllStakeHolders(pm));
			for (Requirement req:pm.getClaimedComplianceRequirements()) {
				for (Requirement r:HierarchyModel.getAllRequirementsWithRecursionCheck(req)) {
					if (VariantModel.isActive(r, nScope)!=ACTIVATION.ACTIVE_NEVER) {
						for (Compliance c:r.getCompliances()) {
							if (VariantModel.isActive(c, nScope)!=ACTIVATION.ACTIVE_NEVER) {
								sCompliances.add(c);
							}
						}
					}
				}
			}
		}
	}

	private static void addArtifacts(Set<Artifact> sArtifacts, Set<Parameter> sParameters, ProcessModule pm,Named nScope) {
		for (Artifact art:HierarchyModel.getAllInputs(pm)) {
			if (VariantModel.isActive(art, nScope)!=ACTIVATION.ACTIVE_NEVER) {
				sArtifacts.add(art);
				for (BoolTerm bt:art.getVariants()) {
					TreeIterator<EObject> i=bt.eAllContents();
					while (i.hasNext()) {
						EObject eo=i.next();
						if (eo instanceof ParamRef && ((ParamRef)eo).getParameter()!=null) {
							sParameters.add(((ParamRef)eo).getParameter());
						}
					}
				}
			}
		}
	}

}
