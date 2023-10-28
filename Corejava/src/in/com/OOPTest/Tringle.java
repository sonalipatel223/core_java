package in.com.OOPTest;

public class Tringle {
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


public void area () {
	int Tarea = getHeight()*getBase();
	System.out.println("tringle area="+Tarea);
	
}
}