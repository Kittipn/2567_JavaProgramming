
public class Author {

	private String name;
	private String email;
	
	// Default constructor
	Author(){
		this(null,null);
	}

	// Parameterize constructor
	Author(String name, String email){
		this.name = name;
		this.email = email;
	}
	
	
	// setter and getter
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	// toString method
	public String toString() {
		return getName() + ". (" + getEmail() + ")";
	}
	
}
