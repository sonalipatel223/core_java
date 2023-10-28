package in.com.OOPTest;

public class Overlod {
	public void read() {
		System.out.println("bhavna");
	}
	
		public void read(String bookname) {
			System.out.println(bookname);
			}
		
		public void read(int page,String writer) {
			System.out.println(page);
			System.out.println(writer);
			}
		public void read(int price) {
			System.out.println(price);
		}

}
