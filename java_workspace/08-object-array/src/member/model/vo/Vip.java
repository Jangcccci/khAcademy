package member.model.vo;

import member.model.vo.other.Buyable;
import member.model.vo.other.Member;

public class Vip extends Member implements Buyable{

	public Vip(){}
	public Vip(String name, String grade, int point){
		super(name, grade, point);
	}
	
	@Override
	public double getInterestPoint() {
		return getPoint()/100 * 10;
	}
	
	@Override
	public int buy(int price) {
		int totalPrice = 0;
		totalPrice = (int)(price - (price * 0.1));
		return totalPrice;
	}

}
