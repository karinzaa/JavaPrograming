package Java02;

import java.util.Scanner;

public class TestFiction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			String title;
			int publicYear;
			System.out.println("INPUT BOOK INFORMATION");
			System.out.println("-------------------------------------------");
			System.out.print("Input book title : ");
			title = scan.nextLine();
			System.out.print("Input book year : ");
			publicYear = scan.nextInt();
			FictionBook book = new FictionBook(title,publicYear);
			System.out.println();
			System.out.println("INPUT AUTHOR INFORMATION");
			System.out.println("-------------------------------------------");
			System.out.print("Input author name : ");
			scan.nextLine();
			book.setAuthorName(scan.nextLine());
			while(!book.checkFormatName()) {
				System.out.print("Input author name ,again : ");
				book.setAuthorName(scan.nextLine());
			}
			System.out.println();
			System.out.print("Input author email : ");
			book.setEmail(scan.nextLine());
			while(!book.checkEmail()) {
				System.out.print("Input author email again : ");
				book.setEmail(scan.nextLine());
			}
			System.out.println();
			System.out.println(book);
			scan.close();
	}

}
