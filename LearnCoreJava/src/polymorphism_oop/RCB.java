package polymorphism_oop;

public class RCB extends IPL17{
	
	@Override
	public void RCB17() {
		System.out.println("Finally, RCB Won the IPL");
	}

	public static void main(String[] args) {
		IPL17 ipl17 = new RCB();// parent ref = new childclass
		ipl17.Final();
		ipl17.RCB17();

	}

}
