package in.com.Polymarphis;
class Employee{
	void showdetail() {              // overriding-> same name same parameter but diffrent logic
		System.out.println("this is employee detail");
		}
	void showdetail(String name) {
		System.out.println(name);
	}
}
class Devloper extends Employee{
	void showdetail() {
		super.showdetail();
		System.out.println("this is devloper detail");
		
	}
	void showdetail(String name) {
		super.showdetail("bhavna");
		System.out.println(name);
		
		}
}

	public class Overriding1 {
		public static void main(String[] args) {
			Employee e1 ;
			e1 = new Devloper();
			e1.showdetail();
			e1.showdetail("day");
			
		}
		}
	
