/**
 * (c) Validas AG
 */
package de.validas.spedit.ui.editor.model;

import java.util.List;

import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.xtext.resource.OutdatedStateManager;
import org.eclipse.xtext.service.OperationCanceledManager;
import org.eclipse.xtext.ui.editor.model.DocumentTokenSource;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.ITextEditComposer;

import com.google.inject.Inject;

/**
 * @author Felix Schaller
 *
 */
public class NlxDocument extends XtextDocument {

	/**
	 * @param tokenSource
	 * @param composer
	 */
	@Inject
	public NlxDocument(DocumentTokenSource tokenSource, ITextEditComposer composer) {
		super(tokenSource, composer);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param tokenSource
	 * @param composer
	 * @param outdatedStateManager
	 * @param operationCanceledManager
	 */
	public NlxDocument(DocumentTokenSource tokenSource, ITextEditComposer composer,
			OutdatedStateManager outdatedStateManager, OperationCanceledManager operationCanceledManager) {
		super(tokenSource, composer, outdatedStateManager, operationCanceledManager);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Override to make public
	 */
	@Override
	public List<IDocumentListener> getDocumentListeners() {
		return super.getDocumentListeners();
	}

}
