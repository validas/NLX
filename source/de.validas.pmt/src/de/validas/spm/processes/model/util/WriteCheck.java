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
import metaModel.suptertype.Named;

public class WriteCheck extends ProcessesValidationSwitch {

	public static final String DIAGNOSTIC_SOURCE = WriteCheck.class.getSimpleName();
	public static final boolean DIAGNOSTIC_ENABLED = Boolean.TRUE.booleanValue();

	@Override
	public Boolean caseArtifact(Artifact artifact) {
		boolean bResult=true;
		Named nScope = HierarchyModel.getProzessSuper(artifact); // as long as not specified globally  
		String sMsg="";
		if (DeactivationModel.Artifact_getCreatedByProcessModules(artifact,nScope).size()==0 && !artifact.isProjectInput()) {
			bResult=false;
			sMsg+=": no active Creator and not project input.";
//			// check super-product (not hierarchic)
//			if (artifact.eContainer() instanceof Artifact) {
//				Artifact aSuper=(Artifact)artifact.eContainer();
//				if (DeactivationModel.Artifact_getAllCreatedByProcessModules(aSuper).size()==0 
//						&& !aSuper.isProjectInput()) {
//					sMsg+=" (nor "+aSuper.getName()+")";
//				} else {
//					bResult=true;
//				}
//			}
			// check sub-artifacts (if necessary)
			if (!bResult) {
				Set<Artifact> sSubArts=new HashSet<Artifact>();
				sSubArts.addAll(artifact.getSubArtifacts());
				sSubArts.addAll(artifact.getSubArtifactReferences());
				boolean bAllOK=sSubArts.size()>0;
				for (Artifact aSub:sSubArts) {
					if (DeactivationModel.Artifact_getCreatedByProcessModules(aSub,nScope).size()==0 
							&& !aSub.isProjectInput())  {
						bAllOK=false;
					}
				}
				if (bAllOK) {
					bResult=true;
				} else {
					if (sSubArts.size()>0) {
						String sPlur=(sSubArts.size()>1)?"s":"";
						sMsg+=" (nor all "+sSubArts.size()+" sub-artifact"+sPlur+")";
					}
				}
			}

		}
		if (!bResult) {
			if (diagnostics != null) {
				int severity = Diagnostic.ERROR;
				String source = DIAGNOSTIC_SOURCE;
				int code = 0;
				String label = EObjectValidator.getObjectLabel(artifact, context);
				String message = label + sMsg;
				Object[] data = new Object[] { artifact };
				Diagnostic diagnostic = new BasicDiagnostic(severity, source, code, message, data);
				diagnostics.add(diagnostic);
			}
			return false;
		}
		return true;
	}

}
