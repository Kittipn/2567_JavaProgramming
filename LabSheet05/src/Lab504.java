package LabSheet05;

import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] score = new double[5];
		double sum = 0, average;
		
		for (int i = 0 ; i < score.length ; i++) {
			System.out.print("Input score of student (" + (i+1) + ") : ");
			score[i] = input.nextDouble();
			
			sum += score[i];
		}
		
		average = sum / score.length;
		
		System.out.println();
		System.out.printf("The average score is %.2f \n",average);
		
		System.out.println("List of score above average :");
		for(int i = 0 ; i < score.length ; i++) {
			if(score[i] > average) {
				System.out.printf("> Student %d (%.2f) \n",(i+1),score[i]);
			}
		}
		
		input.close();
		
	}

}
