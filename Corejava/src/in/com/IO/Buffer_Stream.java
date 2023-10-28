package in.com.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Buffer_Stream {
public static void main(String[] args) throws IOException {
	
	System.out.println("Enter here your text");
	
	//system.in ka use user se input lene ke liye krte he
	
	InputStreamReader reader= new InputStreamReader(System.in);
	BufferedReader bhavna = new BufferedReader(reader);
	FileWriter write = new FileWriter("C:\\Users\\adity\\Desktop\\IO\\bhavna.txt");
	PrintWriter sona = new PrintWriter(write);
	String line = bhavna.readLine();
	while(!(line.equals("byyyy"))) {
		
	    // run krne ke bad enter krne pr jitne msg dalna ho dal skte he
		//jese hi byyyy dalenge compiler close ho jayega 
		
	sona.println(line);
	line = bhavna.readLine();
}
System.out.println("your compiler is closed");
reader.close();
write.close();

 }
}
