package ncs.test9;

public class Cargoplane extends Plane{

	public Cargoplane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cargoplane(String planName, int fuelSize) {
		super(planName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {
		setFuelSize(getFuelSize() - (distance/10) * 50);
	}

	
}
