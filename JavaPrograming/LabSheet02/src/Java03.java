import java.text.DecimalFormat;
import java.util.Scanner; 
public class Java03 {
	
	private static Scanner scan;

	public static void main(String[] args) 
	{
		 DecimalFormat fm = new DecimalFormat("(#)");
		 scan = new Scanner(System.in);
		 System.out.print("Input book id: ");
		 String id = scan.next(); 
		 System.out.print("Input book name: ");
		 String name = scan.next(); 
		 System.out.println(name + fm.format(id));
	}

}
