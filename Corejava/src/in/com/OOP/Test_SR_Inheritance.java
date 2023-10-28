package in.com.OOP;

import java.awt.Shape;

public class Test_SR_Inheritance {
	public static void main(String[] args) {
		
		Shape_inheritance s = new Shape_inheritance ();
		s.setColor("yellow");
		s.setBorderWidth(367);
		
		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());
		
		Rectangle_inheritance  r = new Rectangle_inheritance () ;
		
		r.setLength(90);
		r.setWidth(78);
		
		System.out.println(r.getWidth());
		System.out.println(r.getLength());
	
			
			
			
			
			
		}
			
	}



