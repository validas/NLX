/**
 * 
 */
package de.validas.nlx.dictionary.util;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.eclipse.xtext.builder.debug.IBuildLogger;

import com.google.inject.Inject;

import java.util.function.*;

/**
 * @author schaller
 *
 */
public class LogUtils implements ILogUtils{

	/**
	 * limits Logging to a certain Amount to avoid redundant Messages
	 * @param LOGGER 
	 */
	private Logger LOGGER;
	private HashMap<String, Integer> logCount = new HashMap<>();
	@Inject
	private IBuildLogger buildLogger;
	
	Function<String, Void> delegate;

	public LogUtils(Logger LOGGER) {
		super();
		this.LOGGER = LOGGER;
		delegate = msg -> {
			LOGGER.info(msg);
			return null;
		};
	}
	
	@Inject
	public LogUtils() {
		super();
		delegate = msg -> {
			if (buildLogger!=null)
				buildLogger.log(msg);
			return null;
		};
	}
	
	
	@SuppressWarnings("restriction")
	public LogUtils(IBuildLogger buildLogger) {
		super();
		this.buildLogger = buildLogger;
		delegate = msg -> {
			if (buildLogger!=null)
				buildLogger.log(msg);
			return null;
		};
	}

	public void logAccess(String logType, int max, String msg) {
		Integer counter = logCount.get(logType); 
		if (counter == null) {
			logCount.put(logType, 0);
			counter = 0;
		}
		
		if (max == 0 || counter < max) {
				delegate.apply(msg);
			if (max > 0) {
				counter ++ ;
				logCount.put(logType, counter);
			}
		}
	}

}
