import java.util.*;

public class Lab307 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String textInput, textWithoutSpace = "", textReversed = "";
		
		System.out.print("Text : ");
		textInput = input.nextLine();
		
		textWithoutSpace = textInput.replace(" ", "");
		
		for (int i = textWithoutSpace.length() - 1 ; i >= 0; i--) {
            textReversed += textWithoutSpace.charAt(i);  
        }
		
		if (textWithoutSpace.equalsIgnoreCase(textReversed)) {
			System.out.println("This text is palindrome.");
		}else {
			System.out.println("This text is not palindrome.");
		}
		
		input.close();

	}

}
