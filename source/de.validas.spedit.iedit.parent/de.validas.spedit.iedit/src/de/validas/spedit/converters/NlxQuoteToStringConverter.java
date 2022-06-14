package de.validas.spedit.converters;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.ValueConverterWithValueException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.JavaStringConverter;


public class NlxQuoteToStringConverter extends AbstractLexerBasedConverter<String> {
	
	protected class Implementation extends JavaStringConverter {
		
		String errorMessage = null;
		int errorIndex = -1;
		int errorLength = -1;
		int nextIndex = 1;

		protected Implementation() {}
		
		public String convertFromJavaString(String literal) {
//			int idx = literal.indexOf('\\');
//			if (idx < 0 && literal.length() > 1 && literal.charAt(0) == literal.charAt(literal.length() - 1)) {
				return literal.substring(1, literal.length() - 1);
//			}
//			return convertFromJavaString(literal, true, 1, new StringBuilder(literal.length()));
		}
		
	}
	
	@Override
	public String toValue(String string, INode node) {
		if (string == null)
			return null;
		try {
			if (string.length() == 1) {
				throw new ValueConverterWithValueException(getStringNotClosedMessage(), node, "", null);
			}
			return convertFromString(string, node);
		} catch (IllegalArgumentException e) {
			throw new ValueConverterException(e.getMessage(), node, e);
		}
	}
	
	protected String convertFromString(String literal, INode node) throws ValueConverterWithValueException {
		Implementation converter = createConverter();
		String result = converter.convertFromJavaString(literal);
		if (converter.errorMessage != null) {
			throw new ValueConverterWithValueException(converter.errorMessage, node, result.toString(), converter.errorIndex,
					converter.errorLength, null);
		}
		return result;
	}
	
	protected Implementation createConverter() {
		return new Implementation();
	}

	protected String getStringNotClosedMessage() {
		return "String literal is not properly closed";
	}
	
	
	protected boolean isHexSequence(char[] in, int off, int chars) {
		return Implementation.doIsHexSequence(in, off, chars);
	}

}