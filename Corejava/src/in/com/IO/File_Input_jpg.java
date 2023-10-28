package in.com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Input_jpg {
	public static void main(String[] args) throws IOException {
		FileInputStream SP = new FileInputStream ("C:\\Users\\adity\\Desktop\\IO\\photo.jpg");
		FileOutputStream sona = new FileOutputStream("C:\\Users\\adity\\Desktop\\IO\\doll.jpg");
		
		int ch = SP.read();
		while (ch!= -1) {
		sona.write(ch);	
		ch = SP.read();
		}
		SP.close();
		sona.close();
		
		System.out.println("copy successefully");
			
			
		}
		
	

		}


