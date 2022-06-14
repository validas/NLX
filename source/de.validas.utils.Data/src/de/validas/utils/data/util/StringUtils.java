package de.validas.utils.data.util;

public class StringUtils {

		/**
		 * escape()
		 *
		 * Escape a give String to make it safe to be printed or stored.
		 *
		 * @param s The input String.
		 * @return The output String.
		 **/
		public static String escape(String s){
		  return s.replace("\\", "\\\\")
		          .replace("\t", "\\t")
		          .replace("\b", "\\b")
		          .replace("\n", "\\n")
		          .replace("\r", "\\r")
		          .replace("\f", "\\f")
		          .replace("\'", "\\'")
		          .replace("\"", "\\\"");
		}
		
		/**
		 * escape()
		 *
		 * Escape a give String to make it safe to be printed or stored.
		 *
		 * @param s The input String.
		 * @return The output String.
		 **/
		public static String special_escape(String s){
		  return s.replace("\\", "{bs}")
		          .replace("\t", "{t}")
		          .replace("\b", "{b}")
		          .replace("\n", "{n}")
		          .replace("\r", "{r}")
		          .replace("\f", "{f}")
		          .replace("\'", "{'}")
		          .replace("\"", "{quote}");
		}
}
