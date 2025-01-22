
public class TestCar {

	public static void main(String[] args) {
		
		Car car = new Car("Chevroloet", "Cruze", 2009, 150000.0);
		
		// Display default constructor
		car.Showdata();
		Space();
		
		// Update data
		car.setCompanyName("Toyota");
		car.setModelName("Corolla");
		car.setYear(2015);
		
		// Display updated data
		car.Showdata();
		Space();
		
		// Test invalid input
		car.setCompanyName(null);
		car.setModelName(null);
		car.setYear(1200);
		

	}
	
	public static void Space() {
		System.out.println();
	}

}
