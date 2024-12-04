import java.text.DecimalFormat;
import javax.swing.*;

public class Lab201 {

	public static void main(String[] args) {

		final int BUFFET = 299;
		
		DecimalFormat fm = new DecimalFormat("#.00");
		
		int customer = Integer.parseInt(JOptionPane.showInputDialog(null, "How many cumstomers per bill?"));
		
		double totalPrice = BUFFET * customer;
		
		//  System.out.printf("Total Price is %,.2f baht.",totalPrice);
		
		double discount = 0;
		while(true) {
			int isMember = JOptionPane.showConfirmDialog(null, "Total price is " + fm.format(totalPrice) + " baht.\n" + 
					   "Do you have a member card?");
			
			if(isMember == JOptionPane.YES_OPTION) {
				discount = totalPrice * 0.10;
				break;
			}
			
			if(isMember == JOptionPane.NO_OPTION) {
				discount = 0;
				break;
			}
		}
		
		
		double totalNetPrice = totalPrice - discount;
		
		JOptionPane.showMessageDialog(null, "Amout to be paid " + fm.format(totalNetPrice) + " baht.");
		
	}

}
