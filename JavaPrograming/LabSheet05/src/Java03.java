import java.util.Scanner;
public class Java03 {

	private static Scanner scan;
	
	public static void main(String[] args) {
		 scan = new Scanner(System.in);	 
		 String mouth[]  = {"JAN","FEB","MAR","APR","MAY","JUN",};
		 int mnum[] = new int[mouth.length];
		 for (int i = 0; i < mnum.length; i++) { 
			 System.out.print("Input sale of "+ mouth[i] + ": ");
			 mnum[i] = scan.nextInt();
			 while (mnum[i] < 0) {
			 System.out.print("Input sale of "+ mouth[i] + " again: ");
			 mnum[i] = scan.nextInt();
			 }
		 }
		 System.out.println("Summery of units in 6 months");
		 System.out.println("-----------------------------------------------------");
		 for (int i = 0; i < mouth.length; i++) { 
		 System.out.print(mouth[i] + " | ");
		 for (int y = 0; y < mnum[i]; y++) {
			 System.out.print("*");
		 }
		 System.out.print("("+ mnum[i]+")\n");
			 
		 }
	}

}
