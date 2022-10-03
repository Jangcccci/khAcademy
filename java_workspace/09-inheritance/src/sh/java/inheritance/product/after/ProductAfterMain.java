package sh.java.inheritance.product.after;

public class ProductAfterMain {

	public static void main(String[] args) {
		String[] hardwares = {"32인치커브드디스플레이", "기계식키보드", "버티컬마우스"};
		Desktop desktop = new Desktop("lenovo-12345", "씽크패드12345", "레노버", 2_000_000, "윈도우11", hardwares);
		System.out.println(desktop.desktopInfo());
	
		SmartPhone smartPhone = new SmartPhone("galaxy-12345", "갤럭시22", "삼성", 2_000_000, "안드로이드", "SK");
		System.out.println(smartPhone.smartPhoneInfo());
		
		Tv tv = new Tv("샤오미-12345", "샤오미번쩍tv", "샤오미", 300_000, "FHD", 72);
		System.out.println(tv.tvInfo());
	}

}
