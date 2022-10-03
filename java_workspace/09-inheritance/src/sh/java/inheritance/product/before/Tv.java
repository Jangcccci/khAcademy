package sh.java.inheritance.product.before;

public class Tv {

	private String productCode;
	private String productName;
	private String brand;
	private int price;
	
	private String resolution;// 해상도
	private int size; // 인치
	
	//생성자
	public Tv() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tv(String productCode, String productName, String brand, int price, String resolution, int size) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.resolution = resolution;
		this.size = size;
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
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public String tvInfo() {
		return "productCode = " + productCode + ", productName = " + productName + ", barnd = " + brand + ", price = "
				+ price + ", resolution = " + resolution + ", size = " + size;
	}
}
