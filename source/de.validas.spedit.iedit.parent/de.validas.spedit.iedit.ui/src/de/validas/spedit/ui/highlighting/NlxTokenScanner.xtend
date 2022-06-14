package de.validas.spedit.ui.highlighting

import org.eclipse.xtext.ui.editor.syntaxcoloring.TokenScanner
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper
import com.google.inject.Inject
import org.eclipse.jface.text.rules.IToken
import org.eclipse.jface.text.rules.Token
import org.eclipse.xtext.ui.editor.model.ILexerTokenRegion

class NlxTokenScanner extends TokenScanner {
	
	@Inject
	NlxTokenToAttributeMapper tokenIdMapper;
	
	override setTokenIdMapper(AbstractAntlrTokenToAttributeIdMapper tokenIdMapper) {
		this.tokenIdMapper = tokenIdMapper
	}
	
	override IToken createToken(ILexerTokenRegion currentToken) {
		var id = tokenIdMapper.getId(currentToken.getLexerTokenType())
		var token = new Token(getAttribute(id))
		return token
	}
	
	override AbstractAntlrTokenToAttributeIdMapper getTokenIdMapper() {
		tokenIdMapper
	}
	
	
}