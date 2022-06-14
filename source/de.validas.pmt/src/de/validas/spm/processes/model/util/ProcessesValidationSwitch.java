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
 *     Alexander Fedorov <alexander.fedorov@arsysop.ru> - Initial API and implementation.
 *****************************************************************************************/
package de.validas.spm.processes.model.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;

import de.validas.pmt.utils.HierarchyModel;
import metaModel.referenceProcess.Artifact;
import metaModel.referenceProcess.Compliance;
import metaModel.referenceProcess.Model;
import metaModel.referenceProcess.ProcessModule;
import metaModel.referenceProcess.ReferenceProcessPackage;
import metaModel.referenceProcess.Requirement;
import metaModel.referenceProcess.Tool;
import metaModel.referenceProcess.VerificationModule;
import metaModel.referenceProcess.util.ReferenceProcessSwitch;

public class ProcessesValidationSwitch extends ReferenceProcessSwitch<Boolean> implements EValidator {
	
	protected DiagnosticChain diagnostics;
	protected Map<Object, Object> context;

	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		this.diagnostics = diagnostics;
		this.context = context;
		if (value instanceof EObject && HierarchyModel.getDeactivatedSuper((EObject)value)) {
			return true;
		}
		//FIXME: AF: need to find a way to automate the order of checks: subclass should be before superclass

		if (value instanceof Compliance) {
			Compliance object = (Compliance) value;
			return doSwitch(ReferenceProcessPackage.COMPLIANCE, object);
		}
		if (value instanceof Model) {
			Model object = (Model) value;
			return doSwitch(ReferenceProcessPackage.MODEL, object);
		}
		if (value instanceof Artifact) {
			Artifact object = (Artifact) value;
			return doSwitch(ReferenceProcessPackage.ARTIFACT, object);
		}
		if (value instanceof VerificationModule) {
			VerificationModule object = (VerificationModule) value;
			return doSwitch(ReferenceProcessPackage.VERIFICATION_MODULE, object);
		}
		if (value instanceof ProcessModule) {
			ProcessModule object = (ProcessModule) value;
			return doSwitch(ReferenceProcessPackage.PROCESS_MODULE, object);
		}
		if (value instanceof Requirement) {
			Requirement object = (Requirement) value;
			return doSwitch(ReferenceProcessPackage.REQUIREMENT, object);
		}
		if (value instanceof Tool) {
			Tool object = (Tool) value;
			return doSwitch(ReferenceProcessPackage.TOOL, object);
		}
		return true;
	}

	@Override
	public Boolean defaultCase(EObject object) {
		return Boolean.TRUE;
	}

	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(eClass.getClassifierID(), eObject, diagnostics, context);
	}

	@Override
	public boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(eDataType.getClassifierID(), value, diagnostics, context);
	}

}
