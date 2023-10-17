package in.com.Comparator;

public class Employee implements Comparable<Employee> {
	int id ;
	String name ;
	String phone;
	 
	public Employee(int id ,String name ,String phone) {
		
		
      this.id = id;
      this.name = name;
      this.phone = phone;
      }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + phone ;
		
	}
	@Override
	public int compareTo(Employee o) {
		if(this.id>o.id)
			return 1;
		else if(this.id<o.id)
			return -1;
		return 0;
	}
	
	}




