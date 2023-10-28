package in.com.Thread;

public class Without_Thread {
	String name = null;
	public Without_Thread(String name) {
		this.name = name;
		}
	public void run () {
	for (int i = 0; i <= 10; i++) {
		System.out.println(name+" "+i);
		}	
	}
	}
