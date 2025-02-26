
import java.util.*;
import java.io.*;

public class Lab1101 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		System.out.print("Input section : ");
		int section = scan.nextInt();
		
		printHeader(section);
		
		displayStudentList(section);

	}
	
	
	public static void printHeader(int section) {
		System.out.println("****************************************************************");
		System.out.println("\t\t List of Data for Section " + section);
		System.out.println("****************************************************************");
	}
	
	
	public static void displayStudentList(int section) throws IOException {
		
		try(BufferedReader readFile = new BufferedReader(new FileReader("src//txtFile//List107.txt"))) {
			String temp = "";
			
			while( (temp = readFile.readLine()) != null){
				String[] data = temp.split("\t");
				
				if(data.length < 6) continue; // Ensure valid data format
				
				int studentSection = Integer.parseInt(data[3]);
				
				if(section == studentSection) {
					double totalScore = Double.parseDouble(data[4]) + Double.parseDouble(data[5]);
					
					System.out.printf("%s %s\t\t %s \t %s \t %s %n",
									  data[0], data[2], data[4], data[5], findResult(totalScore));
				}
				
			} // end of while
			
		} // end of try
		
	}
	
	public static String findResult(double totalScore) {
		return (totalScore >= 40)? "Pass" : "Fail";
	}

}
