package in.com.OOPTest;
class Employee{
	 void showdetail() {
		 System.out.println("Employee detail");
		 }
	 void showdetail (String name) {
		 System.out.println(name);
	 }
}
	 class devloper extends Employee{
		 void showdetail() {
			 super.showdetail();
			 System.out.println("devloper detail");
		 }
	 void showdetail(String name) {
		 super.showdetail("sp");
		 System.out.println(name);
	 }
	 }

	 
	 public class Overrid {
		 public static void main(String[] args) {
			Employee e ;
			e = new devloper();
			e.showdetail();
			e.showdetail("abc");
				
			}
		}



