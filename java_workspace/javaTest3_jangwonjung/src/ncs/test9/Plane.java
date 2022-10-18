package ncs.test9;

public abstract class Plane {

	private String planName;
	private int fuelSize;
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public int getFuelSize() {
		return fuelSize;
	}
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	public Plane() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plane(String planName, int fuelSize) {
		super();
		this.planName = planName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		this.fuelSize += fuel;
	}
	
	public abstract void flight(int distance);
}
