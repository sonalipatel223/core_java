package in.com.practice;
   class Shape{
	   private int borderwidth;
	   private String color;
	   
	   
	   public void  setBorderwidth(int borderwidth) {
		   this.borderwidth = borderwidth;
		   }
	   public int getBorgerwidth() {
		return borderwidth;
		   }
	   public void setColor (String color) {
		   this.color= color;
		   }
	   public String getColor() {
		return color;
		    }
	   
	   public void sona() {
		   System.out.println(borderwidth);
		   System.out.println(color);
		   }
	   }
	   
	   class Tringle extends Shape{
		   private int height ;
		   private int base;
		   
		   public void  setHeight(int height) {
			   this.height = height;
			   }
		   public int getHeight() {
			return height;
			   }
		   public void setBase (int base) {
			   this.base= base;
			   }
		   public int getBase() {
			return base;
			    }
		   public void area() {
			   int area = getBase()*getHeight()/2;
			   System.out.println(area);
		   }
	   }
			   
			    public class Inheritance1 {
			    	public static void main(String[] args) {
						Shape s = new Shape();
						s.setBorderwidth(10);
						s.setColor("yellow");
						s.sona();
						
						Tringle t = new Tringle() ;
						t.setHeight(5);
						t.setBase(20);
						t.area();
						
							}
						}


