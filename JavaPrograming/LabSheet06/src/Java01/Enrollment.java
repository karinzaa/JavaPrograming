package Java01;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Enrollment {

	public static void main(String[] args) {
		DecimalFormat fm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		String id,name;
		int credit;
		float total = 0;
		for(int i=0; i<=7; i++) {
		System.out.print("Input Subject Id : ");
	    id = scan.nextLine();
	    if(id.equals("0")) {
	    	break;
	    	}
	    System.out.print("Input Subject Name : ");
	    name = scan.nextLine();
	    System.out.print("Input Subject Credit : ");
	    credit = scan.nextInt();
	    Subject sub = new Subject(id,name,credit);
	    total += sub.totalprice();
	    scan.nextLine();
	    System.out.println(sub.toString()); 
		}
		System.out.println("--------------------------------------");
		System.out.println("Total price of enrollment is " + fm.format(total) + " Bath.");
	}

}
