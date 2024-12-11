
import javax.swing.*;

public class IceCream {

	public static void main(String[] args) {
		
		final int VANILLA = 10, CHOCOLATE = 15, TOPPING = 5;
		
		int choice = Integer.parseInt(JOptionPane.showInputDialog(null,
				"[1] Vanilla Flavor 10 B. \n" + 
				"[2] Chocolate Flavor 15 B. \n" +
				"Press number to choose flavor"));
		
		while(choice != 1 && choice != 2) {
			
			JOptionPane.showMessageDialog(null, 
					"ERROR: Invalid Choice! \nTry again",
					"ERROR",
					JOptionPane.WARNING_MESSAGE);
			
			choice = Integer.parseInt(JOptionPane.showInputDialog(null,
					"[1] Vanilla Flavor 10 B. \n" + 
					"[2] Chocolate Flavor 15 B. \n" +
					"Press number to choose flavor"));
		}
		
		String iceCream = (choice == 1)? "Vanilla Flavor" : "Chocolate Flavor";
		
		int price = (choice == 1)? VANILLA : CHOCOLATE;
		
		
		int toppingChoice = JOptionPane.showConfirmDialog(null, 
				"Do you want to add topping?",
				"Choose an option",
				JOptionPane.YES_NO_OPTION);
		
		String toppingAdd = (toppingChoice == JOptionPane.YES_OPTION)? "topping added" : "no topping";
		price = (toppingChoice == JOptionPane.YES_OPTION)? price + TOPPING : price;
		
		JOptionPane.showMessageDialog(null,
				"You Choose " + iceCream + "\n" +
				"With " + toppingAdd + "\n" +
				"Total Price = " + price + " baht.");
		
	}
}
