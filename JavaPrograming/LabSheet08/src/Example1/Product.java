package Example1;

public class Product {

	private int unit;

	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	public int getUnit() {
		return unit;
	}
	
	public int totalprice() {
		return unit * 100;
	}
	
	public String toString() {
		return "You buy " + unit + " units";
	}
	
}
