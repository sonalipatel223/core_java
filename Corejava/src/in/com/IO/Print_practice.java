package in.com.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_practice {
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("C:\\Users\\adity\\Desktop\\IO\\abcd.txt");
		PrintWriter mona = new PrintWriter(file);
		
		mona.println("aaaaaaaaaaaaa");
		mona.println("bbbbbbbbbbbbbb");
		mona.println("ccccccccccccc");
		mona.println("dddddddddddddd");
		
		System.out.println("data copy successefully");
		file.close();
		mona.close();
	}

}
