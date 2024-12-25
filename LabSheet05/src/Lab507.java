import javax.swing.*;

public class Lab507 {

	public static void main(String[] args) {
		
		int[] num = new int[5];	
		
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Input Number (" + (i+1) + ")" ));
		}
		
		showEven(num);
		
		showOdd(num);

	} // end of main()
	
	public static void showEven(int[] num) {	
		String evenNum = "";
		
		for(int i = 0 ; i < num.length ; i++) {
			if(num[i] % 2 == 0) {
				evenNum += num[i] + " ";
			}
		} // end of for loop
		
		JOptionPane.showMessageDialog(null,
				"List of even number : \n" + 
				evenNum);	
	}
	
	public static void showOdd(int[] num) {
		String oddNum = "";
		
		for(int i = 0 ; i < num.length ; i++) {
			if(num[i] % 2 == 1) {
				oddNum += num[i] + " ";
			}
		}  // end of for
		
		JOptionPane.showMessageDialog(null,
				"List of odd number : \n" +
				oddNum);	
	}

}
