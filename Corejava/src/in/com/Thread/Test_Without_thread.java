package in.com.Thread;

public class Test_Without_thread {
	public static void main(String[] args) {
		Without_Thread w1= new Without_Thread ("king");
		Without_Thread w2 = new Without_Thread ("kohli");
		
		w1.run();
		w2.run();
		
			
		}
	}


