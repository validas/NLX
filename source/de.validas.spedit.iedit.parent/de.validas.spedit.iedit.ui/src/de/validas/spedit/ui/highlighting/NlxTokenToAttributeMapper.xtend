package de.validas.spedit.ui.highlighting;

import java.util.Set;

import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ui.codetemplates.ui.highlighting.TemplatesHighlightingConfiguration;
import org.eclipse.xtext.ui.codetemplates.ui.highlighting.TokenToAttributeMapper;

import com.google.common.collect.ImmutableSet;

@SuppressWarnings("restriction")
public class NlxTokenToAttributeMapper extends TokenToAttributeMapper {
	
	/**
	 * Syntax Highlighting
	 * -------------------
	 * given rules: 
	 * 
	 * #			public static final int RULE_ALPHA=21;
	 * #	    	public static final int RULE_ALPHA_NUMERIC_C=23;
	 *     public static final int RULE_SMILEY=11;
	 * #		    public static final int RULE_NEWLINE=5;
	 * #		    public static final int RULE_ESCAPED_CHAR=19;
	 * #		    public static final int RULE_STRING=8;
	 *     public static final int RULE_EMAIL=17;
	 *     public static final int RULE_IGNORED=12;
	 * #		    public static final int RULE_SL_COMMENT=30;
	 *     public static final int RULE_DOUBLE=14;
	 *     public static final int RULE_ARROW=10;
	 * #		    public static final int EOF=-1;
	 * #		    public static final int T__31=31;
	 * #		    public static final int T__32=32;
	 * #		    public static final int RULE_EMAIL_ALPHA=24;
	 * #		    public static final int RULE_ID=15;
	 * #		    public static final int RULE_WS=18;
	 * #		    public static final int RULE_DECORATIONS=26;
	 * #		    public static final int RULE_EOL=27;
	 * #		    public static final int RULE_ALPHA_NUMERIC=22;
	 * #		    public static final int RULE_URL_PROTOCOL=28;
	 *     public static final int RULE_LIST_POINT=6;
	 * #		    public static final int RULE_ANY_OTHER=9;
	 * #		    public static final int RULE_ALPHA_CAPITAL=20;
	 * 	   public static final int RULE_KOMMA=7;
	 * #		    public static final int RULE_INT=13;
	 * #		    public static final int RULE_URL=16;
	 * #		    public static final int RULE_ML_COMMENT=29;
	 * 	   public static final int RULE_FULL_STOP=4;
	 * #		    public static final int RULE_URL_ALPHA=25;
	 */
	override protected calculateId(String tokenName, int tokenType) {
		switch tokenName {
			case "(", case ")",
			case "RULE_KOMMA":
				return NaturalLangHighlightingStyles.KOMMA
			case "RULE_FULL_STOP":
				return NaturalLangHighlightingStyles.FULL_STOP
			case "RULE_IT_ID":
				return NaturalLangHighlightingStyles.ITWORD	
			case "RULE_ANY_OTHER",
			case "RULE_IGNORED":
				return NaturalLangHighlightingStyles.IGNORED
			case "RULE_MAIL":
				return NaturalLangHighlightingStyles.EMAIL
			case "RULE_URL":
				return NaturalLangHighlightingStyles.URL
			case "RULE_LIST_POINT":
				return NaturalLangHighlightingStyles.LIST_POINT
			case "RULE_DOUBLE", 
			case "RULE_DOUBLE_EN" ,	
			case "RULE_DOUBLE_DE":
				return NaturalLangHighlightingStyles.DOUBLE
			case "RULE_SYMBOLS",
			case "RULE_SMILEY",
			case "RULE_ARROW":
				return NaturalLangHighlightingStyles.SYMBOLS
			default:
				return super.calculateId(tokenName, tokenType)
		} 
	}
	
	
	override String getId(int tokenType) {
		return getMappedValue(tokenType);
	}
	
}
