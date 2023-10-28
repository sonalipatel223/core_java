package in.com.OOP;

public class Test_Person {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("sonali");
		p.setDob(2001);
		p.setAddress("raibidpura");
		
		System.out.println(p.getName());
		System.out.println(p.getDob());
		System.out.println(p.getAddress());
		
	}

}
