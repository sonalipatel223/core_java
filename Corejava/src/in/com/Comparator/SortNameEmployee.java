package in.com.Comparator;

import java.util.Comparator;

public class SortNameEmployee implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		//return o1.name.compareTo(o2.name);
		return o1.phone.compareTo(o2.phone);
	}

}
