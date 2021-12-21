package exam;

public class TestClass {
	public static void main(String[] args) {
		Point p1 = new Point(2,2);
		Point np = new Point(1,9);
		System.out.println(p1.distance(np));
		Point[] points = {};
		Point minDist = Point.minDist(points);
		System.out.println("X: "+minDist.getX()+" Y: "+minDist.getY());
	}
	
	
}
