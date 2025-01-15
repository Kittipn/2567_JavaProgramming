
import java.util.*;

public class TestEmployeeInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// create two employee objects
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
	
		//set employee 1 details
		System.out.println("Enter details for employee 1 ");
		
		System.out.print("Name : ");
		String emp1Name = scan.nextLine();
		
		System.out.print("Hour worked : ");
		int emp1HourWorked = scan.nextInt();
		
		System.out.print("Hourly wage : ");
		double emp1Hourlywage = scan.nextDouble();
		
		emp1.setEmployeeDetails(emp1Name, emp1HourWorked, emp1Hourlywage);
		
		Line('-');
		System.out.println();
		
		//display employee 1 details
		System.out.println("Employee 1 Details");
		emp1.displayEmployeeDetails();
		
		Line('*');
		scan.nextLine();
		System.out.println();
		
		System.out.println();
		//set employee 2 details
		System.out.println("Enter details for employee 2 ");
		
		System.out.print("Name : ");
		String emp2Name = scan.nextLine();
		
		System.out.print("Hour worked : ");
		int emp2HourWorked = scan.nextInt();
		
		System.out.print("Hourly wage : ");
		double emp2Hourlywage = scan.nextDouble();
		
		emp2.setEmployeeDetails(emp2Name, emp2HourWorked, emp2Hourlywage);
		
		Line('-');

		//display employee 2 details
		System.out.println("Employee 2 Details");
		emp2.displayEmployeeDetails();
		
		Line('*');
		
		scan.close();
		
	} // end of main method
	
	public static void Line(char symbol) {
		// System.out.println("---------------------------");
		for(int i=1 ; i<40 ; i++) {
			System.out.print(symbol);
		}
	}

}
