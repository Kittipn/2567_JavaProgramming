
import java.util.*;

public class TestProduct {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Product product1 = new Product();
		Product product2 = new Product();
		
		// set product1 details
		product1.setProductDetials("SmartPhone", 30000.0, 7.0);
		// display product1 details
		System.out.println("Product 1 Details");
		Line('-');
		product1.displayProductDetails();
		System.out.println();
		
		// input product2 details
		System.out.print("Enter product name : ");
		String product2Name = input.nextLine();
		System.out.print("Enter product price : ");
		double product2Price = input.nextDouble();
		System.out.print("Enter VAT rate (%) : ");
		double product2VAT = input.nextDouble();
		
		// set product2 details
		product2.setProductDetials(product2Name, product2Price, product2VAT);
		// display product2 details
		System.out.println("Product 2 Details");
		Line('-');
		product2.displayProductDetails();
		System.out.println();
		
	}
	
	public static void Line(char symbol) {
		// System.out.println("---------------------------");
		for(int i=1 ; i<40 ; i++) {
			System.out.print(symbol);
		}
		System.out.println();
	}

}
