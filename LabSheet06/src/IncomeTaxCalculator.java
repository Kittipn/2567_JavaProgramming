package Labsheet06;

public class IncomeTaxCalculator {
	
	private double income;
	
	public void setIncome(double Income) {
		income = Income;
	}
	
	public double calculateTax() {
		
		double tax;
		double incomeRemain15k = 0;
		double incomeRemain30k = 0;
		double incomeRemain50k = 0;
		
		if(income < 150000) {
			tax = 0;
		}
		else if(income < 300000) {
			incomeRemain15k =  income - 150000;
			tax = incomeRemain15k * 0.05;
		}
		else if(income < 500000) {
			incomeRemain15k = 150000; // 300000 - 150000
			incomeRemain30k = income - 300000;
			tax = (incomeRemain15k * 0.05) + (incomeRemain30k * 0.10);
		}
		else {
			incomeRemain15k = 150000;
			incomeRemain30k = 200000;
			incomeRemain50k = income - 500000;
			tax = (incomeRemain15k * 0.05) + (incomeRemain30k * 0.10) + (incomeRemain50k * 0.20);
		}
		
		return tax;
		
	} // end of calculateTax()
	
	public void displayTaxDetails() {
		System.out.println("Income : " + income);
		System.out.println("Tax : " + calculateTax());
	}

}
