import java.io.*;
import java.util.Scanner;
public class Java01 {

	public static void main(String[] args)throws IOException {
		Scanner read = new Scanner(new File("student.txt"));
		System.out.println("----------------------------------------------------------");
		System.out.println("The list of student in section 4");
		System.out.println("----------------------------------------------------------");
		int i = 1;
		while(read.hasNext()) {
			String id = read.next();
			read.next();
			String fname = read.next();
			String lname = read.next();
			read.next();
			int sec = read.nextInt();
			if(sec == 4) {
				System.out.println(i+ "." + " " +id + " " + fname+ " " + lname);
				i++;
			}
			
		}
		read.close();
		read = new Scanner(new File("student.txt"));
		System.out.println("----------------------------------------------------------");
		System.out.println("The list of student in section 5");
		System.out.println("----------------------------------------------------------");
		i = 1;
		while(read.hasNext()) {
			String id = read.next();
			read.next();
			String fname = read.next();
			String lname = read.next();
			read.next();
			int sec = read.nextInt();
			if(sec == 5) {
				System.out.println(i+ "." + " " +id + " " + fname+ " " + lname);
				i++;
			}
			
		}
		
		read.close();
	}
	

}
