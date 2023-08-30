package abstraction_oops;
	
	//we can add multiple implements(Interface) but not possible in Inheritance(extends)
public class BMW extends Car implements UpcomingProject1,UpcomingProject2{
	
	@Override
	public void engineSecret() {
		System.out.println("BMW has Engine Secret");
	}
	@Override
	public void MRP() {
		System.out.println("BMW MRP");
	}

	public static void main(String[] args) {
		Car car = new BMW();
		car.engineSecret();
		car.MRP();
	}
	@Override
	public void luxury() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int release() {
		// TODO Auto-generated method stub
		return 0;
	}



	

}
