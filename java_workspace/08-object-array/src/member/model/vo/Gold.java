package member.model.vo;

import member.model.vo.other.Buyable;
import member.model.vo.other.Member;

public class Gold extends Member implements Buyable{
	
	public Gold(){
		super();
	}
	public Gold(String name, String grade, int point){
//		super(name, grade, point);
		this.name = name; // protected라서 다른 패키지지만 가능하다.
		this.grade = grade;
		this.point = point;
	}
	
	@Override
	public double getInterestPoint() {
		return getPoint()/100 * 5;
	}
	
	@Override
	public int buy(int price) {
		int totalPrice = 0;
		totalPrice = (int)(price - (price * 0.05));
		return totalPrice;
	}
}
