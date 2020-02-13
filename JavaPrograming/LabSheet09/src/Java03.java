import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Java03 {

	public static void main(String[] args) throws IOException{
		String[] grade = {"A","B+","B","B","C+","C","D+","D","F"};
		for (int i = 0;i < grade.length;i++) {
			if(getStudent(grade[i]) > 0) {
				System.out.println("----------------------------------------------------------");
				System.out.println("List of student get grade "+ grade[i] + "(" + getStudent(grade[i]) + " student)");
				System.out.println("----------------------------------------------------------");
				System.out.print(getStudentGrade(grade[i]));
			}
		}
	}
	public static String getStudentGrade(String Grade) throws IOException{
		Scanner read = new Scanner(new File("student.txt"));
		String temp = "";
		while(read.hasNext()) {
			String id = read.next();
			read.next();
			String fname = read.next();
			String lname = read.next();
			double grade = read.nextDouble();
			read.next();
			Grade student = new Grade(id,fname,lname,grade);
			if(student.getStringGrade().equals(Grade)) {
			temp += student.toString() + "\n";
			}
	   }
		read.close();
		return temp + "\n";
	}
	public static int getStudent(String Grade) throws IOException{
		Scanner read = new Scanner(new File("student.txt"));
		int num = 0;
		while(read.hasNext()) {
			String id = read.next();
			read.next();
			String fname = read.next();
			String lname = read.next();
			double grade = read.nextDouble();
			read.next();
			Grade student = new Grade(id,fname,lname,grade);
			if(student.getStringGrade().equals(Grade)) {
				num++;
			}
	   }
		read.close();
		return num;
	}
}
