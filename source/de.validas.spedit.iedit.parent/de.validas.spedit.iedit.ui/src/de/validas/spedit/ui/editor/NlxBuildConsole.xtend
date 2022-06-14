package de.validas.spedit.ui.editor

import org.eclipse.xtext.builder.debug.XtextBuildConsole
import org.eclipse.ui.console.ConsolePlugin
import com.google.inject.Singleton
import org.eclipse.xtext.builder.debug.IBuildLogger

import static extension com.google.common.base.Throwables.*

class NlxBuildConsole extends XtextBuildConsole {
	//val PrintStream out

	new() {
		super()
	}

	static class Factory extends XtextBuildConsole.Factory {
		override void openConsole() {
			var consoleManager = ConsolePlugin.^default.consoleManager
			val console = consoleManager.consoles.filter(XtextBuildConsole)
			if (console !== null)
				consoleManager.removeConsoles(console)
			consoleManager.addConsoles(#[new NlxBuildConsole()])
		}
	}

	@Singleton
	static class Logger extends XtextBuildConsole.Logger implements INlxBuildLogger {
		static IBuildLogger delegate

		override log(Object it) {
			if (delegate !== null)
				delegate.log(it)
			val consoleManager = ConsolePlugin.getDefault.consoleManager
			val console = consoleManager.consoles.filter(NlxBuildConsole).head
			if (console !== null) {
				console.println(
					'[' + Thread.currentThread.name + '] ' + switch it {
						Throwable:
							stackTraceAsString
						default:
							it.toString
					}
				)
				//consoleManager.showConsoleView(console)
			}
		}

		override registerDelegate(IBuildLogger delegate) {
			Logger.delegate = delegate
		}
	}
}
