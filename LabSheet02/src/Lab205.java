import javax.swing.*;
import java.util.*;

public class Lab205 {

	public static void main(String[] args) {

		Random rng = new Random();
		int balance = rng.nextInt(9) * 100000;
		
		int moneyWithdraw = Integer.parseInt(JOptionPane.showInputDialog(null, "Your balance : " + balance + "\n" +
																			   "Enter the amount to withdraw."));
		
		if(moneyWithdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error: Insufficient funds for this withdrawal.",
												"ERROR",
												JOptionPane.ERROR_MESSAGE);
		}
		
		else if(moneyWithdraw % 100 != 0) {
			JOptionPane.showMessageDialog(null, "Error: Amount must be a multiple of 100.",
												"ERROR",
												JOptionPane.ERROR_MESSAGE);	
		}
		
		else if(moneyWithdraw > 20000) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 200000",
												"ERROR",
												JOptionPane.ERROR_MESSAGE);	
		}
		
		else {
			JOptionPane.showMessageDialog(null, "You have withdrawn " + moneyWithdraw + " baht.\n" +
												"1,000 bills = " + (moneyWithdraw/1000) + "\n" +
												"500 bills   = " + (moneyWithdraw%1000/500) + "\n" +
												"100 bills   = " + (moneyWithdraw%1000%500/100));
		}
		
	}

}
