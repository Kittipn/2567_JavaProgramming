package CircleProgram;

public class TestResizableCircle {

	public static void main(String[] args) {
		
		ResizableCircle rc1 = new ResizableCircle(10.0);
		
		System.out.println(rc1);
		
		System.out.printf("- Perimeter : %.2f \n",rc1.getPerimeter());
		System.out.printf("- Area      : %.2f \n",rc1.getArea());
		
		System.out.println();
		
		rc1.resize(50);
		System.out.println("// After resize //");
		System.out.println(rc1);
		
		System.out.printf("- Perimeter : %.2f \n",rc1.getPerimeter());
		System.out.printf("- Area      : %.2f \n",rc1.getArea());

	} // end of main method
	
}
