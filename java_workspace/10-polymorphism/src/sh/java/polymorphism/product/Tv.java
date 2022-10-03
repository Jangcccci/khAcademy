package sh.java.polymorphism.product;

public class Tv extends Product	{

	private String resolution;
	private int size;
	
	public Tv() {
		super();
	}
//	public Tv(String productCode, String productName, String brand, int price, String resolution, int size) {
//		super(productCode, productName, brand, price);
//		this.resolution = resolution;
//		this.size = size;
//	}
	//Source통해서 쌉가넝
	public Tv(String productCode, String productName, String brand, int price, String resolution, int size) {
		super(productCode, productName, brand, price);
		this.resolution = resolution;
		this.size = size;
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
		return super.productInfo() + ", resolution = " + resolution + ", size = " + size;
	}
	@Override
	public String productInfo() {
		return tvInfo();
	}
}
