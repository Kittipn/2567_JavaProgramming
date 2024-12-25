import javax.swing.*;

public class Lab508 {
	
	static int[] nums = {25, 78, 41, 22, 36, 85, 37};

	public static void main(String[] args) {
		
		int index;
		
		index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array"));
		
		while(checkIndex(index)) {
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again"));
		}
		
		JOptionPane.showMessageDialog(null,
				"Current number (" + index + ") is " + (currentNum(index)) + "\n" +
				"Previous number (" + (index-1) + ") is " + (prevNum(index)) + "\n" +
				"Next number (" + (index+1) + ") is " + (nextNum(index)) 
				);
		
	}
	
	public static boolean checkIndex(int index) {
		if(index < 0 || index > nums.length) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int currentNum(int index) {
		return nums[index];
	}
	
	public static int prevNum(int index) {
		return nums[index-1];
	}

	public static int nextNum(int index) {
		return nums[index+1];
	}

}
