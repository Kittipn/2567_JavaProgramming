
public class Product {
	
	private String productName;
	private double productPrice;
	private double vatRate;
	
	public void setProductDetials(String name, double price, double vat) {
		productName = name;
		productPrice = price;
		vatRate = vat;
	}
	
	public double calculateTotalPrice() {
		double totalVat = productPrice * vatRate/100;
		return productPrice + totalVat;
	}
	
	public void displayProductDetails() {
		
		System.out.println("Product Name : " + productName);
		System.out.println("Price (before vat)  : " + productPrice);
		System.out.println("Price (after vat)  : " + calculateTotalPrice());
		
	}

}
