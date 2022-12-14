package sh.java.inheritance.shape;

public class ShapeMain {

	public static void main(String[] args) {

//		Circle c1 = new Circle();
//		c1.setCenter(new Point(50, 50));
//		c1.setR(30);
//		Circle c2 = new Circle(new Point(100,100), 50);
//		
//		c1.draw(); // 중심점이 (50,50)이고, 반지름이 30인 원을 그린다...
//		c2.draw(); // 중심점이 (100,100)이고, 반지름이 50인 원을 그린다...
//		
//		
//		// 반지름 * 반지름 * Math.PI
//		System.out.println("원의 넓이 : " + c1.getArea());
//		System.out.println("원의 넓이 : " + c2.getArea());
//		
//		// 중심점
//		System.out.println("c1의 중심점은 (" + c1.getCenter().getX() + ", " + c1.getCenter().getY() + ")입니다.");
//		System.out.println("c1의 중심점은 " + c1.getCenter().toString() + "입니다.");
		
		Point[] points = {new Point(0,0), new Point(200,0), new Point(200,100), new Point(0,100)};
        Rectangle rect = new Rectangle(points);
        rect.draw();
        System.out.println("사각형의 너비는 "+rect.getArea()+"입니다.");
        System.out.println(rect);

        //아래 생성자도 동일하게 처리되어야 한다.
        Rectangle rect2 = new Rectangle(new Point(0,0), 200, 100);
        rect2.draw();
        System.out.println("사각형의 너비는 "+rect2.getArea()+"입니다.");
        System.out.println(rect2);
        Rectangle rect3 = new Rectangle(new Point(0,0), new Point(200,100));
        rect3.draw();
        System.out.println("사각형의 너비는 "+rect3.getArea()+"입니다.");
        System.out.println(rect3);
	}
}
