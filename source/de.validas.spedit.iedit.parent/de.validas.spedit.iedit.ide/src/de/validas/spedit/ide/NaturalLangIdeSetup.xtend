/*
 * generated by Xtext 2.16.0
 */
package de.validas.spedit.ide

import com.google.inject.Guice
import de.validas.spedit.NaturalLangRuntimeModule
import de.validas.spedit.NaturalLangStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class NaturalLangIdeSetup extends NaturalLangStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new NaturalLangRuntimeModule, new NaturalLangIdeModule))
	}
	
}