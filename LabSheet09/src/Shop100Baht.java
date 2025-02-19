package LabSheet09;

import javax.swing.*;

public class Shop100Baht {

	public static void main(String[] args) {
		
		int unit = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number of product"));
		
		int choice = JOptionPane.showConfirmDialog(null, "Is this PattanakarnBranch");
		
		Product sold;
		
		if (choice == 0) {
			sold = new PattanakarnBranch();
		}else {
			sold = new Product();
		}
		
		sold.setUnit(unit);
		
		JOptionPane.showMessageDialog(null, sold);

	}

}
