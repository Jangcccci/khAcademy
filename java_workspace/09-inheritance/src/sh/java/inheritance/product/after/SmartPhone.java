package sh.java.inheritance.product.after;

public class SmartPhone extends Product{

	private String os;
	private String carrier;
	
	public SmartPhone() {
		super();
	}
	
	public SmartPhone(String productCode, String productName, String brand, int price, 
			String os, String carrier) {
		super(productCode, productName, brand, price);
		this.os = os;
		this.carrier = carrier;
	}
	
	


	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	public String smartPhoneInfo() {
		return productInfo() + ", os = " + os + ", carrier = " + carrier;
	}
	
}
