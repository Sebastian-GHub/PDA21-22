package exam;

public class Point {
	private double y = 0;
	private double x = 0;
	
	public Point(double x, double y) {
		this.y = y;
		this.x = x;
	}
	
	public Point() {
		
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double distance(Point p) {
		double distanceSquared = Math.pow(p.getX()+this.x, 2) + Math.pow(p.getY()+this.y, 2);
		double distance = Math.sqrt(distanceSquared);
		return distance;
	}
	
	public static Point minDist(Point[] points) {
		Point np = new Point(0,0);
		if(points.length==0) {
			return np;
		}
		double minDist = np.distance(points[0]);
		int minIndex = 0;
		for (int i = 0; i<points.length; i++) {
			if (np.distance(points[i])< minDist) {
				minIndex = i;
			}
		}
		return points[minIndex];
	}

}
