package net.product.run;

import net.product.model.Product;

public class Run {

	public static void main(String[] args) {
			Product product = new Product();
			product.setProdCode(12345L);
			product.setProdName("통돌이세탁기");
			product.setPrice(1000000);
			product.setBrand("LG");
			product.setTaxRate(0.01);
			
			product.information();
	}
}
