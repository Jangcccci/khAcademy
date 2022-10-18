package ncs.test9;

public class Airplane extends Plane{
	
	public Airplane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airplane(String planName, int fuelSize) {
		super(planName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {
		setFuelSize(getFuelSize() - (distance/10 * 30));
	}
}
