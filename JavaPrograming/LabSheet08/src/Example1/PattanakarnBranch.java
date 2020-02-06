
package Example1;

public class PattanakarnBranch extends Product {

	public int payUnit() {
		return (int)Math.round(getUnit() / 2.0);
	}
	
	public int freeUnit() {
		return getUnit() - payUnit();
	}
	
	@Override
	public int totalprice() {
		return payUnit() * 100;
	}
	
	@Override
	public String toString() {
		return "You buy " + payUnit() + " Get " + freeUnit();
	}
	
}
