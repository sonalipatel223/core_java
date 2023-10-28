package in.com.exception;

public class Test_Runtime_exp {
	public static void main(String[] args) {
		
	String name = "sonali";
	if (name.equals("sonal")) {
		System.out.println("valid");
		
	}
	else {
		RunTime_exp r = new RunTime_exp() ;
		
		try {
			throw r;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
		
	}
	

}
