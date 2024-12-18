import java.util.*;

public class Lab304 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String fullName, firstName = "", lastName = "";
		
		System.out.print("Full name : ");
		fullName = input.nextLine();
		
		if(fullName.contains(" ")) {
			
			firstName = fullName.substring(0,fullName.indexOf(" "));
			lastName = fullName.substring(fullName.indexOf(" ") + 1);
			
			System.out.println("First Name : " + firstName.toUpperCase());
			System.out.println("Last Name : " + lastName.toLowerCase());
			
			
		}else {
			
			System.out.println("Incorrect Name");
			
		}
		
		input.close();
		
	}

}
