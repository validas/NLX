/**
 * 
 */
package de.validas.spedit.ui.editor.property;

import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;

import com.google.inject.Inject;

/**
 * @author schaller
 *
 */
public class NlxPropertyWithEditorLinker implements IPropertyChangeListener {
	
	@Inject
	protected ISourceViewer textViewer;

	/* (non-Javadoc)
	 * @see org.eclipse.jface.util.IPropertyChangeListener#propertyChange(org.eclipse.jface.util.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		// TODO Auto-generated method stub

	}

	public void activate(OutlinePage outlinePage) {
		
		
	}

	public void setLinkingEnabled(boolean propertySet) {
		// TODO Auto-generated method stub
		
	}

	public void deactivate() {
		// TODO Auto-generated method stub
		
	}

}
