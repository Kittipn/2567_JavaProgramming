import javax.swing.*;

public class Lab402 {

	public static void main(String[] args) {
		
		int year;
		
		year = Integer.parseInt(JOptionPane.showInputDialog("Input Year to check : "));
		
		while(!checkYear(year)) {
			year = Integer.parseInt(JOptionPane.showInputDialog("Input Year between 1000 - 3000 : "));
		}
		
		
		JOptionPane.showMessageDialog(null, 
				year + 
				((isLeapYear(year))? " is " : " is not ") +
				"a leap year." );

	} // end of main()
	
	public static boolean checkYear(int year) {
		
		if(year >= 1000 && year <= 3000) {
			return true;
		}else {
			return false;
		}
		
	} // end of checkYear()
	
	public static boolean isLeapYear(int year) {
		
		if(year % 4 == 0 && year % 100 != 0) {
			
			return true;
			
		}else if(year % 100 == 0 && year % 400 == 0) {
			
			return true;
			
		}else{
			
			return false;
			
		}
		
	} // end of isLeapYear()

}