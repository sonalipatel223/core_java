package in.com.IO;


import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
	public static void main(String[] args) throws IOException {
		
		FileReader r = new FileReader("C:\\Users\\adity\\Desktop\\IO. stream java\\Ram.txt");
		int ch = r.read();
		
		while (ch != -1) {
			System.out.print((char)ch);
			ch = r.read();
		}
		r.close();
		
	}

}
