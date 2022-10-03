package sh.java.polymorphism.product;

public class ProductMain {
	
	private Product[] products = new Product[3];
	{
		String[] hardwares = {"32인치커브드디스플레이", "기계식키보드", "버티컬마우스"};
		products[0] = new Desktop("lenovo-12345", "씽크패드12345", "레노버", 2_000_000, "윈도우11", hardwares);
		products[1] = new SmartPhone("galaxy-12345", "갤럭시22", "삼성", 2_000_000, "안드로이드", "SK");
		products[2] = new Tv("샤오미-12345", "샤오미번쩍tv", "샤오미", 300_000, "FHD", 72);
	}

	public static void main(String[] args) {
		ProductMain main = new ProductMain();
		main.test1();
		main.test2();
	}
	/**
	 * 1. products를 순회하면서 타입별 info 메소드를 호출하세요.
	 */
	public void test1() {
		for(int i = 0; i < products.length; i++) {
			if(products[i] instanceof Desktop) {
				System.out.println(((Desktop)products[i]).desktopInfo());
			}else if (products[i] instanceof SmartPhone) {
				System.out.println(((SmartPhone)products[i]).smartPhoneInfo());
			}else if(products[i] instanceof Tv) {
				System.out.println(((Tv)products[i]).tvInfo());
			}
		}
	}
	
	/**
	 * 2. Product#productInfo메소드를 override하고(제품별 info메소드 호출), instanceof분기처리 없이 동일한 결과출력하기(동적바인딩)
	 */
	public void test2() {
		for(int i = 0; i < products.length; i++) {
			System.out.println(products[i].productInfo());
		}
	}
}
