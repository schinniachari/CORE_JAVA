package com.chinni.basics.convertions;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class InputStreamToString {

	public static void main(String[] args) throws Exception, IOException {

		InputStream is = new URL("http://google.com").openStream();
		System.out.println(convertIntoString(is));

	}

	private static String convertIntoString(InputStream inputStream) throws Exception {
		//PREVIOUS METHODLOGY
/*		try {
			InputStreamReader inR = new InputStreamReader(inputStream);
			BufferedReader buf = new BufferedReader(inR);
			String line,result;
			while ((line = buf.readLine()) != null) {
				System.out.println(line);
				result+=line
			}
			return line;
		} finally {
			inputStream.close();
		}*/ 
		
		//		NEW METHODOLOGY
/*		StringWriter writer = new StringWriter();
		IOUtils.copy(inputStream, writer,StandardCharsets.UTF_8);
		String theString = writer.toString();
		return theString;
*/		
		//BY SCANNER 
		Scanner s = null;
		try {
			s = new Scanner(inputStream).useDelimiter("\\A");
			return s.hasNext() ? s.next() : "";
		} finally {
			s.close();
		}
	}

}
