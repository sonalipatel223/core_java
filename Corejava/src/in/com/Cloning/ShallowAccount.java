package in.com.Cloning;

import java.util.concurrent.Callable;

public class ShallowAccount implements Callable {
	int balance ;
	
	public ShallowAccount(int balence) {
    this.balance = balance;
    
    
}

	@Override
	public Object call() throws Exception {
		
		return super.clone();
	}
}

