package in.com.Cloning;

public class deep_Customer implements Cloneable {
	String name ;
	int balance ;
	 Deep_Account  a = new  Deep_Account ();
	 public deep_Customer (String name,int balence) {
		 this.name = name;
		 }
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
