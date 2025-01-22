package Labsheet06;

public class UtilityBillCalculator {
	
	private double electricityUsage;
	private double waterUsage;
	
	public void setUsage(double electricUse, double waterUse) {
		electricityUsage = electricUse;
		waterUsage = waterUse;
	}
	
	public double calculateElectricityBill() {
		
		double electricityBill;
		
		if(electricityUsage <= 50) {
			electricityBill = electricityUsage * 1.50;
		}
		else if(electricityUsage <= 150) {
			electricityBill = electricityUsage * 2.50;
		}
		else{
			electricityBill = electricityUsage * 3.00;
		}
		
		return electricityBill;
		
	} // end of calculateElectricityBill()
	
	public double calculateWaterBill() {
		
		double waterBill;
		
		if(waterUsage <= 30) {
			waterBill = waterUsage * 10;
		}
		else {
			waterBill = waterUsage * 15;
		}
		
		return waterBill;
		
	} // end of calculateWaterBill()
	
	public void displayBillDetails() {
		System.out.println("Electricity Usage : " + electricityUsage + " Units.");
		System.out.println("Electricity Bill : " + calculateElectricityBill() + " THB.");
		System.out.println("Water Usage : " + waterUsage + " Units.");
		System.out.println("Water Bill : " + calculateWaterBill() + " THB.");
		System.out.println("Total Bill : " + (calculateElectricityBill() + calculateWaterBill()) + " THB.");
		System.out.println("--------------------------------------");
	}

}
