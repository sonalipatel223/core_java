package in.com.Polymarphis;

public class Overloding_poly {
	public void read() {          // overloding-> same name but diffrent parameter 
		System.out.println("read book");
	}
	public void read (String bookname) {
		System.out.println("this is book name");
		System.out.println(bookname);
	}
	public void read (String Writer,int page) {
		System.out.println(Writer);
		System.out.println(page);
	}
	
	public void read( int price,String language) {
		System.out.println(language);
		
		
	}

}
