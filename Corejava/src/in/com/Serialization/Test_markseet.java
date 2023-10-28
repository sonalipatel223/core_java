package in.com.Serialization;

import java.io.FileNotFoundException;

//serialization object ko byte stream me change krta he

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test_markseet {
	public static void main(String[] args) throws IOException {
		FileOutputStream in = new FileOutputStream("C:\\Users\\adity\\Desktop\\IO\\patel.txt");
		ObjectOutputStream out = new ObjectOutputStream (in);
		
		Markseet1 s = new Markseet1();
		s.id = 6;
		s.name = "monika";
		s.java = 89;
		s.python = 75;
		s.css= 43;
		
		s.total = s.java + s.python + s.html + s.css ;
		out.writeObject(s);
		in.close();
		out.close();
		System.out.println("Object converted into bytstream successfully !!!!");
		
	}

}
