/**
 * 
 */
package de.validas.spedit.ui.editor.model;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.editor.validation.AnnotationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.ValidationJob;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;

import com.google.inject.Inject;

import de.validas.spedit.ui.editor.validation.NlxAnnotationIssueProcessor; 

/**
 * @author Felix Schaller
 *
 */
public class NlxDocumentProvider extends XtextDocumentProvider {

	/**
	 * 
	 */
	@Inject
	private IssueResolutionProvider nlxIssueResolutionProvider;
	
	@Inject
	private IResourceValidator nlxResourceValidator;
	
	
	public NlxDocumentProvider() {
		super();
	}
	
	/**
	 * Overwrites AnnotationInfo Processor from XtextDocumentProvider
	 */
	@Override
	protected void registerAnnotationInfoProcessor(ElementInfo info) {
		XtextDocument doc = (XtextDocument) info.fDocument;
		if(info.fModel != null) {
			AnnotationIssueProcessor annotationIssueProcessor = new NlxAnnotationIssueProcessor(doc, info.fModel,
				nlxIssueResolutionProvider);
			ValidationJob job = new ValidationJob(nlxResourceValidator, doc, annotationIssueProcessor, CheckMode.FAST_ONLY);
			doc.setValidationJob(job);
		}
	}

	/**
	 * Overwrites Annotation Model Creation from XtextDocumentProvider
	 */
	@Override
	protected IAnnotationModel createAnnotationModel(Object element) throws CoreException {
		// TODO Auto-generated method stub
		return super.createAnnotationModel(element);
	}

}
