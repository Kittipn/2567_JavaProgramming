import javax.swing.*;

public class Lab401 {

	// main method
	public static void main(String[] args) {
		
		inputEmail();
		
	} // end of main method
	
	public static void inputEmail() {
		String ans;
		String varEmail;
		
		do {
			
			varEmail = JOptionPane.showInputDialog("Enter your e-mail");
			if(varEmail != null && !varEmail.isEmpty()) {
				checkEmailError(varEmail);
			}else {
				JOptionPane.showMessageDialog(null, "E-mail cannot be empty");
			}
			
			ans = JOptionPane.showInputDialog("Do you want to input email address? [Y/y]");
			
		}while(ans != null && ans.equalsIgnoreCase("y"));
	} //end of inputEmail() method
	
	public static void checkEmailError(String email) {
		while(email.startsWith("@") || email.contains(" ")) {
			email = JOptionPane.showInputDialog("Invalid e-mail. Enter your e-mail again.");
		}
		
		email = email.toLowerCase();
		
		JOptionPane.showMessageDialog(null, 
				checkEmail(email)
				? "Your e-email is " + email
				: "Invalid e-mail. must be hotmail or gmail");
		
	} // end of checkEmailError() method
	
	public static boolean checkEmail (String email) {
		
		return email.endsWith("@gmail.com") || email.endsWith("@hotmail.com");
		
	}

}
