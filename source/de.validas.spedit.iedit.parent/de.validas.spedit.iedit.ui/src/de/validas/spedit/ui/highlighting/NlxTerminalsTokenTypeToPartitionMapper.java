package de.validas.spedit.ui.highlighting;

import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper;

public class NlxTerminalsTokenTypeToPartitionMapper extends TerminalsTokenTypeToPartitionMapper {
	
	
	protected static final String[] SUPPORTED_PARTITIONS = new String[]{
			NaturalLangHighlightingStyles.FULL_STOP,
			NaturalLangHighlightingStyles.KOMMA,
			NaturalLangHighlightingStyles.DOUBLE,
			NaturalLangHighlightingStyles.SYMBOLS,
			NaturalLangHighlightingStyles.EMAIL,
			NaturalLangHighlightingStyles.URL,
			NaturalLangHighlightingStyles.LIST_POINT,
			NaturalLangHighlightingStyles.IGNORED,
			COMMENT_PARTITION,
			SL_COMMENT_PARTITION,
			STRING_LITERAL_PARTITION,
			IDocument.DEFAULT_CONTENT_TYPE
		};

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
	protected String calculateId(String tokenName, int tokenType) {
		
		if("RULE_FULL_STOP".equals(tokenName)) {
			return NaturalLangHighlightingStyles.FULL_STOP;
		}
		if("RULE_KOMMA".equals(tokenName)) {
			return NaturalLangHighlightingStyles.KOMMA;
		}
		if("RULE_DOUBLE".equals(tokenName)) {
			return NaturalLangHighlightingStyles.DOUBLE;
		}
		if("RULE_SMILEY".equals(tokenName) || "RULE_ARROW".equals(tokenName)) {
			return NaturalLangHighlightingStyles.SYMBOLS;
		}
		if("RULE_MAIL".equals(tokenName)) {
			return NaturalLangHighlightingStyles.EMAIL;
		}
		if("RULE_URL".equals(tokenName)) {
			return NaturalLangHighlightingStyles.URL;
		}
		if("RULE_LIST_POINT".equals(tokenName)) {
			return NaturalLangHighlightingStyles.LIST_POINT;
		}
		if("RULE_IGNORED".equals(tokenName)) {
			return NaturalLangHighlightingStyles.IGNORED;
		}
		return super.calculateId(tokenName, tokenType);
	}
	
	@Override
	public String[] getSupportedPartitionTypes() {
		return SUPPORTED_PARTITIONS;
	}
}
