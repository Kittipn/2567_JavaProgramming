
import java.util.*;

public class SecurePasswordChecker {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String password;
		
		while(true) {
			
			System.out.print("Enter your password (type 'exit' to quit) : ");
			password = scan.nextLine();
			
			if (password.equalsIgnoreCase("exit")) {
				System.out.println("Exitting program..");
				break;
			}
			
			String errors = "";
			
			if(password.length() < 8) {
				errors += "- Password must be at least 8 characters long. \n";
			}
			
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigit = false;
			
			for (int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);
				
				if(ch >= 'A' && ch <= 'Z') {
					hasUpperCase = true;
				}else if (ch >= 'a' && ch <= 'z') {
					hasLowerCase = true;
				}else if (ch >= '0' && ch <= '9') {
					hasDigit = true;
				}
			}
			
			if(!hasUpperCase) {
				errors += "- Password must contain at least one uppercase letter. \n";
			}
			
			if(!hasLowerCase) {
				errors += "- Password must contain at least one lowercase letter. \n";
			}
			
			if(!hasDigit) {
				errors += "- Password must contain at least one digit of number \n";
			}
			
			System.out.println();
			
			if(errors.isEmpty()) {
				System.out.println("Your password is secure.");
				break;
			}else {
				System.out.println("Password validation errors : \n" + errors);
			}
			
		} // end of while

	}

}
