import javax.swing.*;
public class Java08 {

	public static void main(String[] args) 
	{
		int h = 157;
		double  w = 45.5;
		double h2 = ((double)h/100)*((double)h/100);
		double bmi = w / h2;
		String bmi2 = Double.toString(bmi);
		JOptionPane.showMessageDialog(null, "Height=" + h +" cm."+"\nWeight=" + w +" kg."+"\nBMI=" + bmi2.substring(0,9), "BMI", JOptionPane.WARNING_MESSAGE);
	}

}
