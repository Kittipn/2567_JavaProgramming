package Lab08_5;

public class Date {
	
	private int dMonth;
	private int dDay;
	private int dYear;
	
	Date(){
		this(0,0,0);
	}
	
	Date(int month, int day, int year){
		this.dMonth = month;
		this.dDay = day;
		this.dYear = year;
	}
	
	public void setDate(int month, int day, int year) {
		this.dMonth = month;
		this.dDay = day;
		this.dYear = year;
	}
	
	public int getMonth() {
		return this.dMonth;
	}
	
	public int getDay() {
		return this.dDay;
	}
	
	public int getYear() {
		return this.dYear;
	}
	
	public String toString() {
		return getMonth() + "-" + getDay() + "-" + getYear();
	}

}
