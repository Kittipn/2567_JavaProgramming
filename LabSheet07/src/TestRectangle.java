
public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		System.out.println(r1.showData());
		Space();
		
		System.out.println("Display data using toString() method");
		System.out.println(r1);
		Line();
		Space();
		
		Rectangle r2 = new Rectangle(1.2f,3.4f);
		System.out.println("r2 " + r2);
		Space();
		
		// Test setters and getters method()
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println("r1 " +r1);
		System.out.println("r1 length is  " + r1.getLength());
		System.out.println("r1 width is " + r1.getWidth());
		Space();
		
		// Test getArea() and getPerimeter()
		System.out.printf("r1 area is %.2f%n",r1.getArea());
		System.out.printf("r1 perimeter is %.2f%n",r1.getPerimeter());
	}

	public static void Space() {
		System.out.println();
	}
	
	public static void Line() {
		System.out.println("-------------------------------------");
	}
	
} // end of main()
