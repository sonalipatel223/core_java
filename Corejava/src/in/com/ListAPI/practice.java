package in.com.ListAPI;

public class practice {
	public static void main(String[] args) {
		int a = 50;
		Integer b = new Integer(a);        // auto boxing 
		System.out.println(a);           //premetive data type change to wrapper class
		System.out.println(b);
		
	Integer c = new Integer(200);            // unboxing
	int d = c;
	System.out.println(c);
	System.out.println(d);
	}

}
