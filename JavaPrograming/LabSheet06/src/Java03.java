import javax.swing.JOptionPane;

import Example2.Author;

public class Java03 {
	public static void main(String[] args) {
		Author cometitor;
		String name,email,text = "";
		int loop = 0;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			name = JOptionPane.showInputDialog("Input cometitor name : ");
			email = JOptionPane.showInputDialog("Input cometitor email : ");
			cometitor = new Author(name,email);
			text += i + ")" + cometitor.toString() + "\n";
			loop = JOptionPane.showConfirmDialog(null, "Is there another cometito?","Register",JOptionPane.YES_NO_OPTION);
			if(loop == 1) {
				JOptionPane.showConfirmDialog(null,text);
				break;
			}
		}
	}
}
