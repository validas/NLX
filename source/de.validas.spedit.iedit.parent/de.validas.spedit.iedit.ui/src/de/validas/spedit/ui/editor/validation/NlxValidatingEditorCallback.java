/**
 * 
 */
package de.validas.spedit.ui.editor.validation;

import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.editor.validation.AnnotationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.IValidationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.MarkerCreator;
import org.eclipse.xtext.ui.editor.validation.MarkerIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.ValidationJob;
import org.eclipse.xtext.ui.validation.MarkerTypeProvider;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;

import com.google.inject.Inject;

/**
 * @author Felix Schaller
 *
 */
public class NlxValidatingEditorCallback extends IXtextEditorCallback.NullImpl {

	@Inject
	protected IResourceValidator resourceValidator;

	@Inject
	protected MarkerCreator markerCreator;

	@Inject
	protected MarkerTypeProvider markerTypeProvider;
	@Inject
	protected IssueResolutionProvider issueResolutionProvider;

	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		super.afterCreatePartControl(editor);
		if (editor.isEditable()) {
			ValidationJob validationJob = newValidationJob(editor);
			validationJob.schedule();
		}
	}

	@Override
	public void afterSave(XtextEditor editor) {
		super.afterSave(editor);
		if (editor.isEditable()) {
			ValidationJob validationJob = newValidationJob(editor);
			validationJob.schedule();
		}
	}

	protected ValidationJob newValidationJob(XtextEditor editor) {
		IValidationIssueProcessor issueProcessor;
		if (editor.getResource() == null) {
			issueProcessor = new NlxAnnotationIssueProcessor(editor.getDocument(), editor.getInternalSourceViewer().getAnnotationModel(),
					issueResolutionProvider);
		} else {
			issueProcessor = new MarkerIssueProcessor(editor.getResource(), editor.getInternalSourceViewer().getAnnotationModel(),
					markerCreator, markerTypeProvider);
		}
		ValidationJob validationJob = new ValidationJob(resourceValidator, editor.getDocument(), issueProcessor, CheckMode.NORMAL_AND_FAST);
		return validationJob;
	}

}
