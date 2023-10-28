package in.com.Iterator_Hasecode;

public class Employee {
	private int id ;
	private String name ;
	private String address;
	
	public Employee(int id ,String name ,String address) {
	this.id = id ;
	this.name = name;
	this.address = address;
	
	}
	@Override
	public String toString() {
		
		return id + " " + name + " " + address;
		
	}
		
@Override
public boolean equals(Object obj) {
	if (!(obj instanceof Employee)) {
	// ! ka use true / false ke liye krte he
		
	}
	return false;

}


}

Employee e = (Employee)obj ;
boolean b = this.id == e.id && this.name == e.name && this.address == e.address;

return b;

}
}








