package in.com.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class test_Employee1234 {
	public static void main(String[] args) {
		ArrayList<Employee1>e1 = new ArrayList<Employee1>();
		e1.add(new Employee1(8, "bhavna", "1271"));
		e1.add(new Employee1(6, "sonali", "9876"));
		e1.add(new Employee1(1, "anjali", "2358"));
		e1.add(new Employee1(3, "monika", "6835"));
		e1.add(new Employee1(2, "pramila", "3572"));
		
		System.out.println(e1);
		
	Collections.sort(e1, new Employee3byid());
		System.out.println(e1);
		
		//ArrayList<Employee1> e2 = new ArrayList<Employee1>();
		Collections.sort(e1,new Employee2byname());
		System.out.println(e1);
		
		//ArrayList<Employee1> e3 = new ArrayList<Employee1>();
		Collections.sort(e1, new Employee4phone () );
		System.out.println(e1);
	}

}
