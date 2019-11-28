import java.util.Scanner; 
import java.text.DecimalFormat;
public class Java01 {

	private static Scanner scan;

	public static void main(String[] args) 
	{
		 DecimalFormat fm = new DecimalFormat("##.00");
		 scan = new Scanner(System.in);
		 System.out.print("Input number 1: ");
		 int num1 = scan.nextInt(); 
		 System.out.print("Input number 2: ");
		 int num2 = scan.nextInt(); 
		 System.out.print("Input number 3: ");
		 int num3 = scan.nextInt(); 
		 int sum = num1+num2+num3;
		 double avg = (float)sum / 3;
		 System.out.println("Sum of " + num1 + " , " + num2 + " and " + num3 + " is " + sum);
		 System.out.println("Average " + fm.format(avg)); 
	}

}
