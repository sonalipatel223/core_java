package in.com.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test_Write {
	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("C:\\Users\\adity\\Desktop\\IO\\Hello.txt");
		writer.write("who are you?");
		writer.close();
		System.out.println("data copy successfully");
	}

}
