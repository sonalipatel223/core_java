package in.com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee_main {
	

	public static void main(String[] args) {
		ArrayList<Employee_p> e = new ArrayList<Employee_p>();
		e.add(new Employee_p(8, "bhavna", 7890));
		e.add(new Employee_p(2, "sonali", 9790));
		e.add(new Employee_p(5, "anjali", 3290));
		e.add(new Employee_p(9, "pramila",8590));
		e.add(new Employee_p(1, "minal", 4590));
		
		System.out.println(e);
		
		
		Collections.sort(e,new Employee_ID());
		System.out.println(e);
		
		Collections.sort(e,new Employee_name());
		System.out.println(e);
		
		
		Collections.sort(e,new Employee_phone());
		System.out.println(e);
	}

}
