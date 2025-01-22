
public class Rectangle {
	
	private float length;
	private float width;
	
	// Default Constructor
	Rectangle(){
		length = 1.0f;
		width = 1.0f;
	}
	
	// Parameterize Constructor
	Rectangle(float length, float width){
		this.length = length;
		this.width = width;
		
	}
	
	// Getter and Setter method
	public float getLength() {
		return this.length;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	// calculate area
	public double getArea() {
		return this.length * this.width;
	}
	
	// calculate perimeter
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}
	
	// display method
	public String showData() {
		return "Rectangle[length= " + this.length + ", width = " + this.width+"}";
	}
	
	// display method using toString()
	public String toString() {
		return "Rectangle[length= " + this.length + ", width = " + this.width+"}";
	}
	
	
	
	
	
}
