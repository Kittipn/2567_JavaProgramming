import java.util.*;

public class Lab404 {

    public static void main(String[] args) {
        inputStudent();
    }

    public static void inputStudent() {
        Scanner input = new Scanner(System.in);

        String studentId, subjectId;

        while (true) {
            System.out.print("Enter Student ID (10 digits): ");
            studentId = input.nextLine();

            System.out.print("Enter Subject ID (7 digits): ");
            subjectId = input.nextLine();

            if (isLengthValid(studentId, subjectId)) {
                break;
            } else {
                System.out.println("Invalid input. Student ID must be 10 digits and Subject ID must be 7 digits.\n");
            }
        }

        boolean isITStudent = isITStudent(studentId);
        boolean isITSubject = isITSubject(subjectId);
        
        System.out.println();

        System.out.println("Student ID: " + studentId);
        displayData(isITStudent, isITSubject);

        input.close();
    }

    public static boolean isLengthValid(String studentId, String subjectId) {
        return studentId.length() == 10 && subjectId.length() == 7;
    }

    public static boolean isITStudent(String studentId) {
        return studentId.substring(3, 6).equals("311") && studentId.charAt(2) == '1';
    }

    public static boolean isITSubject(String subjectId) {
        return subjectId.substring(0, 2).equals("21") && subjectId.charAt(4) == '5';
    }

    public static void displayData(boolean isITStudent, boolean isITSubject) {
        System.out.println((isITStudent ? "is" : "is not") + " a 1st-year student in IT");
        System.out.println((isITSubject ? "" : "not ") + "enrolled in courses for year 1");
    }
}
