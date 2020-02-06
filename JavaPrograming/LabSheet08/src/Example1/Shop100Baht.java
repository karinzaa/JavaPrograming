package Example1;

import javax.swing.JOptionPane;

public class Shop100Baht {

	public static void main(String[] args) {

		Product cust = new Product();

		cust.setUnit(Integer.parseInt(
					 JOptionPane.showInputDialog(
					 "Input the number of product")));
		
		JOptionPane.showMessageDialog(null, cust + 
				 	 "\nTotal price is " + cust.totalprice() 
				 	 + " baht.");

	}

}
