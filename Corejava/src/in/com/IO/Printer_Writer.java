package in.com.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Printer_Writer {
	public static void main(String[] args) throws IOException {
	FileWriter file = new FileWriter ("C:\\Users\\adity\\Desktop\\IO\\bykeyword.txt");
	PrintWriter sona = new PrintWriter(file);
	sona.println("hiiii guys");
	sona.println("how are you");
	sona.println("where are you going");
	
	System.out.println("data write successfully!!!!!");
	file.close();
	sona.close();
	
	
	
	
	}

}
