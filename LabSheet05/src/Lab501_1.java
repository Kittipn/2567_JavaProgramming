
import javax.swing.*;

public class Lab501_1 {

	public static void main(String[] args) {
		
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		
		boolean deptFound = false;
		
		String dept = JOptionPane.showInputDialog("Enter department to search");
		
		for(int i = 0 ; i < deptName.length ; i++) {
			if(dept.equalsIgnoreCase(deptName[i])) {
				deptFound = true;
				dept = deptName[i];
			}
		} // end of for
		
		if(deptFound) {
			JOptionPane.showMessageDialog(null, dept + " was on the list.");
		}else {
			JOptionPane.showMessageDialog(null, dept + " was not on the list.");
		}

	}

}
