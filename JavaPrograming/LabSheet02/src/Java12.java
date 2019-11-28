import javax.swing.*;
public class Java12 {

	public static void main(String[] args) 
	{
		int r = 0;
		while (r == 0) 
		{
			int number = Integer.parseInt(JOptionPane.showInputDialog("Input a number [1-500]:"));
			
			while (number < 1 || number >500) 
			{
					number = Integer.parseInt(JOptionPane.showInputDialog("Input a number,again:"));
			}
			
			JOptionPane.showMessageDialog(null, number + " is " + (number % 2 == 0? "Even" : "Odd") + " Number.");
			
			r = JOptionPane.showConfirmDialog(null, "Do yoy want to input agian?","Even or Odd",JOptionPane.YES_NO_OPTION);
				 
		}
	}

}
