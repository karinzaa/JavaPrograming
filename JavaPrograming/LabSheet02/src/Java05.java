import java.text.DecimalFormat;
import javax.swing.*;
public class Java05 {

	public static void main(String[] args) 
	{
		DecimalFormat fm = new DecimalFormat("##.00");
		float r = Float.parseFloat(JOptionPane.showInputDialog(null,"Input Radius:"));
        float area = (float)(Math.PI * (r * r));
        float cir = (float)(2 * (Math.PI )* r);
        JOptionPane.showMessageDialog(null,"Radius = "+ fm.format(r) + "\nArea = "+ fm.format(area) +"\nCirumfernce = "+ fm.format(cir));
	}

}
