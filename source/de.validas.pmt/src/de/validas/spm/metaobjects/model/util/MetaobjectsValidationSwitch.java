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
package de.validas.spm.metaobjects.model.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;

import de.validas.pmt.utils.HierarchyModel;
import metaModel.modellDescr.MMCondition;
import metaModel.modellDescr.MetaModel;
import metaModel.modellDescr.MetaModelAssociation;
import metaModel.modellDescr.MetaModelAttribute;
import metaModel.modellDescr.MetaModelElement;
import metaModel.modellDescr.ModellDescrPackage;
import metaModel.modellDescr.ProzessCondition;
import metaModel.modellDescr.util.ModellDescrSwitch;

public class MetaobjectsValidationSwitch extends ModellDescrSwitch<Boolean> implements EValidator {

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

		if (value instanceof MMCondition) {
			MMCondition object = (MMCondition) value;
			return doSwitch(ModellDescrPackage.MM_CONDITION, object);
		}
		if (value instanceof MetaModelElement) {
			MetaModelElement object = (MetaModelElement) value;
			return doSwitch(ModellDescrPackage.META_MODEL_ELEMENT, object);
		}
		if (value instanceof MetaModelAssociation) {
			MetaModelAssociation object = (MetaModelAssociation) value;
			return doSwitch(ModellDescrPackage.META_MODEL_ASSOCIATION, object);
		}
		if (value instanceof MetaModelAttribute) {
			ProzessCondition object = (ProzessCondition) value;
			return doSwitch(ModellDescrPackage.PROZESS_CONDITION, object);
		}
		if (value instanceof MetaModelAttribute) {
			MetaModel object = (MetaModel) value;
			return doSwitch(ModellDescrPackage.META_MODEL, object);
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
