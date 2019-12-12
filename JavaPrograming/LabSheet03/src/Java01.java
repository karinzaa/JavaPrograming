import java.util.Scanner; 
public class Java01 {

	private static Scanner scan;
	
	public static void main(String[] args){
		 scan = new Scanner(System.in);	 
		 String hmail = "@hotmail.com", gmail = "@gmail.com";
			 System.out.print("Input your e-mail :  ");
			 String email = scan.nextLine();
			 email = email.toLowerCase();
				 do {
						System.out.print("Input your e-mail : ");
						email = scan.nextLine();
						email = email.toLowerCase();
						if (email.endsWith(hmail) || email.endsWith(gmail)) {
							
							if(!email.startsWith("@")) {
								
								if(!email.contains(" "))
									break;
							}
						}
					}while(true);
					System.out.println();
				 System.out.print("Your e-mail is " + email);
	 
			 
			

	}

}
