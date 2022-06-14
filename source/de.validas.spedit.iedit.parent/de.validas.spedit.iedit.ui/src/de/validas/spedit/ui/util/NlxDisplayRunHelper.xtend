package de.validas.spedit.ui.util

import org.eclipse.xtext.ui.util.DisplayRunHelper
import org.eclipse.swt.widgets.Display

class NlxDisplayRunHelper extends DisplayRunHelper {
	

	def static runSyncInDisplayThread(Runnable runnable) {
		if (Display.getCurrent() === null) {
			Display.getDefault().syncExec(runnable)
		} else {
			Display.getCurrent().syncExec(runnable)
		}
	}

	def static runAsyncInDisplayThread(Runnable runnable) {
		if (Display.getCurrent() === null) {
			Display.getDefault().asyncExec(runnable)
		} else {
			Display.getCurrent().asyncExec(runnable)
		}
	}
}