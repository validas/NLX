/**
 * 
 */
package de.validas.spedit.ui.editor.validation;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.xtext.validation.Issue;

/**
 * @author Felix Schaller
 *
 */
public class NlxAnnotation extends Annotation {

	/**
	 * @param type
	 * @param isPersistent
	 * @param document
	 * @param issue
	 * @param isQuickfixable
	 */
	public NlxAnnotation(String type, boolean isPersistent, IXtextDocument document, Issue issue,
			boolean isQuickfixable) {
		super(type, isPersistent, issue.getMessage());
	}

}
