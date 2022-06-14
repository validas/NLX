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
package de.validas.spm.terms.model.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;

import de.validas.pmt.utils.HierarchyModel;
import metaModel.terms.Binding;
import metaModel.terms.EnumValueRef;
import metaModel.terms.ParamRef;
import metaModel.terms.Parameter;
import metaModel.terms.Term;
import metaModel.terms.TermsPackage;
import metaModel.terms.Type;
import metaModel.terms.util.TermsSwitch;

public class TermsValidationSwitch extends TermsSwitch<Boolean> implements EValidator {

	protected DiagnosticChain diagnostics;
	protected Map<Object, Object> context;

	protected boolean validate(int classifierID, EObject value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		this.diagnostics = diagnostics;
		this.context = context;
		if (HierarchyModel.getDeactivatedSuper(value)) {
			return true;
		}
		//FIXME: AF: need to find a way to automate the order of checks: subclass should be before superclass

		if (value instanceof EnumValueRef) {
			EnumValueRef object = (EnumValueRef) value;
			return doSwitch(TermsPackage.ENUM_VALUE_REF, object);
		}
		if (value instanceof ParamRef) {
			ParamRef object = (ParamRef) value;
			return doSwitch(TermsPackage.PARAM_REF, object);
		}
		if (value instanceof Term) {
			Term object = (Term) value;
			return doSwitch(TermsPackage.TERM, object);
		}
		if (value instanceof Parameter) {
			Parameter object = (Parameter) value;
			return doSwitch(TermsPackage.PARAMETER, object);
		}
		if (value instanceof Type) {
			Type object = (Type) value;
			return doSwitch(TermsPackage.TYPE, object);
		}
		if (value instanceof Binding) {
			Binding object = (Binding) value;
			return doSwitch(TermsPackage.BINDING, object);
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
		return true;
	}

}
