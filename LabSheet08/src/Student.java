
public class Student {
	
	private String studentName;
	private int studentScore;
	
	
	// setter and getter 
	public void setName(String name) {
		studentName = name;
	}
	
	public String getName() {
		return studentName;
	}
	
	public void setScore(int score) {
		studentScore = score;
	}
	
	public int getScore() {
		return studentScore;
	}
	
	// check score
	public boolean InvalidScore() {
		if(studentScore < 0 || studentScore > 100) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// check if pass
	public boolean isPass() {
		return (studentScore >= 50)? true : false;
	}
	


}
