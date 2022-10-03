package member.model.vo;

import member.model.vo.other.Buyable;
import member.model.vo.other.Member;

public class Ruby extends Member implements Buyable{

	public Ruby() {}
	public Ruby(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getInterestPoint() {
		return getPoint()/100 * 30;
	}	
	
	@Override
	public int buy(int price) {
		int totalPrice = 0;
		totalPrice = (int)(price - (price * 0.3));
		return totalPrice;
	}
}
