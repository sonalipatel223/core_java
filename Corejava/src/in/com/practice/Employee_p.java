package in.com.practice;

public  class Employee_p implements Comparable<Employee_p> {
	int id ;
	String name;
	int phone;
	
	public  Employee_p(int id ,String name ,int phone) {

		this.id = id;
		this.name = name;
		this.phone = phone ;
	}
	@Override
	public String toString() {
		
		return id +" "+ name+" " + phone;
		
	}
	
	@Override
	public int compareTo(Employee_p o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
