
package Example1;

import javax.swing.JOptionPane;

public class ShopPattanakarn {

	public static void main(String[] args) {
		
		Product cust = new PattanakarnBranch();

		cust.setUnit(Integer.parseInt(
					 JOptionPane.showInputDialog(
					 "Input the number of product")));
		
		if (cust.getUnit() % 2 != 0) {
			int more = JOptionPane.showConfirmDialog(null, 
					   "Do you want to add one more?",
					   "Warning", JOptionPane.YES_NO_OPTION);
			if (more == 0) {
				cust.setUnit(cust.getUnit() + 1);
			}
		}
		
		JOptionPane.showMessageDialog(null, 
				     cust + 
				 	 "\nTotal price is " + cust.totalprice() 
				 	 + " baht.");

	}

}
