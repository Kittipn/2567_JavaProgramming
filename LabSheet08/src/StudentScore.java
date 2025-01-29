
import java.util.*;

public class StudentScore {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many student in the classroom : ");
		int studentNum = input.nextInt();
		// Consume newline character
		input.nextLine();
		
		Space();
		
		// Create array
		Student[] students = new Student[studentNum];
		
		// Input information for each student
		for(int i = 0 ; i < studentNum ; i++) {
			
			// Create new Student object
			students[i] = new Student();
			
			System.out.println("Input Information of Student " + (i+1));
			Line();
			
			System.out.print("Input student name : ");
			students[i].setName(input.nextLine());
			
			System.out.print("Input student score : ");
			students[i].setScore(input.nextInt());
			input.nextLine();
			
			// Check invalid score
			while(students[i].InvalidScore()) {
				System.out.print("Input student score, again : ");
				students[i].setScore(input.nextInt());
				input.nextLine();
			}
			Space();
			
		} // end of for loop
		Space();
		
		// Display PASS students
		System.out.println("List of PASS students (score 50++) ");
		Line();
			
		for(int i = 0 ; i < studentNum ; i++) {
			
		if(students[i].isPass()) {
			System.out.println(">> " + students[i].getName() + " (" + students[i].getScore() + ")  " + 
							   "---> Get grade : " + FindGrade(students[i].getScore())
							   );
			}
		
		} // end of for loop
		
		
		input.close();

	} // end of main method
	
	public static String FindGrade(int score) {
		
		if(score >= 80) 	 { return "A"; }
		else if(score >= 75) { return "B+"; }
		else if(score >= 70) { return "B"; }
		else if(score >= 65) { return "C+"; }
		else if(score >= 60) { return "C"; }
		else if(score >= 55) { return "D+"; }
		else if(score >= 50) { return "D"; }
		else 				 { return "F"; }
		
	}
	
	public static void Space() {
		System.out.println();
	}
	
	public static void Line() {
		for(int i = 1 ; i <= 45 ; i++) {
			System.out.print("-");
		}
		Space();
	}

}
