/**
 * 
 */
package de.validas.spedit.ui.model;

import org.eclipse.core.resources.IMarker;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.texteditor.AnnotationPreference;
import org.eclipse.xtext.ui.editor.model.XtextMarkerAnnotationImageProvider;

/**
 * @author Felix Schaller
 *
 */
public class NlxMarkerAnnotationImageProvider extends XtextMarkerAnnotationImageProvider {

	/**
	 * Settings for NLX Annotations:
	 * 
	 * 	annotationType
	 *	label
	 *	markerType
	 *	markerSeverity
	 *	textPreferenceKey
	 *	textPreferenceValue
	 *	highlightPreferenceKey
	 *	highlightPreferenceValue
	 *	overviewRulerPreferenceKey
	 *	overviewRulerPreferenceValue
	 *	verticalRulerPreferenceKey
	 *	verticalRulerPreferenceValue
	 *	colorPreferenceKey
	 *	colorPreferenceValue
	 *	presentationLayer
	 *	contributesToHeader
	 *	showInNextPrevDropdownToolbarActionKey
	 *	showInNextPrevDropdownToolbarAction
	 *	isGoToNextNavigationTargetKey
	 *	isGoToNextNavigationTarget
	 *	isGoToPreviousNavigationTargetKey
	 *	isGoToPreviousNavigationTarget
	 *	symbolicIcon
	 *	icon
	 *	quickFixIcon
	 *	annotationImageProvider = de.validas.spedit.ui.model.NlxMarkerAnnotationImageProvider
	 *	textStylePreferenceKey
	 *	textStylePreferenceValue
	 *		if (AnnotationPreference.STYLE_BOX.equals(s)
	 *				|| AnnotationPreference.STYLE_DASHED_BOX.equals(s)
	 *				|| AnnotationPreference.STYLE_IBEAM.equals(s)
	 *				|| AnnotationPreference.STYLE_SQUIGGLES.equals(s)
	 *				|| AnnotationPreference.STYLE_PROBLEM_UNDERLINE.equals(s)
	 *				|| AnnotationPreference.STYLE_UNDERLINE.equals(s))
	 *			info.setTextStyleValue(s);
	 *		else
	 *			info.setTextStyleValue(AnnotationPreference.STYLE_NONE);
	 * 
	 * 
	 * 
	 */
	public NlxMarkerAnnotationImageProvider() {
		super();
	}
	
	/**
	 * TODO: Here should come a process override that branches off a method that derives the image from plugin.xml
	 * currently image search goes after "org.eclipse.xtext.ui.editor.info" type... 
	 */
	@Override
	public Image getManagedImage(Annotation annotation) {
		// TODO Auto-generated method stub
		return super.getManagedImage(annotation);
	}

}
