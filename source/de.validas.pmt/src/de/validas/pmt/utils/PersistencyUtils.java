package de.validas.pmt.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class PersistencyUtils {

	public static void writeTOfFile(File file, List<String> lAllMsg) throws IOException {
		final FileOutputStream inOutStream = new FileOutputStream(file);
		final PrintWriter pw = new PrintWriter(inOutStream);
		for (String sLine:lAllMsg) {
			pw.println(sLine);
		}
		pw.close();
		inOutStream.close();
	}
}
