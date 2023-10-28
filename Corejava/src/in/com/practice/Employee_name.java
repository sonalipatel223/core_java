package in.com.practice;

import java.util.Comparator;

public class Employee_name implements Comparator<Employee_p>{

	@Override
	public int compare(Employee_p o1, Employee_p o2) {
		
		return o1.name.compareTo(o2.name);
	}
	

}
//   string compare method hi leta he or int nhi leta he 