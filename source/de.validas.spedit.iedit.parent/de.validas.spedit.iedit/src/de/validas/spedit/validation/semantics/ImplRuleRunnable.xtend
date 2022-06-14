package de.validas.spedit.validation.semantics

import de.validas.spedit.validation.semantics.token.ITokenChain
import de.validas.spedit.validation.semantics.token.TokenChain
import de.validas.utils.data.types.XPair
import java.util.HashMap
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import de.validas.spedit.validation.semantics.nodes.ImplRuleNode
import de.validas.nlx.ai.semantics.INode

class ImplRuleRunnable extends Thread {
	protected static int nextRunnerNumber = 0
	protected int runnerNr
	protected ImplRuleNode implRuleNode
	protected ITokenChain tokenChain
	protected HashMap<Integer, INode> result = new HashMap

	new(ImplRuleNode implRuleNode, EList<XPair<EObject, String>> chain) {
		super('''ImplRuleRunner-«nextRunnerNumber++»''')
		runnerNr = nextRunnerNumber
		this.implRuleNode = implRuleNode
		this.tokenChain = new TokenChain(chain)
	}

	def solve() {
		implRuleNode.setChain = tokenChain
		var boolean firstToken = true
		while (tokenChain.hasNext()) {
			if (!firstToken)
				tokenChain.nextIndex()
			firstToken = false
			if (tokenChain.isValid) {
				var INode value = implRuleNode.solve()
				if (value !== null) { // contraction handling unclear
					var int i = tokenChain.getIndex().key
					result.put(i, value)
					implRuleNode.getDriver.logger.log('''[ImplRuleRunner-«runnerNr»] [Error]: Required Input on Token:[«i»][name: «tokenChain.toString»] Result:«result.get(i)»''')
				}
			}
		}
	}

	override run() {
		solve
	}

	def getResult() {
		result
	}
}
