package Labsheet06;

import java.util.Scanner;

public class TestUtilityBillCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		UtilityBillCalculator UtilityUsage = new UtilityBillCalculator();

		// UtilityUsage.setUsage(200, 40);
		
		System.out.print("Enter electricity usage (units) : ");
		double electricUsage = scan.nextDouble();
		
		System.out.print("Enter water usage (units) : ");
		double waterUsage = scan.nextDouble();
		
		UtilityUsage.setUsage(electricUsage, waterUsage);
		
		System.out.println();
		
		UtilityUsage.displayBillDetails();
		
		scan.close();
	}

}
