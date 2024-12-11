
import java.util.*;

public class Lab301 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String word;
		String textConcate = "";
		
		while(true) {
			
			System.out.print("Enter word : ");
			word = input.nextLine();
			
			if (word.equalsIgnoreCase("stop")) {
				break;
			}
			
			textConcate += word + " ";
			
		}
		
		System.out.println(textConcate.toUpperCase());
		
		input.close();
		
	}

}
