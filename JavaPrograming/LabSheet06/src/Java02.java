import java.util.Scanner;
import Example01.Book;

import java.text.DecimalFormat;
public class Java02 {

	public static void main(String[] args) {
		DecimalFormat fm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		System.out.print("How many book to order in stock : ");
		Book[] book = new Book[scan.nextInt()];
		for(int i=0; i<book.length; i++) {
			book[i] = new Book();
			scan.nextLine();
			System.out.println();
			System.out.print("Input book title : ");
			book[i].setTitle(scan.nextLine());
			System.out.print("Input book unit : ");
			book[i].setUnit(scan.nextInt());
			System.out.print("Input book price : ");
			book[i].setPrice(scan.nextDouble());
		}
		double total = 0;
		int i = 1;
		System.out.println();
		for(Book boo:book) {
			total += boo.totalPrice();
			System.out.println( i + " : " + boo.getTitle()); 
			i++;
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Total price of "+ book.length +" book is " + fm.format(total) + " Bath.");
	}


}
