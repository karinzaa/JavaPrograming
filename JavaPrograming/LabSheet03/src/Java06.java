import javax.swing.JOptionPane;

public class Java06 {

	public static void main(String[] args) {
		String Id;
		do {
			Id = JOptionPane.showInputDialog("Input student Id:");
			
			while(checkId(Id) == false || checkMajor(Id) == false ) {
				Id = JOptionPane.showInputDialog("Wrong! Input Id,again:");
			}
			
			
		
		}while(checkId (Id) == false);
		
		JOptionPane.showMessageDialog(null, "Student Id : " + Id + "\nStudy in : " + findMajor(Id));
		
	}
	
	public static boolean checkId(String Id) {
			
		if ( Id.length() != 10) 
			return false;
		
		for (int i = 0 ; i < Id.length(); i++) {
			char digit = Id.charAt(i);
			if (Character.isDigit(digit) == false)
				return false;
		}
		
		return true;
	}
	
	public static boolean checkMajor(String Id) {

        if (Id.substring(2, 5).equals("131") == true || Id.substring(2, 5).equals("131") == true || Id.substring(2, 5).equals("131") == true) 
            return true;
        
        return false;
    }
	
	public static String findMajor(String Id) {
        if (Id.substring(2, 5).equals("131") == true) 
            return "Information Technology";
        
        if (Id.substring(2, 5).equals("132") == true) 
            return "Multimedia Technology";
        
        if (Id.substring(2, 5).equals("133") == true) 
            return "Business Technology";
        
        if (Id.substring(2, 5).equals("134") == true)
        	return "Digital & Communication";
        
        return null;
    }
}
