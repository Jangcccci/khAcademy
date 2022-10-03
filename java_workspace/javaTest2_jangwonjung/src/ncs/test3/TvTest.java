package ncs.test3;

public class TvTest {

	public static void main(String[] args) {
		Tv[] tvArray = new Tv[3];
		
		tvArray[0] = new Tv("INFINIA", 1_500_000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1_000_000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2_000_000, "3D TV");
		
		for(int i = 0; i < tvArray.length; i++) {
			System.out.println(tvArray[i].toString());
		}
		
		for(int i = 0; i < tvArray.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < tvArray.length; j++) {
				
				if(tvArray[min].getPrice() > tvArray[j].getPrice()) {
					min = j;
				}
			}
			swap(tvArray, i, min);
		}
		
		for(int i = 0; i < tvArray.length; i++) {
			System.out.println(tvArray[i].toString());
		}
		
		System.out.println("가격이 가장 비싼 제품: " + tvArray[2].getName() + "\n가격이 가장 저렴한 제품: " + tvArray[0].getName());
	}
	
	public static void swap(Tv[] tv, int i, int j) {
		Tv tv1 = new Tv();
		tv1 = tv[i];
		tv[i] = tv[j];
		tv[j] = tv1;
	}
}
