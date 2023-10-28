package in.com.Deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Test_Markseet23 {
public static void main(String[] args) throws Exception {
	FileInputStream in = new FileInputStream("C:\\Users\\adity\\Desktop\\IO\\Rays.txt");
	ObjectInputStream out = new ObjectInputStream(in);
	
	Markseet2 m = (Markseet2) out.readObject();
	
	System.out.println("id="+m.id);
	System.out.println("name="+m.name);
	System.out.println("java="+m.java);
	System.out.println("html="+m.html);
	System.out.println("css="+m.css);
	System.out.println("python="+m.python);
	
	
	System.out.println("total="+m.total);

}
}
