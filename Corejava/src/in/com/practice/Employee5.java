package in.com.practice;

import in.com.Comparator.Employee1;

public class Employee5 <Employee5>{
	int id ;
	 String name;
	int phone;
	
	public Employee5 (int id ,String name ,int phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		
	}

	@Override
	public String toString() {
		
		return id+" "+name+" "+phone;
	}
//	@Override
//	public int compareTo(Employee5 o) {
//		if(this.id>o.id)
//			return 1;
//		else if(this.id<o.id)
//			return -1;
//		return 0;
//	}
	
	}





	

