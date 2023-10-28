package in.com.Deserialization;

import java.io.FileNotFoundException;

//serialization object ko byte stream me change krta he

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Markseet3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream in = new FileOutputStream("C:\\Users\\adity\\Desktop\\IO\\Rays.txt");
		ObjectOutputStream out = new ObjectOutputStream (in);
		
		Markseet2 s = new Markseet2();
		s.id = 6;
		s.name = "monika";
		s.java = 89;
		s.python = 75;
		s.css= 43;
		s.html = 65;
		s.javascript = 32;
		s.total = s.java + s.python + s.html + s.css + s.javascript;
		out.writeObject(s);
		in.close();
		out.close();
		System.out.println("Object converted into bytstream successfully !!!!");
		
	}

}
