package in.com.Cloning;

public class Test_ShallowAccount {
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		Shallow_Account a1 = new Shallow_Account(500);
		Shallow_Account a2 = (Shallow_Account) a1.clone();
		
		a2.balance = 800;
		System.out.println(a1.balance);
		System.out.println(a2.balance);
		
	}

}
