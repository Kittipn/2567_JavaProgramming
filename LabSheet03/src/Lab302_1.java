
import javax.swing.*;

public class Lab302_1 {

	public static void main(String[] args) {
		
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail").toLowerCase();
		
		while (true) {
			
			inputEmail = JOptionPane.showInputDialog("Please input your e-mail again").toLowerCase();
		
			if (inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com")) {
			
				JOptionPane.showMessageDialog(null, "Your e-mail is " + inputEmail);
				break;
			
			}else {
			
				JOptionPane.showMessageDialog(null, "Invalid e-mail. (must be hotmail or gmail)");
				continue;
			
			}
		
		}

	}

}
