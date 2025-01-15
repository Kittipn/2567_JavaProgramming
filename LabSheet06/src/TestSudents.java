package StudentScore;

public class TestSudents {

	public static void main(String[] args) {
		// Create two student objects
		Student student1 = new Student();
		Student student2 = new Student();
		
		// Set student details
		student1.setStudentDetails("Mark", new double[] {85.0, 78.0, 98.0});
		student2.setStudentDetails("Sumsu", new double[] {68.0, 66.5});
		
		// Display student details
		System.out.println("Student 1 details");
		student1.displayStudentDetails();
		
		System.out.println();
		
		System.out.println("Student 2 details");
		student2.displayStudentDetails();

	}

}
