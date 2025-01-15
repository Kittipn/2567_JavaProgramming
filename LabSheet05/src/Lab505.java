package LabSheet05;

import java.util.*;	

public class Lab505 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] numArray = {78, 36, 58, 41, 25, 92, 75};
		
		System.out.println("----------------------");
		for (int i = 0 ; i < numArray.length ; i++) {
			System.out.print(numArray[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------");
		
		int index;
		
		System.out.print("Input index of the array (0-6) : ");
		index = input.nextInt();
		
		while(index < 0 || index > 6) {
			System.out.print("Input index of the array, again (0-6) : ");
			index = input.nextInt();
		}
		
		System.out.println();
		System.out.println("Value in current index is " + numArray[index]);
		if(index+1 > 6) {
			System.out.println(index + " is the last index");
		}else {
			System.out.println("Value in next index is " + numArray[index+1]);
		}
		
		input.close();
	}

}
