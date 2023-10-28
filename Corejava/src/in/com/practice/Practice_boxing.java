package in.com.practice;

public class Practice_boxing {
	public static void main(String[] args) {
		int a = 69;                         //auto boxing
		Integer b = new Integer(a);      // premetive data type change to wrapper class
		System.out.println(a);
		System.out.println(b);
		
		
		
		Integer c = new Integer(78);             // unboxing
		int d = c;
		System.out.println(c);
		System.out.println(d);
		
	}

}
