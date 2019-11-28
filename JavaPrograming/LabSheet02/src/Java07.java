import java.text.DecimalFormat;
import javax.swing.*;
public class Java07 {

	public static void main(String[] args) 
	{
		String t = "";
		DecimalFormat fm = new DecimalFormat("##.0");
		double w = Float.parseFloat(JOptionPane.showInputDialog(null,"Input Weight:"));
		double h = Float.parseFloat(JOptionPane.showInputDialog(null,"Input Height:"));
		double bmi = w / ((h / 100) * (h / 100));
		if(bmi < 18.5)
		{
			t = "You’re Underweight";
		}
		if(bmi >= 18.5 && bmi <= 24.9)
		{
			t = "You’re Normal-weight";
		}
		if(bmi >= 20.0 && bmi <= 29.9)
		{
			t = "You’re Over-weight";
		}
		if(bmi >= 30.0)
		{
			t = "You’re Obesity";
		}
		JOptionPane.showMessageDialog(null,"BMI = "+ fm.format(bmi) + "\n" + t, "BMI", JOptionPane.WARNING_MESSAGE);
	}

}
