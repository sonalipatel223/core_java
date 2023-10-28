package in.com.practice;

import java.util.Comparator;

public class Employee5id implements Comparator<Employee5> {

	@Override
	public int compare(Employee5 o1, Employee5 o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}

}
