package sh.java.inheritance.product.before;

public class ProductBeforeMain {

	public static void main(String[] args) {
		
		String[] hardwares = {"FHD27인치모니터","기계식적축키보드","게임용마우스"};
		Desktop desktop = new Desktop("ss-12345", "삼성데스크탑12345", "삼성", 1_500_000, "윈도우11", hardwares);
		System.out.println(desktop.desktopInfo());
		
		SmartPhone smartPhone = new SmartPhone("iphone14-qwerty", "아이폰14", "애플", 2_000_000, "ios", "SKT");
		System.out.println(smartPhone.smartPhoneInfo());
		
		Tv tv = new Tv("lg-ssddff", "엘지스마트TV", "LG", 5_000_000, "UHD", 100);
		System.out.println(tv.tvInfo());
	}

}
