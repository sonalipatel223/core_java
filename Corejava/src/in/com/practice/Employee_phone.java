package in.com.practice;

import java.util.Comparator;

public class Employee_phone implements Comparator<Employee_p> {

	@Override
	public int compare(Employee_p o1, Employee_p o2) {
		// TODO Auto-generated method stub
		return o1.phone-o2.phone;
	}
	
	

}
