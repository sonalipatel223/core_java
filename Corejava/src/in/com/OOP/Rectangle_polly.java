package in.com.OOP;

public class Rectangle_polly extends Shape_polly{
	private int width;
	private int length;
	protected int getWidth() {
		return width;
	}
	protected void setWidth(int width) {
		this.width = width;
	}
	protected int getLength() {
		return length;
	}
	protected void setLength(int length) {
		this.length = length;
	}
	public void area() {
		int Rarea = getLength()* getWidth();
		System.out.println("Rectangle_polly area = " + Rarea);
		
	}

}
