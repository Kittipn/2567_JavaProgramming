import javax.swing.*;

public class Lab501 {

	public static void main(String[] args) {
		
		int[] productId = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] productPrice = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
		
		double itemPrice = 0.0;
		boolean validItem = false;
		
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to purchase"));
		
		for (int i = 0 ; i < productId.length ; i++) {
			if(itemOrder == productId[i]) {
				itemPrice = productPrice[i];
				validItem = true;
			}
		} // end of for loop
		
		if(validItem) {
			JOptionPane.showMessageDialog(null, 
					"Item " + itemOrder + 
					" is $" + itemPrice);
		}else {
			JOptionPane.showMessageDialog(null, 
					"Item not found.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}
