package in.com.Cloning;

public class Shallow_Account implements Cloneable{
	int balance ;
	public Shallow_Account (int balance) {          // cunstructor
		this.balance = balance;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
