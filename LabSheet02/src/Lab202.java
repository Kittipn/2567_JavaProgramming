import java.util.*;

public class Lab202 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        
		int previousNum = 0;
        
		while (true) {
            System.out.print("Input number: ");
            int num = input.nextInt();
            
            if (num < previousNum) {
                break; 
            }
            
            previousNum = num; 
        }
        
        input.close();
        System.out.println("Loop exited.");

	}

}
