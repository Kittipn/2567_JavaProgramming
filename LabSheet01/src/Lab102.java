import java.util.*;
public class Lab102 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input the number of minutes : ");
		int minutes = scan.nextInt();
		
		int year = minutes / 525600;
		
		int day = minutes % 525600 / 1440;
		
		System.out.println(minutes + " minutes is approximately " + year +" years and " + day + " days");
		
		scan.close();

	}

}
