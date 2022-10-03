package sh.java.inheritance.shape;

public class Rectangle extends Shape	{

	Point[] points = new Point[4];
	private int width;// = points[1].getX() - points[0].getX();
	private int height;// = points[3].getY() - points[0].getY();
	
	public Rectangle() {
		super();
	}
	public Rectangle(Point[] points) {
		this.points = points;
		width = points[1].getX() - points[0].getX();
		height = points[3].getY() - points[0].getY();
	}
	public Rectangle(Point leftTop, int width, int height) {
		this.points[0] = leftTop;
		this.points[1] = new Point(leftTop.getX() + width, leftTop.getY());
		this.points[2] = new Point(leftTop.getX() + width, leftTop.getY() + height);
		this.points[3] = new Point(leftTop.getX(), leftTop.getY() + height);
		this.width = width;
		this.height = height;
	}
	public Rectangle(Point leftTop, Point rightBottom) {
		this.points[0] = leftTop;
		this.points[1] = new Point(rightBottom.getX(), leftTop.getY());
		this.points[2] = rightBottom;
		this.points[3] = new Point(leftTop.getX(),rightBottom.getY());
		width = points[1].getX() - points[0].getX();
		height = points[3].getY() - points[0].getY();
	}
	
	@Override
	public void draw() {
		System.out.println("네 꼭지점이 (" + points[0] + "), (" + points[1]  + "), (" + points[2] + "), (" + points[3] + ")이고, 너비가 " + width + ", 높이가 " + height + "인 사각형을 그린다.");
	}
	
	@Override
	public double getArea() {
		return (double)(width * height);
	}
	
	@Override
	public String toString() {
		return "points=[(" + points[0] + "), (" + points[1] + "), (" + points[2] + "), (" + points[3] + ")], width=" + width + " height=" + height;
	}
}
