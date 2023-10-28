package in.com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Employee5 {
	public static void main(String[] args) {
		ArrayList<Employee5> a = new ArrayList<Employee5>();
		
		a.add(new Employee5(1, "sonali", 8907));
		a.add(new Employee5(6, "bhavna", 7657));
		a.add(new Employee5(3, "prachii", 6787));
		a.add(new Employee5(2, "diksha", 1237));
		
		System.out.println(a);
		
		Collections.sort(a, new Employee5id());
		System.out.println(a);
		
		Collections.sort(a, new Employee5name());
		System.out.println(a);
		
		Collections.sort(a, new Employee5phone());
		System.out.println(a);
		
	

}
}
