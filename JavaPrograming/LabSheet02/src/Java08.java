import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.*;
public class Java08 {

	public static void main(String[] args) 
	{
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		int w = Integer.parseInt(JOptionPane.showInputDialog("Your balance : " + frm.format(balance) + "\nInput money yo withdraw"));
		if (w > balance) 
		{
			JOptionPane.showMessageDialog(null,"Error:Cannot withdraw more balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		if (w  > 20000 ) 
		{
			JOptionPane.showMessageDialog(null,"Error:Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);	
		}
		if (w  % 100 != 0) 
		{
			JOptionPane.showMessageDialog(null,"Error:Cannot withdraw " + (w % 100) + " baht.","ERROR",JOptionPane.ERROR_MESSAGE);	
		}
		
		int th = w / 1000;
		int fhun = (w % 1000) / 500;
		int hun = (w % 500) / 100;
		
		JOptionPane.showMessageDialog(null,"You withdraw " + frm.format(w) + " baht." + "\n1000 = " + th +  "\n500 = " + fhun + "\n100 = " + hun);
	}

}
