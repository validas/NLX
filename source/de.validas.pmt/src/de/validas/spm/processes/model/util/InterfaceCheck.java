/*****************************************************************************************
 * Copyright (c) Validas AG 2010-2019 
 *
 * VALIDAS AG AND ITS AFFILIATES MAKE NO WARRANTY OF ANY KIND 
 * WITH REGARD TO THIS MATERIAL INCLUDING, BUT NOT LIMITED TO, 
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. 
 * THIS EXCLUSION OF LIABILITY BUT WILL NOT APPLY TO CLAIMS, 
 * LOSSES, DAMAGES, COSTS (INCLUDING LEGAL COSTS), EXPENSES AND LIABILITIES 
 * CAUSED BY GROSS NEGLIGENCE ("GROBE FAHRLÄSSIGKEIT") OF THE MANAGERIAL 
 * AND SENIOR SUPERVISORY PERSONNEL OF VALIDAS AG AND ITS AFFILIATES, 
 * OR THE WILLFUL MISCONDUCT ("VORSATZ") OF VALIDAS AG AND ITS AFFILIATES. 
 * IT IS ALSO NOT APPLICABLE IN CASE THE GERMAN PRODUCT LIABILITY ACT IS APPLICABLE 
 * OR IN CASE OF INJURY OR DEATH TO PERSONS. 
 * VALIDAS AG AND ITS AFFILIATES SHALL NOT BE LIABLE FOR ANY INCIDENTAL, 
 * INDIRECT, SPECIAL, OR CONSEQUENTIAL DAMAGES WHATSOEVER 
 * (INCLUDING BUT NOT LIMITED TO LOST PROFITS) ARISING OUT OF 
 * OR RELATED TO THIS PUBLICATION OR THE INFORMATION CONTAINED IN IT, 
 * EVEN IF VALIDAS AG AND ITS AFFILIATES HAVE BEEN ADVISED 
 * OF THE POSSIBILITY OF SUCH DAMAGES. 
 * 
 * Contributors:  
 *     Validas AG - Initial API and implementation.
 *****************************************************************************************/
package de.validas.spm.processes.model.util;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.validas.pmt.utils.DeactivationModel;
import de.validas.pmt.utils.HierarchyModel;
import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.ProcessModule;
import metaModel.suptertype.Named;

public class InterfaceCheck extends ProcessesValidationSwitch {

	public static final String DIAGNOSTIC_SOURCE = InterfaceCheck.class.getSimpleName();
	public static final boolean DIAGNOSTIC_ENABLED = Boolean.TRUE.booleanValue();

	@Override
	public Boolean caseProcessModule(ProcessModule processModule) {
		boolean bResult=true;
		String sMsg=":";
		Named nScope = processModule; // as long as not specified globally  
		Set<Artifact> sInputs = DeactivationModel.ProcessModule_getInputs(processModule,nScope);
		Set<Artifact> sOutputs = DeactivationModel.ProcessModule_getOutputs(processModule,nScope);
		Set<Artifact> sLocals = DeactivationModel.ProcessModule_getLocalArtifacts(processModule,nScope);
		
		// closures: inlcuding super and usbelements
		Set<Artifact> sAllInputs = new HashSet<Artifact>();
		Set<Artifact> sAllOutputs = new HashSet<Artifact>();
		Set<Artifact> sAllLocals = new HashSet<Artifact>();
		for (Artifact a:sInputs) {
			sAllInputs.addAll(HierarchyModel.getAllArtifacts(a));
			sAllInputs.addAll(HierarchyModel.getAllSuperArtifacts(a));
		}
		for (Artifact a:sOutputs) {
			sAllOutputs.addAll(HierarchyModel.getAllArtifacts(a));
			sAllOutputs.addAll(HierarchyModel.getAllSuperArtifacts(a));
		}
		for (Artifact a:sLocals) {
			sAllLocals.addAll(HierarchyModel.getAllArtifacts(a));
			sAllLocals.addAll(HierarchyModel.getAllSuperArtifacts(a));
		}

		Set<Artifact> sUnusedInputs= new HashSet<Artifact>(sInputs);
		Set<Artifact> sUnusedOutputs= new HashSet<Artifact>(sOutputs);
		Set<ProcessModule> sAllPs= new HashSet<ProcessModule>();
		sAllPs.addAll(processModule.getSubProcessModules());
		sAllPs.addAll(processModule.getSubProcessModuleReferences());
		for (ProcessModule pSub:sAllPs) {
			for (Artifact a:DeactivationModel.ProcessModule_getInputs(pSub,nScope)) {
				sUnusedInputs.remove(a);
				// System.out.println("removing from "+pSub.getName()+" input "+a.getName()+" with "+HierarchyModel.getAllArtifacts(a).size());
				sUnusedInputs.removeAll(HierarchyModel.getAllArtifacts(a));
				sUnusedInputs.removeAll(HierarchyModel.getAllSuperArtifacts(a));
				// now check if the sub-input is contained in inputs of PM or locals
				if (!sAllLocals.contains(a) && !sAllInputs.contains(a)) {
					bResult=false;
					sMsg+=" sub-process '"+pSub.getName()+"' uses unavailable input '"+a.getName()+"'";
				}
			}
		}
		for (ProcessModule pSub:sAllPs) {
			for (Artifact a:DeactivationModel.ProcessModule_getOutputs(pSub,nScope)) {
				sUnusedOutputs.remove(a);
				sUnusedOutputs.removeAll(HierarchyModel.getAllArtifacts(a));
				sUnusedOutputs.removeAll(HierarchyModel.getAllSuperArtifacts(a));
				// now check if the sub-input is contained in inputs of PM or locals
				if (!sAllLocals.contains(a) && !sAllOutputs.contains(a)) {
					bResult=false;
					sMsg+=" sub-process '"+pSub.getName()+"' produces additional output '"+a.getName()+"'";
				}
			}
		}
		if (sAllPs.size()>0) {
			for (Artifact aUnused:sUnusedInputs) {
				bResult=false;
				sMsg+=" unused input '"+aUnused.getName()+"'";
			}
			for (Artifact aUnused:sUnusedOutputs) {
				bResult=false;
				sMsg+=" uncreated output '"+aUnused.getName()+"'";
			}
		}
		if (!bResult) {
			if (diagnostics != null) {
				int severity = Diagnostic.ERROR;
				String source = DIAGNOSTIC_SOURCE;
				int code = 0;
				String label = EObjectValidator.getObjectLabel(processModule, context);
				String message = label + sMsg;
				Object[] data = new Object[] { processModule };
				Diagnostic diagnostic = new BasicDiagnostic(severity, source, code, message, data);
				diagnostics.add(diagnostic);
			}
			return false;
		}
		return true;
	}

}
