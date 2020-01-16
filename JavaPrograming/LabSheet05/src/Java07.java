import java.util.Scanner;
public class Java07 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);	 
		 int nums[]= new int[7];
		 int temp = 0;
		 for (int i = 0; i < nums.length; i++) { 
			 System.out.print("Input numbert "+ (i+1) + ": ");
			 nums[i] = scan.nextInt();
			 }
		 System.out.print("All number in Ascending : ");
		 for (int i = 0; i < nums.length; i++) {   
	            for (int j = i+1; j < nums.length; j++) {   
	               if(nums[i] > nums[j]) {  
	                   temp = nums[i];  
	                   nums[i] = nums[j];  
	                   nums[j] = temp;  
	               }   
	            }   
	           
		 }
		 for (int i = 0; i < nums.length; i++) 
         {
           System.out.print(nums[i] + " ");
         }
		 System.out.print("\nAll number in Descending: ");
		 for (int i = nums.length-1;nums[i] >= 0; i--) 
         {
           System.out.print(nums[i] + " ");
         }
	  }
	}
