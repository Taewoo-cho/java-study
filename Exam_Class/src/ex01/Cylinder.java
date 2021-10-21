package ex01;

public class Cylinder {
	int radious;
	int height;
	public double getVolume() {
		return Math.PI*radious*radious*height;
	}
	public double getArea() {
		return (2*Math.PI*radious*height) + (2*Math.PI*radious*radious);
	}
	
	
}
