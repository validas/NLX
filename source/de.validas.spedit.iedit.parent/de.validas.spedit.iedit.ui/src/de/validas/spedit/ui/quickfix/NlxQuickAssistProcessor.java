/**
 * 
 */
package de.validas.spedit.ui.quickfix;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.texteditor.spelling.SpellingAnnotation;
import org.eclipse.ui.texteditor.spelling.SpellingProblem;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
import org.eclipse.xtext.ui.editor.quickfix.QuickAssistInvocationContext;
import org.eclipse.xtext.ui.editor.quickfix.XtextQuickAssistProcessor;
import org.eclipse.xtext.ui.util.IssueUtil;
import org.eclipse.xtext.validation.Issue;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * @author schaller
 *
 */
public class NlxQuickAssistProcessor extends XtextQuickAssistProcessor {

	protected String nlxErrorMessage;
	
	@Inject
	protected IssueUtil nlxIssueUtil;

	/**
	 * 
	 */
	public NlxQuickAssistProcessor() {
		super();
	}
	

	public HashMap<Annotation,ICompletionProposal[]> computeQuickAssistProposals2(IQuickAssistInvocationContext invocationContext) {
		ISourceViewer sourceViewer = invocationContext.getSourceViewer();
		if (sourceViewer == null)
			return new HashMap<>();
		if (invocationContext instanceof QuickAssistInvocationContext) {
			if (((QuickAssistInvocationContext) invocationContext).isCancelled()) {
				return new HashMap<>();
			}
		}
		final IDocument document = sourceViewer.getDocument();
		if (!(document instanceof IXtextDocument))
			return new HashMap<>();
		final IXtextDocument xtextDocument = (IXtextDocument) document;
		final IAnnotationModel annotationModel = sourceViewer.getAnnotationModel();
		HashMap<Annotation,ICompletionProposal[]> result = new HashMap<>();
		try {
			Set<Annotation> applicableAnnotations = getApplicableAnnotations(xtextDocument, annotationModel, invocationContext.getOffset());
			result = createQuickfixes2(invocationContext, applicableAnnotations);
            selectAndRevealQuickfix(invocationContext, applicableAnnotations, result);
		} catch (BadLocationException e) {
			nlxErrorMessage = e.getMessage();
		} catch (OperationCanceledException e) {
			return new HashMap<>();
		}
		
		return result;
	}
	
	protected void selectAndRevealQuickfix(IQuickAssistInvocationContext invocationContext, Set<Annotation> applicableAnnotations, HashMap<Annotation,ICompletionProposal[]> completionProposals) {
        if (completionProposals.isEmpty()) {
        	return;
        }
		if (!(invocationContext instanceof QuickAssistInvocationContext && ((QuickAssistInvocationContext) invocationContext).isSuppressSelection())) {
			ISourceViewer sourceViewer = invocationContext.getSourceViewer();
			IAnnotationModel annotationModel = sourceViewer.getAnnotationModel();
			Iterator<Annotation> iterator = applicableAnnotations.iterator();
			while (iterator.hasNext()) {
				Position pos = annotationModel.getPosition(iterator.next());
				if (pos != null) {
					sourceViewer.setSelectedRange(pos.getOffset(), pos.getLength());
					sourceViewer.revealRange(pos.getOffset(), pos.getLength());
					break;
				}
			}
		}
	}
	
	protected HashMap<Annotation,ICompletionProposal[]> createQuickfixes2(IQuickAssistInvocationContext invocationContext, Set<Annotation> applicableAnnotations) {
		HashMap<Annotation,ICompletionProposal[]> result = new HashMap<>();
    	ISourceViewer sourceViewer = invocationContext.getSourceViewer();
		IAnnotationModel annotationModel = sourceViewer.getAnnotationModel();
		IXtextDocument xtextDocument = XtextDocumentUtil.get(sourceViewer);
    	for(Annotation annotation : applicableAnnotations) {
			if (annotation instanceof SpellingAnnotation) {
				SpellingProblem spellingProblem = ((SpellingAnnotation) annotation).getSpellingProblem();
				ICompletionProposal[] proposals = spellingProblem.getProposals();
				if (proposals != null) {
					result.put(annotation,proposals);
				}
			} else {
				final Issue issue = nlxIssueUtil.getIssueFromAnnotation(annotation);
				Position pos = annotationModel.getPosition(annotation);
				if (issue != null && pos != null) {
					Iterable<IssueResolution> resolutions = getResolutions(issue, xtextDocument);
					if (resolutions.iterator().hasNext()) {
						List<ICompletionProposal> quickProposals = new ArrayList<>();
						for (IssueResolution resolution : resolutions) {
							quickProposals.add(create(pos, resolution));
						}
						result.put(annotation,quickProposals.stream().toArray(ICompletionProposal[]::new));
					}
				}
			}
		}
    	return result;
    }

}
