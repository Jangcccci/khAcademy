package ncs.test4;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품명을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();
		System.out.print("수량을 입력하세요 : ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println(product.information() + " 총 구매 가격 : " + product.getPrice()*product.getQuantity() + "원");
	}
}
