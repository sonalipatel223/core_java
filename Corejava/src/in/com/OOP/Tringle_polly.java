package in.com.OOP;

public class Tringle_polly extends Shape_polly{
	private int height;
	private int base;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
public void area() {
	int Tarea = getHeight()*getBase()/2;
	System.out.println("Tringle Tarea =" + Tarea);
}
}
