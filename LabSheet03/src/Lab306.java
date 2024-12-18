import java.util.*;

public class Lab306 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a message : ");
		String message = input.nextLine();
		
		int nichiCount = 0;
		
		if (message.toLowerCase().indexOf("nichi") >= 0) {
			
			nichiCount++;
			
		}
		
		if (nichiCount > 0) {
			
			System.out.println("This message has the word 'nichi'.");
			
		}else {
			
			System.out.println(message);
		}
		
		input.close();

	}

}
