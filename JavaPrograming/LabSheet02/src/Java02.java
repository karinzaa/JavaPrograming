import java.util.Scanner; 
import java.text.DecimalFormat;
public class Java02 {

	private static Scanner scan;

	public static void main(String[] args) 
	{
		 DecimalFormat fm = new DecimalFormat("#,###.00");
		 scan = new Scanner(System.in);
		 System.out.print("How Many number of product : ");
		 int num = scan.nextInt(); 
		 double sum = (float) num * 100;
		 double vat = (float) num * 7;
		 double vatsum = (float) vat + sum;
		 System.out.println("Total price\t" + fm.format(sum)+ " bath.");
		 System.out.println("Add Vat 7%\t" + fm.format(vat)+ " bath.");
		 System.out.println("Total price\t" + fm.format(vatsum)+ " bath."); 
	}

}
