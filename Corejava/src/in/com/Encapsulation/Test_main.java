package in.com.Encapsulation;

public class Test_main {
	public static void main(String[] args) {
		Shape s = new Shape() ;
		s.setBorderwidth(45);
		s.setColor("pink");
		
		System.out.println(s.getBorderwidth());
		System.out.println(s.getColor());
			
		}
	}


