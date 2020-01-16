import javax.swing.JOptionPane;
public class Java01 {

	public static void main(String[] args) {
		String mouth[]  = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int m = Integer.parseInt(JOptionPane.showInputDialog(null,"Input the number of mouth [1-12]:"));
		while (m > 12 || m <= 0) {
			m = Integer.parseInt(JOptionPane.showInputDialog(null,"Input the number of mouth 1-12 only:"));
		}
		 JOptionPane.showMessageDialog(null,"The named of month (" + m + ") is "+ mouth[m-1]);
	}
	
}


