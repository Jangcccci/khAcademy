package sh.java.inheritance.product.before;

public class SmartPhone {

	private String productCode;
	private String productName;
	private String brand;
	private int price;
	
	private String os;
	
	private String carrier; //통신사

	
	//생성자
	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String productCode, String productName, String brand, int price, String os, String carrier) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.os = os;
		this.carrier = carrier;
	}

	//getter/setter
	public String getProductCode() {
		return productCode;
	}
	
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	
	public String getProductName() {
		return productName;
	}
	
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	public String getBrand() {
		return brand;
	}
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
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
		return "productCode = " + productCode + ", productName = " + productName + ", barnd = " + brand + ", price = "
				+ price + ", os = " + os + ", carrier = " + carrier;
	}
}
