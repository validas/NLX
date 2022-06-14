/**
 * 
 */
package de.validas.spedit.ui.editor.hover;

import java.util.HashMap;

import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.source.Annotation;

/**
 * @author schaller
 *
 */
public interface IAnnotationInfo {
	
//	public final Position position = null;
//	public final ITextViewer viewer = null;
//	// DIFF: not part of AbstractAnnotationHover (1)
//	public final HashMap<Annotation,ICompletionProposal[]> annotationWproposal = new HashMap<>();
	
	public Position getPosition();
	
	public ITextViewer getViewer();
	
	public HashMap<Annotation, ICompletionProposal[]> getAnnotationWproposal();
	
	public ICompletionProposal[] getCompletionProposals(Annotation annotation);
	
	public void fillToolBar(ToolBarManager manager, IInformationControl infoControl);

}
