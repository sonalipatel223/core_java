package in.com.exception;

public class Exp_practice {
	public static void main(String[] args) {
		
	
	int a = 78;
	int b = 0;
	
	String name = "sonali";
	
	try {
		int c = a/b;
	} catch (Exception e) {
		System.out.println(e);
	}
	try {
		System.out.println(name.charAt(7));
	} catch (Exception e) {
		System.out.println(e);
		
	}
	
	
	finally {
		System.out.println("exception ho ya na ho ye to chalega hi ");
	}
	
	

}
}
