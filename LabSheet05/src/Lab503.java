package LabSheet05;

import java.util.*;

public final class Lab503 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[7];
		
		int evenCount = 0 , oddCount = 0;
		String evenNum = "", oddNum = "";
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.print("Input a positive number (" + (i+1) + ") : ");
			num[i] = input.nextInt();
			
			if(num[i] % 2 == 1) {
				oddCount ++;
				oddNum += num[i] + " ";
			}
		} // end of for loop
		
		System.out.println();
		
		System.out.println("There are " + 
		oddCount + 
		" odd number" + 
		((oddCount > 1)? "s.": ".")
		);
		
		if (oddCount > 0 ) {
			System.out.println("List of odd number : " + oddNum);
		}
		
		
		input.close();

	} // end of main

}
