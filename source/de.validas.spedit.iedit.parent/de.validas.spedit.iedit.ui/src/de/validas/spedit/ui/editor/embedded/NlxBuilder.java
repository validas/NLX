/**
 * 
 */
package de.validas.spedit.ui.editor.embedded;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.contentassist.ContentAssistEvent;
import org.eclipse.jface.text.contentassist.ICompletionListener;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.CompositeRuler;
import org.eclipse.jface.text.source.IAnnotationAccessExtension;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.texteditor.AnnotationPreference;
import org.eclipse.ui.texteditor.DefaultMarkerAnnotationAccess;
import org.eclipse.ui.texteditor.MarkerAnnotationPreferences;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.XtextSourceViewerConfiguration;
import org.eclipse.xtext.ui.editor.bracketmatching.BracketMatchingPreferencesInitializer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorActions;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory.Builder;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.IssueModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.editor.validation.AnnotationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.IValidationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.ValidationJob;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.Issue;

import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

import de.validas.spedit.ui.editor.validation.NlxAnnotationIssueProcessor;

/**
 * @author schaller
 *
 */
public class NlxBuilder extends Builder {

	/**
	 * 
	 */
	public NlxBuilder() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory.Builder#withParent(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public EmbeddedEditor withParent(Composite parent) {
		// TODO Auto-generated method stub
		final Composite parent1 = parent;
		if (editorBuild)
						throw new IllegalStateException();
					editorBuild = true;
		//			/*fProjectionSupport =*/installProjectionSupport(this.fSourceViewer);
					final CompositeRuler verticalRuler;
					if ((annotationTypes != null && annotationTypes.length != 0) || Boolean.TRUE.equals(lineNumbers)) {
						verticalRuler = new CompositeRuler();
					} else {
						verticalRuler = null;
					}
					final XtextSourceViewer viewer = this.sourceViewerFactory.createSourceViewer(
							parent1, 
							verticalRuler, 
							null, // overviewRuler
							false, // showAnnotationOverview 
							style); // SWT styling
					final XtextSourceViewerConfiguration viewerConfiguration = this.sourceViewerConfigurationProvider.get();
					viewer.configure(viewerConfiguration);
		
					// squiggles for markers and other decorations
					final SourceViewerDecorationSupport viewerDecorationSupport = new SourceViewerDecorationSupport(
							viewer, 
							null, // overviewRuler 
							new DefaultMarkerAnnotationAccess() {
								@Override
								public int getLayer(Annotation annotation) {
									if (annotation.isMarkedDeleted()) {
										return IAnnotationAccessExtension.DEFAULT_LAYER;
									}
									return super.getLayer(annotation);
								}
							}, 
							getSharedColors());
					MarkerAnnotationPreferences annotationPreferences = new MarkerAnnotationPreferences();
					Iterator<AnnotationPreference> e = Iterators.filter(annotationPreferences.getAnnotationPreferences().iterator(), AnnotationPreference.class);
					while (e.hasNext()) {
						viewerDecorationSupport.setAnnotationPreference(e.next());
					}
					if (characterPairMatcher != null) {
						viewerDecorationSupport.setCharacterPairMatcher(characterPairMatcher);
						viewerDecorationSupport.setMatchingCharacterPainterPreferenceKeys(BracketMatchingPreferencesInitializer.IS_ACTIVE_KEY,
								BracketMatchingPreferencesInitializer.COLOR_KEY);
					}
					viewerDecorationSupport.install(this.preferenceStoreAccess.getPreferenceStore());
					
					final XtextDocument document = this.documentProvider.get();
					IDocumentPartitioner partitioner = this.documentPartitionerProvider.get();
					partitioner.connect(document);
					document.setDocumentPartitioner(partitioner);
		
					final EmbeddedEditorActions actions = initializeActions(viewer);
					parent1.addDisposeListener(new DisposeListener() {
						@Override
						public void widgetDisposed(DisposeEvent e) {
							viewerDecorationSupport.dispose();
							highlightingHelper.uninstall();
						}
					});
					final EmbeddedEditor result = new EmbeddedEditor(
							document, viewer, viewerConfiguration, resourceProvider, new Runnable() {
								@Override
								public void run() {
									afterCreatePartialEditor(viewer, document, verticalRuler, actions);
									highlightingHelper.install(viewerConfiguration, viewer);
								}
							});
					viewer.setEditable(!Boolean.TRUE.equals(readonly));
					viewer.getContentAssistantFacade().addCompletionListener(new ICompletionListener() {
						
						private Button defaultButton;
		
						@Override
						public void selectionChanged(ICompletionProposal proposal, boolean smartToggle) {
						}
						
						@Override
						public void assistSessionStarted(ContentAssistEvent event) {
							defaultButton = parent1.getShell().getDefaultButton();
							parent1.getShell().setDefaultButton(null);
						}
						
						@Override
						public void assistSessionEnded(ContentAssistEvent event) {
							parent1.getShell().setDefaultButton(defaultButton);
							defaultButton = null;
						}
					});
					ValidationJob job = new ValidationJob(this.resourceValidator, document, new IValidationIssueProcessor() {
						
						private AnnotationIssueProcessor annotationIssueProcessor;
		
						@Override
						public void processIssues(List<Issue> issues, IProgressMonitor monitor) {
							IValidationIssueProcessor issueProcessor = NlxBuilder.this.issueProcessor;
							if (issueProcessor != null) {
								issueProcessor.processIssues(issues, monitor);
							}
							IAnnotationModel annotationModel = viewer.getAnnotationModel();
							if (annotationModel != null) {
								if (this.annotationIssueProcessor == null) {
									this.annotationIssueProcessor = new NlxAnnotationIssueProcessor(document, annotationModel, new IssueResolutionProvider() {
			
										@Override
										public boolean hasResolutionFor(String issueCode) {
											return issueResolutionProvider.hasResolutionFor(issueCode);
										}
			
										@Override
										public List<IssueResolution> getResolutions(Issue issue) {
											List<IssueResolution> resolutions = issueResolutionProvider.getResolutions(issue);
											List<IssueResolution> result = Lists.transform(resolutions, new Function<IssueResolution, IssueResolution>() {
			
												@Override
												public IssueResolution apply(final IssueResolution input) {
													IssueResolution result = new IssueResolution(
															input.getLabel(), 
															input.getDescription(), 
															input.getImage(), 
															new IModificationContext() {
																@Override
																public IXtextDocument getXtextDocument(URI uri) {
																	if (uri.trimFragment().equals(document.getResourceURI()))
																		return document;
																	return input.getModificationContext().getXtextDocument(uri);
																}
																
																@Override
																public IXtextDocument getXtextDocument() {
																	IModificationContext original = input.getModificationContext();
																	if (original instanceof IssueModificationContext) {
																		URI uri = ((IssueModificationContext) original).getIssue().getUriToProblem();
																		return getXtextDocument(uri);
																	}
																	return original.getXtextDocument();
																}
															}, 
															input.getModification());
													return result;
												}
											});
											return result;
										}
										
									});
								}
								if (this.annotationIssueProcessor != null) {
									this.annotationIssueProcessor.processIssues(issues, monitor);
								}
							}
						}
					}, CheckMode.FAST_ONLY);
					document.setValidationJob(job);
		
					Control control = viewer.getControl();
					GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
					control.setLayoutData(data);
					return result;
	}

}
