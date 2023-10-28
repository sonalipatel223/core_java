package in.com.Comparator;

import java.util.Comparator;

public class Employee4phone implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		
		return o1.phone.compareTo(o2.phone);
	}

}
