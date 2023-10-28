package in.com.Abstract;


abstract class Lg {
	void disp (String name) {
		System.out.println("all feature available");
	}
	abstract void blututh();
	abstract void ledquality();
	
	}
class samsung extends Lg {
void disp() {
	System.out.println("all available");
}

@Override
void blututh() {
	System.out.println("blututh yes ");
	
}

@Override
void ledquality() {
	
	System.out.println("led yes");
	
}
	
}


public class LCD_Main {
	public static void main(String[] args) {
		Lg L = new samsung() ;
		L.disp("xyz");
		L.blututh();
		L.ledquality();
		}
	}



