package in.com.OOP;

public class Circle_polly extends Shape_polly{
	public double pi = 3.14;
	private int redius;
	public int getRedius() {
		return redius;
	}
	public void setRedius(int redius) {
		this.redius = redius;
	}
	public void area() {
		double Carea = pi * getRedius()*getRedius();
		System.out.println("Circle area = " + Carea);
	}
	

}
