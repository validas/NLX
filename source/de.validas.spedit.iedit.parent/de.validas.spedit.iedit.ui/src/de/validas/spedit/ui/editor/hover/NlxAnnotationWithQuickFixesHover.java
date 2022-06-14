/**
 * 
 */
package de.validas.spedit.ui.editor.hover;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.AbstractInformationControl;
import org.eclipse.jface.text.AbstractReusableInformationControlCreator;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IInformationControlExtension2;
import org.eclipse.jface.text.IInformationControlExtension4;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.IRewriteTarget;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.ITextViewerExtension;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension2;
import org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.texteditor.DefaultMarkerAnnotationAccess;
import org.eclipse.xtext.ui.XtextUIMessages;
import org.eclipse.xtext.ui.editor.hover.AnnotationWithQuickFixesHover;
import org.eclipse.xtext.ui.editor.quickfix.QuickAssistInvocationContext;

import com.google.inject.Inject;

import de.validas.spedit.ui.quickfix.NlxQuickAssistProcessor;

/**
 * @author schaller
 *
 */
public class NlxAnnotationWithQuickFixesHover extends AnnotationWithQuickFixesHover {

	protected volatile IAnnotationInfo nlxRecentAnnotationInfo;
	
	protected IInformationControlCreator nlxHoverControlCreator;
	protected IInformationControlCreator nlxPresenterControlCreator;
	
	@Inject
	protected NlxQuickAssistProcessor nlxQuickAssistProcessor;

	/**
	 * 
	 */
	public NlxAnnotationWithQuickFixesHover() {
		super();
	}
	
	
	public static class NlxAnnotationInfo implements IAnnotationInfo {
		
		public final Position position;
		public final ITextViewer viewer;
		// DIFF: not part of AbstractAnnotationHover (1)
		public final HashMap<Annotation,ICompletionProposal[]> annotationWproposal;
		
		/**
		 * @return the position
		 */
		public Position getPosition() {
			return position;
		}

		/**
		 * @return the viewer
		 */
		public ITextViewer getViewer() {
			return viewer;
		}

		/**
		 * @return the annotationWproposal
		 */
		public HashMap<Annotation, ICompletionProposal[]> getAnnotationWproposal() {
			return annotationWproposal;
		}

		public NlxAnnotationInfo(List<Annotation> annotations, Position position, ITextViewer textViewer, ICompletionProposal[] proposals)  {
			
			this.annotationWproposal = new HashMap<>();
			
			for (Annotation annotation: annotations) {
				this.annotationWproposal.put(annotation, proposals);
			}
			this.position= position;
			this.viewer= textViewer;

			//Assert.isNotNull(proposals);
		}

		public NlxAnnotationInfo(List<Annotation> annotations, Position position, ITextViewer textViewer,
				HashMap<Annotation, ICompletionProposal[]> proposals) {
			
			this.annotationWproposal = proposals;
			
			
			this.position= position;
			this.viewer= textViewer;
			
		}

		/**
		 * Create completion proposals which can resolve the given annotation at
		 * the given position. Returns an empty array if no such proposals exist.
		 *
		 * @return the proposals or an empty array
		 */
		public ICompletionProposal[] getCompletionProposals(Annotation annotation) {
			// DIFF: return proposals directly, no subclassing (1)
			return annotationWproposal.get(annotation);
		}

		/**
		 * Adds actions to the given toolbar.
		 *
		 * @param manager the toolbar manager to add actions to
		 * @param infoControl the information control
		 */
		public void fillToolBar(ToolBarManager manager, IInformationControl infoControl) {
			// DIFF: disabled as configuration is not supported yet (2)
//			ConfigureAnnotationsAction configureAnnotationsAction= new ConfigureAnnotationsAction(annotation, infoControl);
//			manager.add(configureAnnotationsAction);
		}
	}
	
	protected final class NlxCompletionProposalRunnable implements Runnable {
		protected final HashMap<Annotation,ICompletionProposal[]> NO_PROPOSALS = new HashMap<>();
		HashMap<Annotation,ICompletionProposal[]> proposals = NO_PROPOSALS;
		IQuickAssistInvocationContext invocationContext;
		
		public NlxCompletionProposalRunnable(IQuickAssistInvocationContext invocationContext) {
			this.invocationContext = invocationContext;
		}

		@Override
		public void run() {
			HashMap<Annotation,ICompletionProposal[]> p = nlxQuickAssistProcessor.computeQuickAssistProposals2(invocationContext);
			proposals = p != null ? p : NO_PROPOSALS;
		}
	}
	
	
	protected static class NlxAnnotationInformationControl extends AbstractInformationControl implements IInformationControlExtension2 {

		private final DefaultMarkerAnnotationAccess fMarkerAnnotationAccess;
		private Control fFocusControl;
		private IAnnotationInfo fInput;
		private Composite fParent;

		public NlxAnnotationInformationControl(Shell parentShell, String statusFieldText) {
			super(parentShell, statusFieldText);
			fMarkerAnnotationAccess= new DefaultMarkerAnnotationAccess();
			create();
		}

		public NlxAnnotationInformationControl(Shell parentShell, ToolBarManager toolBarManager) {
			super(parentShell, toolBarManager);
			
			fMarkerAnnotationAccess= new DefaultMarkerAnnotationAccess();
			create();
		}
		
		public NlxAnnotationInformationControl(Shell parentShell, boolean resizeable) {
			super(parentShell, resizeable);
			
			fMarkerAnnotationAccess= new DefaultMarkerAnnotationAccess();
			create();
		}		

		/*
		 * @see org.eclipse.jface.text.IInformationControl#setInformation(java.lang.String)
		 */
		@Override
		public void setInformation(String information) {
			//replaced by IInformationControlExtension2#setInput
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public void setInput(Object input) {
			Assert.isLegal(input instanceof IAnnotationInfo);
			fInput = (IAnnotationInfo) input;
			disposeDeferredCreatedContent();
			deferredCreateContent();
		}

		@Override
		public boolean hasContents() {
			return fInput != null; 
		}

		private IAnnotationInfo getAnnotationInfo() {
			return fInput;
		}

		@Override
		public void setFocus() {
			super.setFocus();
			if (fFocusControl != null)
				fFocusControl.setFocus();
		}

		@Override
		public final void setVisible(boolean visible) {
			if (!visible)
				disposeDeferredCreatedContent();
			super.setVisible(visible);
		}

		protected void disposeDeferredCreatedContent() {
			Control[] children= fParent.getChildren();
			for (int i= 0; i < children.length; i++) {
				children[i].dispose();
			}
			ToolBarManager toolBarManager= getToolBarManager();
			if (toolBarManager != null)
				toolBarManager.removeAll();
		}

		/*
		 * @see org.eclipse.jface.text.AbstractInformationControl#createContent(org.eclipse.swt.widgets.Composite)
		 */
		@Override
		protected void createContent(Composite parent) {
			fParent= parent;
			GridLayout layout= new GridLayout(1, false);
			layout.verticalSpacing= 0;
			layout.marginWidth= 0;
			layout.marginHeight= 0;
			fParent.setLayout(layout);
		}

		@Override
		public Point computeSizeHint() {
			Point preferedSize= getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT, true);

			Point constrains= getSizeConstraints();
			if (constrains == null)
				return preferedSize;

			Point constrainedSize= getShell().computeSize(constrains.x, SWT.DEFAULT, true);

			int width= Math.min(preferedSize.x, constrainedSize.x);
			int height= Math.max(preferedSize.y, constrainedSize.y);

			return new Point(width, height);
		}

		/**
		 * Fills the toolbar actions, if a toolbar is available. This
		 * is called after the input has been set.
		 */
		protected void fillToolbar() {
			ToolBarManager toolBarManager= getToolBarManager();
			if (toolBarManager == null)
				return;
			
			fInput.fillToolBar(toolBarManager, this);
			toolBarManager.update(true);
		}

		/**
		 * Create content of the hover. This is called after
		 * the input has been set.
		 */
		protected void deferredCreateContent() {
			fillToolbar();
			
			IAnnotationInfo aInfo =  getAnnotationInfo(); 
			
			setColorAndFont(fParent, fParent.getForeground(), fParent.getBackground(), JFaceResources.getDialogFont());
			
			for (Annotation annotation : aInfo.getAnnotationWproposal().keySet()) {
				createAnnotationInformation(fParent, annotation);
				ICompletionProposal[] proposals= aInfo.getCompletionProposals(annotation);
				if (proposals.length > 0)
					createCompletionProposalsControl(fParent, aInfo, proposals);
			}
			
	
				
			
			fParent.layout(true);
		}

		private void setColorAndFont(Control control, Color foreground, Color background, Font font) {
			control.setForeground(foreground);
			control.setBackground(background);
			control.setFont(font);

			if (control instanceof Composite) {
				Control[] children= ((Composite) control).getChildren();
				for (int i= 0; i < children.length; i++) {
					setColorAndFont(children[i], foreground, background, font);
				}
			}
		}

		private void createAnnotationInformation(Composite parent, final Annotation annotation) {
			Composite composite= new Composite(parent, SWT.NONE);
			composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
			GridLayout layout= new GridLayout(2, false);
			layout.marginHeight= 2;
			layout.marginWidth= 2;
			layout.horizontalSpacing= 0;
			composite.setLayout(layout);

			final Canvas canvas= new Canvas(composite, SWT.NO_FOCUS);
			GridData gridData= new GridData(SWT.BEGINNING, SWT.BEGINNING, false, false);
			gridData.widthHint= 17;
			gridData.heightHint= 16;
			canvas.setLayoutData(gridData);
			canvas.addPaintListener(new PaintListener() {
				@Override
				public void paintControl(PaintEvent e) {
					e.gc.setFont(null);
					fMarkerAnnotationAccess.paint(annotation, e.gc, canvas, new Rectangle(0, 0, 16, 16));
				}
			});

			StyledText text= new StyledText(composite, SWT.MULTI | SWT.WRAP | SWT.READ_ONLY);
			GridData data= new GridData(SWT.FILL, SWT.FILL, true, true);
			text.setLayoutData(data);
			String annotationText= annotation.getText();
			if (annotationText != null)
				text.setText(annotationText);
		}

		private void createCompletionProposalsControl(Composite parent, IAnnotationInfo info, ICompletionProposal[] proposals) {
			Composite composite= new Composite(parent, SWT.NONE);
			composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			GridLayout layout2= new GridLayout(1, false);
			layout2.marginHeight= 0;
			layout2.marginWidth= 0;
			layout2.verticalSpacing= 2;
			composite.setLayout(layout2);

			Label separator= new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
			GridData gridData= new GridData(SWT.FILL, SWT.CENTER, true, false);
			separator.setLayoutData(gridData);

			Label quickFixLabel= new Label(composite, SWT.NONE);
			GridData layoutData= new GridData(SWT.BEGINNING, SWT.CENTER, false, false);
			layoutData.horizontalIndent= 4;
			quickFixLabel.setLayoutData(layoutData);
			String text;
			if (proposals.length == 1) {
				// DIFF: replaced JavaHoverMessages with XtextUIMessages (4)
				text= XtextUIMessages.AnnotationWithQuickFixesHover_message_singleQuickFix;
			} else {
				// DIFF: replaced JavaHoverMessages with XtextUIMessages (4)
				text= MessageFormat.format(XtextUIMessages.AnnotationWithQuickFixesHover_message_multipleQuickFix, new Object[] { String.valueOf(proposals.length) });
			}
			quickFixLabel.setText(text);

			setColorAndFont(composite, parent.getForeground(), parent.getBackground(), JFaceResources.getDialogFont());
			createCompletionProposalsList(composite, info, proposals);
		}

		private void createCompletionProposalsList(Composite parent, IAnnotationInfo info, ICompletionProposal[] proposals) {
			final ScrolledComposite scrolledComposite= new ScrolledComposite(parent, SWT.V_SCROLL | SWT.H_SCROLL);
			GridData gridData= new GridData(SWT.FILL, SWT.FILL, true, true);
			scrolledComposite.setLayoutData(gridData);
			scrolledComposite.setExpandVertical(false);
			scrolledComposite.setExpandHorizontal(false);

			Composite composite= new Composite(scrolledComposite, SWT.NONE);
			composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			GridLayout layout= new GridLayout(2, false);
			layout.marginLeft= 5;
			layout.verticalSpacing= 2;
			composite.setLayout(layout);
			
			List<Link> list= new ArrayList<Link>();
			for (int i= 0; i < proposals.length; i++) {
				list.add(createCompletionProposalLink(composite, info, proposals[i], 1));// Original link for single fix, hence pass 1 for count

				// DIFF: outcommented, no support of FixCorrectionProposal and ICleanUp (5)
//				if (proposals[i] instanceof FixCorrectionProposal) {
//					FixCorrectionProposal proposal= (FixCorrectionProposal)proposals[i];
//					int count= proposal.computeNumberOfFixesForCleanUp(proposal.getCleanUp());
//					if (count > 1) {
//						list.add(createCompletionProposalLink(composite, proposals[i], count));
//					}
//				}
			}
			final Link[] links= list.toArray(new Link[list.size()]);

			scrolledComposite.setContent(composite);
			setColorAndFont(scrolledComposite, parent.getForeground(), parent.getBackground(), JFaceResources.getDialogFont());

			Point contentSize= composite.computeSize(SWT.DEFAULT, SWT.DEFAULT);
			composite.setSize(contentSize);

			Point constraints= getSizeConstraints();
			if (constraints != null && contentSize.x < constraints.x) {
				ScrollBar horizontalBar= scrolledComposite.getHorizontalBar();

				int scrollBarHeight;
				if (horizontalBar == null) {
					Point scrollSize= scrolledComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT);
					scrollBarHeight= scrollSize.y - contentSize.y;
				} else {
					scrollBarHeight= horizontalBar.getSize().y;
				}
				gridData.heightHint= contentSize.y - scrollBarHeight;
			}

			fFocusControl= links[0];
			for (int i= 0; i < links.length; i++) {
				final int index= i;
				final Link link= links[index];
				link.addKeyListener(new KeyListener() {
					@Override
					public void keyPressed(KeyEvent e) {
						switch (e.keyCode) {
							case SWT.ARROW_DOWN:
								if (index + 1 < links.length) {
									links[index + 1].setFocus();
								}
								break;
							case SWT.ARROW_UP:
								if (index > 0) {
									links[index - 1].setFocus();
								}
								break;
							default:
								break;
						}
					}

					@Override
					public void keyReleased(KeyEvent e) {
					}
				});

				link.addFocusListener(new FocusListener() {
					@Override
					public void focusGained(FocusEvent e) {
						int currentPosition= scrolledComposite.getOrigin().y;
						int hight= scrolledComposite.getSize().y;
						int linkPosition= link.getLocation().y;

						if (linkPosition < currentPosition) {
							if (linkPosition < 10)
								linkPosition= 0;

							scrolledComposite.setOrigin(0, linkPosition);
						} else if (linkPosition + 20 > currentPosition + hight) {
							scrolledComposite.setOrigin(0, linkPosition - hight + link.getSize().y);
						}
					}

					@Override
					public void focusLost(FocusEvent e) {
					}
				});
			}
		}

		/**
		 * Create Proposal Links
		 * @param parent
		 * @param annotation 
		 * @param proposal
		 * @param count
		 * @return
		 */
		//TODO: proposals not separated per AnnotationInfo
		private Link createCompletionProposalLink(Composite parent, IAnnotationInfo info, final ICompletionProposal proposal, int count) {
			final boolean isMultiFix= count > 1;
			if (isMultiFix) {
				new Label(parent, SWT.NONE); // spacer to fill image cell
				parent= new Composite(parent, SWT.NONE); // indented composite for multi-fix
				GridLayout layout= new GridLayout(2, false);
				layout.marginWidth= 0;
				layout.marginHeight= 0;
				parent.setLayout(layout);
			}
			
			Label proposalImage= new Label(parent, SWT.NONE);
			proposalImage.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
			Image image= /*isMultiFix ? JavaPluginImages.get(JavaPluginImages.IMG_CORRECTION_MULTI_FIX) : */proposal.getImage();
			if (image != null) {
				proposalImage.setImage(image);

				proposalImage.addMouseListener(new MouseListener() {

					@Override
					public void mouseDoubleClick(MouseEvent e) {
					}

					@Override
					public void mouseDown(MouseEvent e) {
					}

					@Override
					public void mouseUp(MouseEvent e) {
						if (e.button == 1) {
							apply(proposal, info.getViewer(), info.getPosition().offset, isMultiFix);
						}
					}

				});
			}

			Link proposalLink= new Link(parent, SWT.WRAP);
			GridData layoutData= new GridData(SWT.BEGINNING, SWT.CENTER, false, false);
			String linkText;
			String description;
			//String space;
			if (isMultiFix) {
				// DIFF: XtextUIMessages (4)
				linkText= MessageFormat.format(XtextUIMessages.AnnotationWithQuickFixesHover_message_multipleQuickFix, new Object[] { String.valueOf(count) });
				description = new String();
				//space = new String();
			} else {
				linkText = proposal.getDisplayString();
				description = proposal.getAdditionalProposalInfo();
				//space = StringUtils.repeat(" ", Math.max(0, 20 - linkText.length()));
			}
			proposalLink.setText(MessageFormat.format("<a>{0}</a>   {1}", linkText, description)); //$NON-NLS-1$
			proposalLink.setLayoutData(layoutData);
			proposalLink.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					if (info != null)
						apply(proposal, info.getViewer(), info.getPosition().offset, isMultiFix);
				}
			});
			return proposalLink;
		}

		private void apply(ICompletionProposal p, ITextViewer viewer, int offset, boolean isMultiFix) {
			//Focus needs to be in the text viewer, otherwise linked mode does not work
			dispose();

			IRewriteTarget target= null;
			try {
				IDocument document= viewer.getDocument();

				if (viewer instanceof ITextViewerExtension) {
					ITextViewerExtension extension= (ITextViewerExtension) viewer;
					target= extension.getRewriteTarget();
				}

				if (target != null)
					target.beginCompoundChange();

				if (p instanceof ICompletionProposalExtension2) {
					ICompletionProposalExtension2 e= (ICompletionProposalExtension2) p;
					e.apply(viewer, (char) 0, isMultiFix ? SWT.CONTROL : SWT.NONE, offset);
				} else if (p instanceof ICompletionProposalExtension) {
					ICompletionProposalExtension e= (ICompletionProposalExtension) p;
					e.apply(document, (char) 0, offset);
				} else {
					if (p != null)
						p.apply(document);
				}

				Point selection= p.getSelection(document);
				if (selection != null) {
					viewer.setSelectedRange(selection.x, selection.y);
					viewer.revealRange(selection.x, selection.y);
				}
			} finally {
				if (target != null)
					target.endCompoundChange();
			}
		}
	}
	
	private static final class NlxHoverControlCreator extends AbstractReusableInformationControlCreator {
		private final IInformationControlCreator fPresenterControlCreator;

		public NlxHoverControlCreator(IInformationControlCreator presenterControlCreator) {
			fPresenterControlCreator= presenterControlCreator;
		}

		@Override
		public IInformationControl doCreateInformationControl(Shell parent) {
			return new NlxAnnotationInformationControl(parent, EditorsUI.getTooltipAffordanceString()) {

				@Override
				public IInformationControlCreator getInformationPresenterControlCreator() {
					return fPresenterControlCreator;
				}
			};
		}

		@Override
		public boolean canReuse(IInformationControl control) {
			if (!super.canReuse(control))
				return false;

			if (control instanceof IInformationControlExtension4)
				((IInformationControlExtension4) control).setStatusText(EditorsUI.getTooltipAffordanceString());

			return true;
		}
	}
	
	private static final class NlxPresenterControlCreator extends AbstractReusableInformationControlCreator {

		@Override
		public IInformationControl doCreateInformationControl(Shell parent) {
			// DIFF: do not show toolbar in hover, no configuration supported (2)
			// return new AnnotationInformationControl(parent, new ToolBarManager(SWT.FLAT));
			return new NlxAnnotationInformationControl(parent, true);
		}
	}


	@Override
	protected Region getHoverRegionInternal(final int lineNumber, final int offset) {
		nlxRecentAnnotationInfo = null;
		List<Annotation> annotations = getAnnotations(lineNumber, offset);
		//TODO: fix this 
		for (Annotation annotation : sortBySeverity(annotations)) {
			Position position = sourceViewer.getAnnotationModel().getPosition(annotation);
			if (position != null) {
				final int start = position.getOffset();
				return new Region(start, position.getLength());	
			}
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.hover.AnnotationWithQuickFixesHover#getHoverInfoInternal(org.eclipse.jface.text.ITextViewer, int, int)
	 */
	@Override
	protected Object getHoverInfoInternal(ITextViewer textViewer, int lineNumber, int offset) {
		
		final int lineNumber1 = lineNumber;
		final int offset1 = offset;
		IAnnotationInfo result = nlxRecentAnnotationInfo;
		if (result != null)
			return result;
		List<Annotation> annotations = getAnnotations(lineNumber1, offset1);
		if (annotations == null || annotations.isEmpty())
			return null;
		Position position = getAnnotationModel().getPosition(annotations.get(0));
		if (annotations.get(0).getText() != null && position != null) {
			final QuickAssistInvocationContext invocationContext = new QuickAssistInvocationContext(sourceViewer, position.getOffset(), position.getLength(), true);
			//TODO: sort proposals by Marker
			NlxCompletionProposalRunnable runnable = new NlxCompletionProposalRunnable(invocationContext);

			Display.getDefault().syncExec(runnable);
			if (invocationContext.isMarkedCancelled()) {
				return null;
			}
			result = new NlxAnnotationInfo(annotations, position, sourceViewer, runnable.proposals);
			nlxRecentAnnotationInfo = result;
			
		}
		
		return result;
	}
	
	@Override
	public Object getHoverInfo2(ITextViewer textViewer, IRegion hoverRegion) {
		int lineNumber;
		try {
			lineNumber = getLineNumber(textViewer, hoverRegion);
			return getHoverInfoInternal(textViewer, lineNumber, hoverRegion.getOffset());
		} catch (final BadLocationException e) {
			return null;
		}
	}
	
	@Override
	public IInformationControlCreator getHoverControlCreator() {
		if (nlxHoverControlCreator == null)
			nlxHoverControlCreator= new NlxHoverControlCreator(getInformationPresenterControlCreator());
		return nlxHoverControlCreator;
	}
	
	public IInformationControlCreator getInformationPresenterControlCreator() {
		if (nlxPresenterControlCreator == null)
			nlxPresenterControlCreator= new NlxPresenterControlCreator();
		return nlxPresenterControlCreator;
	}

	
	
}
