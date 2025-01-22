package Labsheet06;

public class TestIncomeTaxCalculator {

	public static void main(String[] args) {
		
		IncomeTaxCalculator calculateTax = new IncomeTaxCalculator();
		
		calculateTax.setIncome(450000);
		
		calculateTax.displayTaxDetails();

	}

}
