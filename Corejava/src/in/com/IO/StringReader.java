package in.com.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringReader {
	public static void main(String[] args) throws IOException {
		FileReader r = new FileReader ("C:\\\\Users\\\\adity\\\\Desktop\\\\IO. stream java\\\\Ram.txt");
		BufferedReader reader = new BufferedReader(r);
		String line = reader.readLine();
		while(line != null) {
			System.out.println(line);
			line = reader.readLine();
			
		}
		r.close();
		reader.close();
	}

}
