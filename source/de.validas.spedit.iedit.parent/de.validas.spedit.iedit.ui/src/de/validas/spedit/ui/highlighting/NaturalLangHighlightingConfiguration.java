package de.validas.spedit.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class NaturalLangHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	public static final String KOMMA = NaturalLangHighlightingStyles.KOMMA;
	public static final String FULL_STOP = NaturalLangHighlightingStyles.FULL_STOP;
	public static final String DOUBLE = NaturalLangHighlightingStyles.DOUBLE;
	public static final String SYMBOLS = NaturalLangHighlightingStyles.SYMBOLS;
	public static final String EMAIL = NaturalLangHighlightingStyles.EMAIL;
	public static final String URL = NaturalLangHighlightingStyles.URL;	
	public static final String LIST_POINT = NaturalLangHighlightingStyles.LIST_POINT;
	public static final String ITWORD = NaturalLangHighlightingStyles.ITWORD;
	public static final String IGNORED = NaturalLangHighlightingStyles.IGNORED;
	

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(FULL_STOP, "End of Sentence", fullStopStyle());
		acceptor.acceptDefaultHighlighting(KOMMA, "Separation between Sentences", kommaStyle());
		acceptor.acceptDefaultHighlighting(DOUBLE, "Floating Point Number", doubleStyle());
		acceptor.acceptDefaultHighlighting(SYMBOLS, "Symbol Signs", symbolSignsStyle());   
		acceptor.acceptDefaultHighlighting(EMAIL, "Email Address", emailStyle());     
		acceptor.acceptDefaultHighlighting(URL, "URL Address", urlStyle());         
		acceptor.acceptDefaultHighlighting(LIST_POINT,"List Point", listPointStyle());
		acceptor.acceptDefaultHighlighting(ITWORD,"Special IT-Identifier", itWordStyle());
		acceptor.acceptDefaultHighlighting(IGNORED,"Ignored Text", ignoredTextStyle());
				
		super.configure(acceptor);
	}
	
	private TextStyle listPointStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		textStyle.setColor(new RGB(192, 0, 60));
		return textStyle;
	}

	private TextStyle urlStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.UNDERLINE_LINK);
		textStyle.setColor(new RGB(0, 0, 192));
		return textStyle;
	}

	private TextStyle emailStyle() {
		TextStyle textStyle = urlStyle().copy();
		return textStyle;
	}

	private TextStyle symbolSignsStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		textStyle.setColor(new RGB(192, 160, 20));
		return textStyle;
	}

	private TextStyle doubleStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.ITALIC);
		textStyle.setColor(new RGB(60, 60, 60));
		return textStyle;
	}

	private TextStyle kommaStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.NONE);
		textStyle.setColor(new RGB(0, 0, 192));
		return textStyle;
	}

	private TextStyle fullStopStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.NONE);
		textStyle.setColor(new RGB(192, 0, 0));
		return textStyle;
	}
	
	public TextStyle punctuationTextStyle() {
		TextStyle textStyle = kommaStyle().copy();
		return textStyle;
	}
	
	public TextStyle itWordStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.NONE);
		textStyle.setColor(new RGB(120, 0, 120));
		return textStyle;
	}
	
	public TextStyle ignoredTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.ITALIC);
		textStyle.setColor(new RGB(0, 192, 60));
		return textStyle;
	}


}
