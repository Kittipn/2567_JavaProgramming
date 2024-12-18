
import java.util.*;

public class Lab403 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String fullName, firstName = "", lastName = "";
		
		System.out.println("Please enter your name, seperated by space");
		System.out.print(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(' ');
		
		firstName = fullName.substring(0,space);
		
		// System.out.println(firstName);
		
		System.out.println(abbreviatedName(fullName) + firstName);
		
		
		input.close();
	}
	
	public static String abbreviatedName(String fName) {
		String initialLetter = "";
		
		for(int i = 0 ; i < fName.length() ; i++) {
			if(fName.charAt(i) == ' ') {
				initialLetter = (initialLetter + fName.charAt(i+1)).toUpperCase();
				initialLetter = initialLetter + ".";
			}
		} // end of for loop
		
		return initialLetter;
		
	} // end of abbreviatedName() method

}
