package StudentInfo;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class StudentDemo3 {

	public static void main(String[] args) {
		String id = "" ,name = "";
		int num = 0, score = 0; 
		Scanner scan = new Scanner(System.in);
		System.out.print("How many enrollment: ");
		num = scan.nextInt();
		ITStudent[] std = new ITStudent[num];
		int[] it = new int[num];
		for(int i=0; i < it.length; i++){
			scan.nextLine();
			System.out.println();
			System.out.print("Input subject id : ");
			id = scan.nextLine();
			System.out.print("Input subject name : ");
			name = scan.nextLine();
			System.out.print("Input exam score : ");
			score = scan.nextInt();
			std[i] = new ITStudent("","",new Subject(id,name),score);
			System.out.println("----------------------------------------------------");
		}
		System.out.println();
		boolean A= false,B= false,C= false,D= false,E= false,F= false;
		for(ITStudent stds : std) {
			if(stds.getGrade().equals("A")) {
				A = true;
			}
			if(stds.getGrade().equals("B")) {
				B = true;
			}
			if(stds.getGrade().equals("C")) {
				C = true;
			}
			if(stds.getGrade().equals("D")) {
				D = true;
			}
			if(stds.getGrade().equals("F")) {
				F = true;
			}
		}
		if(A) {
			System.out.println("Courses that have been grade A");
		for(ITStudent stds : std) {
			
			if(stds.getGrade().equals("A")) {
				
				System.out.println(">> " + id +" "+ name);
						}
				}
			
		}
		if(B) {
			System.out.println("Courses that have been grade B");
			for(ITStudent stds : std) {
			
				if(stds.getGrade().equals("B")) {
					
					System.out.println(">> " + id +" "+ name);
							}
					}
				
			}
		if(C) {
			System.out.println("Courses that have been grade C");
			for(ITStudent stds : std) {
				
				
				if(stds.getGrade().equals("C")) {
					
					System.out.println(">> " + id +" "+ name);
							}
					}
				
			}
		if(D) {
			System.out.println("Courses that have been grade D");
			for(ITStudent stds : std) {
				
				
				if(stds.getGrade().equals("D")) {
					
					System.out.println(">> " + id +" "+ name);
							}
					}
				
			}
		if(F) {
			System.out.println("Courses that have been grade F");
			for(ITStudent stds : std) {
				
				if(stds.getGrade().equals("F")) {
					
					System.out.println(">> " + getsub +" "+ name);
							}
					}
				
			}
	}


}
