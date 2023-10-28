package in.com.Comparator;

public class Employee1 <Employee1> {
	
	int id ;
	String name ;
	String phone;
	 
	public Employee1(int id ,String name ,String phone) {            //  constructor
		
		
      this.id = id;
      this.name = name;
      this.phone = phone;
      }
	@Override
	public String toString() {        // toString ka use hascod ko htane ke liye krte he 
		
		return id + " " + name + " " + phone ;
		
	}
}
//	@Override
//	public int compareTo(Employee1 o) {
//		if(this.id>o.id)
//			return 1;
//		else if(this.id<o.id)
//			return -1;
//		return 0;
//	}
//	
//	}




