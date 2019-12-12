import javax.swing.*;
import java.text.DecimalFormat;
public class Java04 {
	
	
    public static double findBMI(double weight, double height) 
    {
		return (weight/(Math.pow((height/100),2)));
		
	}
    public static String findResult(double  bmi)
    {
    	if(bmi < 18.5)
    		return "Underweight";
		if(bmi >= 18.5 && bmi <= 24.9)
			return "Normal Weight";
		if(bmi >= 25.0 && bmi <= 29.9)
			return "Overweight";

			return "Obesity";
	}
    
	public static void main(String[] args) 
	{
		double bmi;
		DecimalFormat fm = new DecimalFormat("##.0");
		double height = Float.parseFloat(JOptionPane.showInputDialog(null,"Input Height:"));
		double weight = Float.parseFloat(JOptionPane.showInputDialog(null,"Input Weight:"));
		bmi = findBMI(weight,height);
		JOptionPane.showMessageDialog(null,"BMI = "+ fm.format(findBMI(weight, height)) + "\n Result = " + findResult(bmi), "BMI", JOptionPane.INFORMATION_MESSAGE);
	}

}
