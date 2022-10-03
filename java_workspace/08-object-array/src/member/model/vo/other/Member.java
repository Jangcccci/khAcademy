package member.model.vo.other;

public class Member implements Buyable{

	protected String name; // 자식클래스에서 직접 접근 가능
	protected String grade;
	protected int point;
	
	public Member() {}
	public Member(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public double getInterestPoint() {
		return this.point/100;
	}
	@Override
	public int buy(int price) {
		int totalPrice = 0;
		totalPrice = (int)(price);
		return totalPrice;
	}
//	public void insertMember(Member[] member) {
//		member[] = member;
//	}
	
}
