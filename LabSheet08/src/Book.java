
public class Book {
	
	private String title;
	private Author author; // Composition Concept
	private int page;
	
	// Parameterize constructor
	Book(String title, Author author, int page){
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	Book(String title, Author author){
		this.title = title;
		this.author = author;
		this.page = 0;
	}
	
	// Default constructor
	Book(){
		this(null, null,0);
	}
	
	// Setter and Getter
	public String getTitle() {
		return title;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPage() {
		return page;
	}
	
	public String toString() {
		return getTitle() + " has " + getPage() + " pages";
	}
}
