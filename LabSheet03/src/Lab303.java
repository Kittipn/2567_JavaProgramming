
import java.util.*;

public class Lab303 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String sentence;
		
		System.out.print("Enter a sentence : ");
		sentence = input.nextLine();
		
		if (!sentence.endsWith(".")) {
			System.out.print("Enter a sentence , again (must ends with '.' : ");
			sentence = input.nextLine();
		}
		
		int spaceCount = 0;
		int wordCount = 0;
		
		for (int i = 0; i < sentence.length(); i++) {
		    if (sentence.charAt(i) == ' ') {
		        spaceCount++;
		    }
		}
		
		wordCount = spaceCount + 1;
		
		

		System.out.println("This sentence has " + spaceCount + " spaces.");
        System.out.println("This sentence has " + wordCount + " words.");
	}

}
