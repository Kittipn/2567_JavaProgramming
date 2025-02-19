package LabSheet09;

public class PattanakarnBranch extends Product {
	
	public int payUnit() {
		return super.getUnit();
	}
	
	public int freeUnit() {
		return super.getUnit();
	}
	
	public int totalPrice() {
		return super.getTotalPrice();
	}
	
	public String toString() {
		return "You buy " + payUnit() + " units. get free " + freeUnit() + " units (" + getTotalPrice() + ")";
	}

}
