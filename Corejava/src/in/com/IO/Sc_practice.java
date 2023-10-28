package in.com.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Sc_practice {
	public static void main(String[] args) throws IOException {
		FileReader read = new FileReader("C:\\Users\\adity\\Desktop\\IO\\ABC.txt");
		Scanner sc = new Scanner(read);
		while(sc.hasNext()) {
		System.out.println(sc.nextLine());
	}
		sc.close();
		
}
}
