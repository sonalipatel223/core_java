package in.com.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Test_Employee {
	public static void main(String[] args) {
		ArrayList<Employee> e1 = new ArrayList<Employee>();
		e1.add(new Employee(3, "bhavna","4567"));
		e1.add(new Employee(8, "sonali","90587"));
		e1.add(new Employee(9, "monika","3567"));
		e1.add(new Employee(1, "rupali","23567"));
		e1.add(new Employee(2, "pramila","67567"));
		
		System.out.println(e1);
		Collections.sort(e1,new Comparatorid());
		System.out.println(e1);
		
	}
}

