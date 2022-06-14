package de.validas.nlx.dictionary.util;

import com.google.inject.ImplementedBy;

@ImplementedBy(LogUtils.class)
public interface ILogUtils {
	public void logAccess(String logType, int max, String msg);
}
