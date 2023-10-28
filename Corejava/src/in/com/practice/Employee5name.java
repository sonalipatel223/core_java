package in.com.practice;

import java.util.Comparator;

public class Employee5name  implements Comparator<Employee5> {

	@Override
	public int compare(Employee5 o1, Employee5 o2) {
		return o1.name.compareTo(o2.name);
	}

}
