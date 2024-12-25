import javax.swing.*;

public class Lab501_Method {
	
	static int[] productId = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] productPrice = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	
	static double itemPrice = 0.0;
	static boolean validItem = false;

	public static void main(String[] args) {
		inputItem();
	}
	
	public static void inputItem() {
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to purchase"));
		
		if(checkItem(itemOrder)) {
			JOptionPane.showMessageDialog(null, 
					"Item " + itemOrder + 
					" is $" + itemPrice);
		}else {
			JOptionPane.showMessageDialog(null, 
					"Item not found.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
	} // end of inputItem()
	
	public static boolean checkItem(int item) {
		
		for (int i = 0 ; i < productId.length ; i++) {
			if(item == productId[i]) {
				itemPrice = productPrice[i];
				validItem = true;
			}
		} // end of for loop
		
		return validItem;
	} // end of checkItem();

}
