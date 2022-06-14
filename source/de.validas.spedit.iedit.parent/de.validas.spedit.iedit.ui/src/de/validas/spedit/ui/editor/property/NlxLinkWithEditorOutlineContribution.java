package de.validas.spedit.ui.editor.property;

import java.util.Map;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.xtext.ui.editor.outline.actions.LinkWithEditorOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class NlxLinkWithEditorOutlineContribution extends LinkWithEditorOutlineContribution {
	
	@Inject
	protected Provider<NlxOutlineWithEditorLinker> outlineWithEditorLinkerProvider;
	
//	@Inject
//	protected Provider<NlxPropertyWithEditorLinker> propertyWithEditorLinkerProvider;

	private IPreferenceStore preferenceStore;

	private Map<OutlinePage, IPropertyChangeListener> page2linker = Maps.newHashMap();

	public NlxLinkWithEditorOutlineContribution() {
		super();
	}
	
	public void register(OutlinePage outlinePage) {
		super.register(outlinePage);
//		NlxPropertyWithEditorLinker propertyWithEditorLinker = propertyWithEditorLinkerProvider.get();
//		propertyWithEditorLinker.activate(outlinePage);
//		propertyWithEditorLinker.setLinkingEnabled(isPropertySet());
//		preferenceStore = getPreferenceStoreAccess().getPreferenceStore();
//		preferenceStore.addPropertyChangeListener(propertyWithEditorLinker);
//		page2linker.put(outlinePage, propertyWithEditorLinker);
	}


	public void deregister(OutlinePage outlinePage) {
		super.deregister(outlinePage);
//		IPropertyChangeListener propertyWithEditorLinker = page2linker.remove(outlinePage);
//		if (propertyWithEditorLinker instanceof NlxPropertyWithEditorLinker) {
//			if (propertyWithEditorLinker != null) {
//				((NlxPropertyWithEditorLinker) propertyWithEditorLinker).deactivate();
//				preferenceStore.removePropertyChangeListener(propertyWithEditorLinker);
//			}
//		}
	}
}


