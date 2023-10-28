package in.com.Cloning;

public class Test_Account_Customer {
public static void main(String[] args) throws CloneNotSupportedException {
	
	deep_Customer c1 = new deep_Customer("sonali",698);
	deep_Customer c2 = (deep_Customer) c1.clone();
	
	c2.name = "sona";
	c2.a.balance = 600;
	
	System.out.println(c1.name);
	System.out.println(c1.balance);
	
	System.out.println(c2.name);
	System.out.println(c2.a.balance);
	
	
}
}
