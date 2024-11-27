import javax.swing.*;
public class JavaExample02 {

	public static void main(String[] args) {
		String productName = JOptionPane.showInputDialog("Input Product Name");
		
		String strProductUnit = JOptionPane.showInputDialog("Input product Unit");
		int productUnit = Integer.parseInt(strProductUnit);
		
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per Unit"));
		
		double totalPrice = productUnit * productPrice;
		
		double totalWithVat = totalPrice + (totalPrice*7/100);
		
		JOptionPane.showMessageDialog(null, 
				"Total Price is " + totalPrice + " baht. \n" +
				"Add VAT 7% is " + totalWithVat + " baht.");

	}

}
