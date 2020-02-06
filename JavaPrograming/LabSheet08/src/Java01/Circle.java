package Java01;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		
	}	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getRadius() {
		return radius;
	}
	public String toString() {
		return "radius= " + radius;
	}
}
