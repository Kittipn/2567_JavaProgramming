package LabSheet05;

import javax.swing.*;

public class Lab506 {

	public static void main(String[] args) {
		
		String[] period = {"Morning" , "Afternoon" , "Evening" , "Night"};
		
		String message = "";
		
		for (String time : period) {
			
			message += "Good " + time + " \n";
			
		}
		
		JOptionPane.showMessageDialog(null, message);

	}

}
