package in.com.exception;

public class Exp3 {
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		
	m2();
	}
	public static void m2() {
		try {
		m3();
		
		} catch ( Exception e) {
			System.out.println(e);
		}
	}
	public static void m3() {
	String name = "prachi";
	System.out.println(name.charAt(10));	
	}

}

