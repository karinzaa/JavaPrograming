package Java01;

public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double radius,double height) {
	 super(radius);
	 this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return  getArea() * height;
	}
	public double getArea() {
		return  2 * Math.PI * (height + getRadius());
	}
	public String toString() {
		return "height= " + height+ "," + super.toString();
	}
}
