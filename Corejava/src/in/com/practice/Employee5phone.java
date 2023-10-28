package in.com.practice;

import java.util.Comparator;

public class Employee5phone implements Comparator<Employee5>{

	@Override
	public int compare(Employee5 o1, Employee5 o2) {
		// TODO Auto-generated method stub
		return o1.phone - o2.phone;
	}

}
