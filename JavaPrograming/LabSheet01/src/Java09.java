import javax.swing.*;
public class Java09 {

	public static void main(String[] args) 
	{
		int m = 287;
		int h = m/60;
		int m2 = m%60;		
		System.out.print("Parking Time : " + h + " Hour " + m2 + " Minute ");
		double h2 = h * 50,m3 = m2 * 0.75;
		double sum = h2 + m3;
		JOptionPane.showMessageDialog(null, "Amount to pay is " + sum +" bath.","Message", JOptionPane.INFORMATION_MESSAGE);
	}

}
