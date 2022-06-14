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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.validas.pmt.utils.MMUtils;
import metaModel.modellDescr.MetaModelAssociation;
import metaModel.modellDescr.MetaModelAttribute;
import metaModel.modellDescr.MetaModelElement;
import metaModel.referenceProcess.Model;

public class MMConsistentIncluded extends ProcessesValidationSwitch {

	public static final String DIAGNOSTIC_SOURCE = MMConsistentIncluded.class.getSimpleName();
	public static final boolean DIAGNOSTIC_ENABLED = Boolean.TRUE.booleanValue();

	@Override
	public Boolean caseModel(Model model) {
		boolean bResult=true;
		String sMsg="";

		Map<MetaModelElement,Model> mIncludedMandatoryElements=MMUtils.getIncludedMandatoryElements(model);
		Map<MetaModelElement,Model> mIncludedOptionalElements=MMUtils.getIncludedOptionalElements(model);
		for (MetaModelElement mme:model.getOptionalElements()) {
			if (mIncludedMandatoryElements.containsKey(mme)) {
				bResult=false;
				sMsg+=", Optional "+mme.eClass().getName()+" "+mme.getName()+" is mandatory in included model "
						+mIncludedMandatoryElements.get(mme).getName();
			}
		}
		for (MetaModelElement mme:model.getMandatoryElements()) {
			if (mIncludedMandatoryElements.containsKey(mme)) {
				bResult=false;
				sMsg+=", Mandatory "+mme.eClass().getName()+" "+mme.getName()+" is also mandatory in included model "
						+mIncludedMandatoryElements.get(mme).getName();
			}
		}	
		for (MetaModelElement mme:model.getOptionalElements()) {
			if (mIncludedOptionalElements.containsKey(mme)) {
				bResult=false;
				sMsg+=", Optional "+mme.eClass().getName()+" "+mme.getName()+" is also optional in included model "
						+mIncludedMandatoryElements.get(mme).getName();
			}
		}

		Map<MetaModelAttribute,Model> mIncludedMandatoryAttributes=MMUtils.getIncludedMandatoryAttributes(model);
		Map<MetaModelAttribute,Model> mIncludedOptionalAttributes=MMUtils.getIncludedOptionalAttributes(model);
		for (MetaModelAttribute mme:model.getOptionalAttributes()) {
			if (mIncludedMandatoryAttributes.containsKey(mme)) {
				bResult=false;
				sMsg+=", Optional "+mme.eClass().getName()+" "+mme.getName()+" is mandatory in included model "
						+mIncludedMandatoryAttributes.get(mme).getName();
			}
		}
		for (MetaModelAttribute mme:model.getMandatoryAttributes()) {
			if (mIncludedMandatoryAttributes.containsKey(mme)) {
				bResult=false;
				sMsg+=", Mandatory "+mme.eClass().getName()+" "+mme.getName()+" is also mandatory in included model "
						+mIncludedMandatoryAttributes.get(mme).getName();
			}
		}	
		for (MetaModelAttribute mme:model.getOptionalAttributes()) {
			if (mIncludedOptionalAttributes.containsKey(mme)) {
				bResult=false;
				sMsg+=", Optional "+mme.eClass().getName()+" "+mme.getName()+" is also optional in included model "
						+mIncludedOptionalAttributes.get(mme).getName();
			}
		}
		Map<MetaModelAssociation, Model> mIncludedMandatoryAssociations=MMUtils.getIncludedMandatoryAssociations(model);
		Map<MetaModelAssociation,Model> mIncludedOptionalAssociations=MMUtils.getIncludedOptionalAssociations(model);
		for (MetaModelAssociation mme:model.getOptionalAssociations()) {
			if (mIncludedMandatoryAssociations.containsKey(mme)) {
				bResult=false;
				sMsg+=", Optional "+mme.eClass().getName()+" "+mme.getName()+" is mandatory in included model "
						+mIncludedMandatoryAssociations.get(mme).getName();
			}
		}
		for (MetaModelAssociation mme:model.getMandatoryAssociations()) {
			if (mIncludedMandatoryAssociations.containsKey(mme)) {
				bResult=false;
				sMsg+=", Mandatory "+mme.eClass().getName()+" "+mme.getName()+" is also mandatory in included model "
						+mIncludedMandatoryAssociations.get(mme).getName();
			}
		}	
		for (MetaModelAssociation mme:model.getOptionalAssociations()) {
			if (mIncludedOptionalAssociations.containsKey(mme)) {
				bResult=false;
				sMsg+=", Optional "+mme.eClass().getName()+" "+mme.getName()+" is also optional in included model "
						+mIncludedOptionalAssociations.get(mme).getName();
			}
		}
		if (!bResult) {
			if (diagnostics != null) {
				int severity = Diagnostic.ERROR;
				String source = DIAGNOSTIC_SOURCE;
				int code = 0;
				String label = EObjectValidator.getObjectLabel(model, context);
				String message = label + sMsg;
				Object[] data = new Object[] { model };
				Diagnostic diagnostic = new BasicDiagnostic(severity, source, code, message, data);
				diagnostics.add(diagnostic);
			}
			return false;
		}
		return true;
	}

}
