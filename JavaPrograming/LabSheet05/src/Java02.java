import java.util.Scanner; 
public class Java02 {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		 scan = new Scanner(System.in);	 
		 System.out.print("How many number to input :  ");
		 int num = scan.nextInt();
		 int input[] = new int[num];
		 for (int i = 0; i < num; i++) { 
			 System.out.print("Input number "+ (i + 1) + ": ");
			 input[i] = scan.nextInt();
		 }
		 System.out.print("Reverse number in array :  ");
		 for (int y = input.length - 1; y>= 0; y--) {  
	            System.out.print(input[y] + " ");  
	        }  
	}

}
