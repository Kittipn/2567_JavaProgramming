package Labsheet06;

public class LoanCalculator {
	
	private String productName;
	private double productPrice;
	private double interestRate;
	private int years;
	
	public void setLoanDetails(String name, double price, double rate , int year) {
		
		productName = name;
		productPrice = price;
		interestRate = rate;
		years = year;
	}
	
	public double calculateMonthlyPayment() {

		double monthlyRate = interestRate / 12 / 100;
		int totalMonth = years * 12;
		
		double monthlyPayment = (productPrice * monthlyRate * Math.pow(1 + monthlyRate, totalMonth)) /
								(Math.pow(1 + monthlyRate, totalMonth) - 1);
		
		return monthlyPayment;
	}
	
	public void displayLoanDetails() {
		System.out.println("Product Name : " + productName);
		System.out.println("Price : " + productPrice);
		System.out.println("Interest Rate : " + interestRate);
		System.out.println("Loan Period : " + years);
		System.out.printf("Monthly Payment: %.2f%n", calculateMonthlyPayment());
	}

} // end of class
