package Lab1105;

import java.util.*;
import java.io.*;

public class SaveAndOpen extends Employee {
	
	private String name;
	private String dept;
	
	public void insert() throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		// PrintStream writeFile = new PrintStream(new File("src//txtFile//employee.txt"));
		PrintWriter writeFile = new PrintWriter(new FileWriter("src//txtFile//employee.txt",true));
		
		String answer;
		
		do {
			super.header();
			
			System.out.print("Enter name : ");
			name = input.next();
			
			System.out.print("Enter department : ");
			dept = input.next();
			
			writeFile.println(name+ "\t" + dept);
			
			System.out.print("Do you want to input data again? (Y/N) : ");
			answer = input.next();
			input.nextLine();
			
		} while(answer.equalsIgnoreCase("Y"));
		
		input.close();
		writeFile.close();
		
	} // end of insert
	
	public void searchData() {
		try {
			Scanner readFile = new Scanner(new File("src//txtFile//employee.txt"));
			
			int i = 0;
			boolean check = false;
			
			super.header();
			
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				
				if(dept.equals(super.getDept())) {
					i++;
					System.out.println(i + ")" + name);
					check = true;
				}
			}
			
			if(check) {
				super.header();
				System.out.println("Employee in " + super.getDept() + 
						   		 " department is " + i + " person(s)");
			}
			else {
				System.out.println("There are no person in " + super.getDept() +
								 " department.");
			}
			
			
			
		}catch(IOException e) {
			System.out.println("\n File not found.");
		}
	}
	
	
	
	public void read() {
		
	}

}
