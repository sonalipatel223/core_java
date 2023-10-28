package in.com.Collection;

import java.util.LinkedList;

public class Colle2 {
	public static void main(String[] args) {
		
		LinkedList a1 = new LinkedList();
		a1.add("sona");
		a1.add(89);
		a1.add(45.0);
		
		a1.add(0, 34);             // 0 index pe 34 aayega
		System.out.println(a1);
		
		System.out.println(a1.get(2));         // jo 2 index pe value hogi vo print hogi
		
		//   a1.remove(3);              // jo 3 num per hoga vo remove ho jayega 
		//   System.out.println(a1);
		
		a1.set(1, 55);
		System.out.println(a1);
		
		System.out.println("Index position"+ a1.indexOf(45.0));
		
         System.out.println(a1.lastIndexOf(89));
         
         System.out.println(a1.subList(0,2));
		
	}

}
