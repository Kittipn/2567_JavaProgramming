
import javax.swing.*;

public class Lab302 {

	public static void main(String[] args) {
		
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail").toLowerCase();
		
		boolean validateEmail = false;
		
		validateEmail = inputEmail.startsWith("@") || inputEmail.contains(" ");
		
		while (validateEmail) {
			
			inputEmail = JOptionPane.showInputDialog("Please input your e-mail again");
		}
		
		if (inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is " + inputEmail);
		}else {
			JOptionPane.showMessageDialog(null, "Invalid e-mail. (must be hotmail or gmail)");
		}

	}

}
