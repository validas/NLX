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
package de.validas.spm.supertypes.model.util;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.validas.pmt.utils.HierarchyModel;
import metaModel.suptertype.Named;
import metaModel.terms.Constant;

public class TypeUniqueName extends SuptertypeValidationSwitch {

	public static final String DIAGNOSTIC_SOURCE = TypeUniqueName.class.getSimpleName();
	public static final boolean DIAGNOSTIC_ENABLED = Boolean.TRUE.booleanValue();

	@Override
	public Boolean caseNamed(Named named) {
		boolean bOK = true;
		String sMsg = "";
		metaModel.referenceProcess.Process pRoot = HierarchyModel.getProzessSuper(named);
		if (pRoot == null) {
			// temporarily possible
			return true;
		}
		TreeIterator<EObject> it = pRoot.eAllContents();
		String sName = "";
		if (named.getName() != null) {
			sName = named.getName();
		}
		String sClassName = named.eClass().getName();
		while (it.hasNext()) {
			EObject eo = it.next();
			if (eo instanceof Named && !(eo instanceof Constant)) {
				String sTyp = eo.eClass().getName();
				if (sTyp.equals(sClassName) && eo != named && ((Named) eo).getName() != null
						&& ((Named) eo).getName().equals(sName)) {
					sMsg += "Same Name '" + sName + "' for " + sClassName + " in '" + HierarchyModel.getQualName(named)
							+ "' and '" + HierarchyModel.getQualName((Named) eo) + "'.";
					bOK = false;
				}
			}
		}

		if (!bOK) {
			if (diagnostics != null) {
				int severity = Diagnostic.ERROR;
				String source = DIAGNOSTIC_SOURCE;
				int code = 0;
				String label = EObjectValidator.getObjectLabel(named, context);
				String message = label + sMsg;
				Object[] data = new Object[] { named };
				Diagnostic diagnostic = new BasicDiagnostic(severity, source, code, message, data);
				diagnostics.add(diagnostic);
			}
			return false;
		}
		return true;
	}

}
