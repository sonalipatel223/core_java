package in.com.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write {
	public static void main(String[] args) {
		File f = new File("java.txt");
		try {
			f.createNewFile();
			
			} catch (IOException e) {
				System.out.println("File not found");
				e.printStackTrace();
			
		}
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("if you can dream it you can do it");
			fw.close();
		} catch (Exception e) {
			System.out.println("kjhghjkkjhjkh");
			e.printStackTrace();
			
		}
	}

}
