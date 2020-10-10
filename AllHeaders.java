package URLClass;

import java.net.*;
import java.io.*;
public class AllHeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h="http://iuh.edu.vn";
		for (int i=0; i < h.length(); i++) {
			try {
			URL u = new URL("http://iuh.edu.vn");
			URLConnection uc = u.openConnection( );
			for (int j = 1; ; j++) {
			String header = uc.getHeaderField(j);
			if (header == null) break;
			System.out.println(uc.getHeaderFieldKey(j) + ": " + header);
			}
			}
			catch (MalformedURLException ex) {
			System.err.println(args[i] + " is not a URL I understand.");
			}
			catch (IOException ex) {
			System.err.println(ex);
			}
			System.out.println( );
		}
	}

}