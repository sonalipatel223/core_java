package in.com.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Colle1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(90);
		c.add(45);
		c.add(34);
		
		System.out.println(c);
		
		Collection c1 = new ArrayList();
		c1.add("bhavna");
		c1.add("prachi");
		c1.add("sonali");
		
		System.out.println(c1);
		
		c.addAll(c1);
		System.out.println(c);
		
		//  c.clear();
		//    System.out.println(c);
		
		System.out.println(c.contains("sonali"));
		System.out.println(c1.containsAll(c1));
		
		System.out.println(c.isEmpty());
		
		c.remove(c1);
		System.out.println(c);
		
		c.size();
		System.out.println(c);
	}
	

}
