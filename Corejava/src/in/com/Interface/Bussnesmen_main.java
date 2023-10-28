package in.com.Interface;

public class Bussnesmen_main implements Richman, SocialWork {
	public static void main(String[] args) {
		Bussnesmen_main b = new Bussnesmen_main();
		
		b.earnmoney();
		b.donation();
		b.HelpToOther();
		b.party();
		
		
		
		
		
		
	}
	@Override
	public void earnmoney() {
		System.out.println("earnmaony");
	}
	@Override
	public void donation() {
	System.out.println("donation");	
	}
	@Override
	public void party() {
		System.out.println("party");
		
	}
	@Override
	public void HelpToOther() {
		System.out.println("helptoother");
		
	}
	}

