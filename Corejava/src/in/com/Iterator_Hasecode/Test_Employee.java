package in.com.Iterator_Hasecode;

public class Test_Employee {
	public static void main(String[] args) {
		Employee e1 = new Employee(5, "sonali", "indore");
		Employee e2 = new Employee(5, "sonali", "indore");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
	
	
	
	
	
	
	
	
	
}
