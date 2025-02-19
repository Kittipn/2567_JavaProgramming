package Lab10_02;

import java.time.LocalDate;

public class FictionBook implements Author,Book {
	
	private String authorName;
	private String email;
	private String title;
	private int publicYear;
	private String firstName;
	private String lastName;
	
	FictionBook(String title, int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		authorName = name;
		
		/*
		String[] fullName = authorName.split(" ");
		firstName = fullName[0];
		lastName = fullName[1];
		*/
		
		int space = authorName.indexOf(" ");
		firstName = authorName.substring(0,space);
		lastName = authorName.substring(space+1);
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	
	@Override
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public String getFirstName() {
		return firstName;
	}
	
	@Override
	public boolean checkEmail() {
		if(email.endsWith("@hotmail.com") || email.endsWith("@windowslive.com")) {
			return true;
		}
		else {
			return false;
		}
	} // end of checkEmail
	
	@Override
	public String getTitle() {
		return this.title;
	}
	
	@Override
	public int totalPublishedYear() {
		return LocalDate.now().getYear() - this.publicYear;
	}
	
	public String toString() {
		return title + " written by " + getLastName().charAt(0) + "." + getFirstName().toUpperCase() +
			   " (" + getEmail() + ") \n" + 
			   "Published for " + totalPublishedYear() + " years.";
	}
	

}
