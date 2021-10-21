package example2;

public class PointTest {

	public static void main(String[] args) {
		// 객체 생성
		Point p1 = new Point(0,0);
		Point p2 = new Point(3,4);
		
		// 거리 계산
		double dist = Point.distance(p1, p2);
		
		// 결과 출력
		System.out.printf("두 점 A%s, B%s 사이의 거리: %.2f", p1.toStr(), p2.toStr(), dist);
				

	}
}

class Point {
	int x;
	int y;
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	String toStr() {
		return String.format("(%d, %d)", x, y);
	}
	
	static double distance(Point p, Point q) {
		double dX = p.x - q.x;
		double dY = p.y - q.y;
		
		return Math.sqrt((dX*dX) + (dY*dY));
	}
}