
public class TestEmployees {

	public static void main(String[] args) {
		// create two employee objects
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
	
		//set employee details
		emp1.setEmployeeDetails("Natcha", 45, 20.0);
		emp2.setEmployeeDetails("Attakorn", 38, 25.0);
		
		//display employee details
		System.out.println("Employee 1 Details");
		emp1.displayEmployeeDetails();
		
		System.out.println();
		
		System.out.println("Employee 2 Details");
		emp2.displayEmployeeDetails();
	}

}
