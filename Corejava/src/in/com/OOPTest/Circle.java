package in.com.OOPTest;

public class Circle {
	public double pi = 3.14;
	private int redius;
	public int getRedius() {
		return redius;
	}
	public void setRedius(int redius) {
		this.redius = redius;
	}
	


public void area() {
	double carea = pi* getRedius()*getRedius();
	System.out.println("circle area =" +carea);
	
}

	
}