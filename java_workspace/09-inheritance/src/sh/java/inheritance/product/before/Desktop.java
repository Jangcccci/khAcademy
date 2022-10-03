package sh.java.inheritance.product.before;

import java.util.Arrays;

public class Desktop {
	
	private String productCode;
	private String productName;
	private String brand;
	private int price;
	
	private String os;
	
	private String[] hardwares;

	
	//생성자
	public Desktop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Desktop(String productCode, String productName, String brand, int price, String os, String[] hardwares) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.os = os;
		this.hardwares = hardwares;
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
	
	
	public String[] getHardwares() {
		return hardwares;
	}
	
	
	public void setHardwares(String[] hardwares) {
		this.hardwares = hardwares;
	}
	
	public String desktopInfo() {
		return "productCode = " + productCode + ", productName = " + productName + ", brand = "
				+ brand + ", price = " + price + ", os = " + os + ", hardwares = " + Arrays.toString(hardwares);
	}
	
}
