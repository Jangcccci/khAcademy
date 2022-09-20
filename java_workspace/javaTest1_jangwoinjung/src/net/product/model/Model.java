package net.product.model;

public class Model {

	long prodCode;
	String prodName;
	int price;
	String brand;
	double taxRate;

	public void information() {
		System.out.println("prodCode=" + prodCode + ", prodName=" + prodName + ", price=" + price + ", brand=" + brand
				+ ", taxRate=" + taxRate);
	}

	// setter/getter
	public long getProdCode() {
		return prodCode;
	}

	public void setProdCode(long prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

}
