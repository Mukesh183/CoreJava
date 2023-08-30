package abstraction_oops;

public class Audi extends Car implements UpcomingProject1{
	@Override
	public void engineSecret() {
		System.out.println("Audi has Engine Secret");
	}
	@Override
	public void MRP() {
		System.out.println("Audi MRP");
	}

	public static void main(String[] args) {
		Car car = new Audi();
		car.engineSecret();
		car.MRP();
		car.wheels();
		
	}
	@Override
	public void luxury() {
		System.out.println("Too Luxury");
		
	}
	@Override
	public int release() {
		System.out.println("2024");
		return 0;
	}

}
