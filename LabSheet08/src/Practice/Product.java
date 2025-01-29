package Practice;

public class Product {
	
	private String productId;
	private int productUnit;
	private double productPrice;
	
	// Setter and Getter
	public void setId(String id) {
		productId = id;
	}
	
	public String getId() {
		return productId;
	}

	public void setUnit(int unit) {
		productUnit = unit;
	}
	
	public int getUnit() {
		return productUnit;
	}
	
	public void setPrice(double price) {
		productPrice = price;
	}
	
	public double getPrice() {
		return productPrice;
	}
	
	public double calculateTotal() {
		return productPrice * productUnit;
	}
}
