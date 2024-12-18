import java.util.*;

public class Lab305 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a sentence : ");
		String sentence = scan.nextLine();
		
		while (!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = scan.nextLine();		
		}
		
		String word = "";
		int lastSpaceIndex = -1;
		
		for (int i = 0 ; i < sentence.length() ; i++) {
			
			if (sentence.charAt(i) == ' ' || sentence.charAt(i) == '.') {
				word = sentence.substring(lastSpaceIndex + 1,i+1);
				
				System.out.println(word);
				
				lastSpaceIndex = i;
			}
			
		} // end of for loop
		
		scan.close();
	}

}
