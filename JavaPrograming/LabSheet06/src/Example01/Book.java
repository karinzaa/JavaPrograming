package Example01;

public class Book {
	private String title;
	private int unit;
	private double price;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	public int getUnit() {
		return unit;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public double getPrice() {
		 return price;
	}
	
	public double totalPrice() {
		 return unit*price;
	}
	
}
