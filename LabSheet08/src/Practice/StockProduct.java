package Practice;

import java.util.*;

public class StockProduct {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Create array
		Product[] productList = new Product[4];
		
		for(int i = 0 ; i < productList.length ; i++) {
			
			// Create new Product object
			productList[i] = new Product();
			
			System.out.print("Input product (" + (i+1) + ") Id : ");
			productList[i].setId(scan.nextLine());
			
			System.out.print("Input product (" + (i+1) + ") Unit : ");
			productList[i].setUnit(scan.nextInt());
			
			
			System.out.print("Input product (" + (i+1) + ") Price : ");
			productList[i].setPrice(scan.nextDouble());
			scan.nextLine();
			
			Space();
		}
		
		Space(); 
		
		
		Line();
		
		double allTotalPrice = 0;
		
		for(int i = 0 ; i < productList.length ; i++) {
			
			System.out.print("Product ID : " + productList[i].getId() + ", ");
			System.out.print("Total price : " + productList[i].calculateTotal() + " baht.");
			
			allTotalPrice += productList[i].calculateTotal();
			
			Space();
		}
		
		Line();
		
		System.out.println("Total price of all product " + allTotalPrice + " baht.");
		
		
		
		scan.close();
		
	} // end of main method

	public static void Space() {
		System.out.println();
	}
	
	public static void Line() {
		for(int i = 1 ; i <= 60 ; i++) {
			System.out.print("-");
		}
		Space();
	}
}
