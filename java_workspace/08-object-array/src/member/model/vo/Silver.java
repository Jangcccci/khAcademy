package member.model.vo;

import member.model.vo.other.Buyable;
import member.model.vo.other.Member;

public class Silver extends Member implements Buyable{
	
	public Silver(){}
	public Silver(String name, String grade, int point){
		super(name, grade, point);
	}
	
	@Override
	public double getInterestPoint() {
		return getPoint()/100 * 2;
	}	
	
	@Override
	public int buy(int price) {
		int totalPrice = 0;
		totalPrice = (int)(price - (price * 0.02));
		return totalPrice;
	}
}
