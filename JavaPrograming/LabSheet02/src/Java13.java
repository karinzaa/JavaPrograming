import javax.swing.JOptionPane;
public class Java13 {

	public static void main(String[] args) 
	{
		  int num;
		  final int vani = 10 , choco = 15 , top = 5 ;
		  int total , check ;
		  String fla = "Chocolate" , _fla = "Vanilla" ; 
		  
		  do {
		    
		   num = Integer.parseInt(JOptionPane.showInputDialog("[1] Vanilla Flavor 10 B." + "\n[2] Chocolate Flavor 15 B." + "\nPress number to choose flavor:"));
		   
		    while( num < 1 || num > 2 ) {
		     JOptionPane.showMessageDialog(null,"ERROR: Wrong choice!" +"\nTry again...","ERROR",JOptionPane.ERROR_MESSAGE);
		     break;
		    }
		   
		 
		  } while ( num < 1 || num > 2 );
		  
		  
		  total = num == 1?  vani : choco ;
		  
		  check = JOptionPane.showConfirmDialog(null ,"Do you want to add topping?" ,"Topping",JOptionPane.YES_NO_OPTION);
		       
		  total = total + (check == 0? top : 0) ;
		  
		  JOptionPane.showMessageDialog(null, "You shoose " + (num == 1 ? _fla : fla) + " Flavor" + "\nAnd " + (check == 0 ? "with " : "no ") + "topping" + "\nTotal price = " + total + " baht.");

	}

}
