/**
 */
package de.validas.spedit.ui.model;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

public final class NaturalLangEditorPlugin extends EMFPlugin {

	public static final NaturalLangEditorPlugin INSTANCE = new NaturalLangEditorPlugin();
	
	private static Implementation plugin;

	public NaturalLangEditorPlugin() {
		super
			(new ResourceLocator [] {
			});
	}

	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	public static Implementation getPlugin() {
		return plugin;
	}
	

	public static class Implementation extends EclipseUIPlugin {

		public Implementation() {
			super();
	
			plugin = this;
		}
	}

}
