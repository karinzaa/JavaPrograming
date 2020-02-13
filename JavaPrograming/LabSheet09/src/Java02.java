import java.io.*;
import java.util.Scanner;
public class Java02 {

	public static void main(String[] args)throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input section [4 or 5] : ");
		int sec;
		sec = scan.nextInt();
		while(sec != 4 && sec != 5) {
			System.out.print("The section must be 4 or 5 only : ");
			sec = scan.nextInt();
		}
		System.out.println("");
		Scanner read = new Scanner(new File("student.txt"));
		while(read.hasNext()) {
			String id = read.next();
			read.next();
			String fname = read.next();
			String lname = read.next();
			read.next();
			int section = read.nextInt();
			Student Student = new Section(id,fname,lname,section);
			if(Student.getSection() == sec) {
				System.out.println(Student.toString());
			}
			
		}
		read.close();
	}

}
