package de.validas.spedit.ui.highlighting

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper
import com.google.inject.Singleton
import java.util.regex.Pattern

class NlxAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	override protected calculateId(String tokenName, int tokenType) {
		switch tokenName {
			case "(", case ")",
			case "RULE_KOMMA":
				NaturalLangHighlightingStyles.KOMMA
			case "RULE_FULL_STOP":
				NaturalLangHighlightingStyles.FULL_STOP
			case "RULE_IT_ID":
				NaturalLangHighlightingStyles.ITWORD	
			case "RULE_ANY_OTHER",
			case "RULE_IGNORED":
				NaturalLangHighlightingStyles.IGNORED
			case "RULE_MAIL":
				NaturalLangHighlightingStyles.EMAIL
			case "RULE_URL":
				NaturalLangHighlightingStyles.URL
			case "RULE_LIST_POINT":
				NaturalLangHighlightingStyles.LIST_POINT
			case "RULE_DOUBLE", 
			case "RULE_DOUBLE_EN" ,	
			case "RULE_DOUBLE_DE":
				NaturalLangHighlightingStyles.DOUBLE
			case "RULE_SYMBOLS",
			case "RULE_SMILEY",
			case "RULE_ARROW":
				NaturalLangHighlightingStyles.SYMBOLS
			default:
				super.calculateId(tokenName, tokenType)
		} 
	}
}