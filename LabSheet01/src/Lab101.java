import java.text.DecimalFormat;
import java.util.*;
public class Lab101 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		DecimalFormat fmt = new DecimalFormat("#,###.00");
		DecimalFormat nofloat = new DecimalFormat("00");
		
		System.out.print("Input Product Name : ");
		String productName = input.nextLine();
		
		System.out.print("Input Product Unit : ");
		int productUnit = input.nextInt();
		
		System.out.print("Input Product Price per Unit : ");
		double productPrice = input.nextDouble();
		
		double totalPrice = productUnit * productPrice;
		
		System.out.println("---------------------------------------------");
		System.out.println("Total Price is " + fmt.format(totalPrice) + " baht.");
		System.out.println("---------------------------------------------");
		
		System.out.print("How many Discount (%) : ");
		double discountInput = input.nextDouble();
		double discountP = discountInput/100;
		double discount = totalPrice*discountP;
		
		double totalNetPrice = totalPrice - discount;
		System.out.println("---------------------------------------------");
		
		System.out.println("Discount form " + nofloat.format(discountInput) + "% \t" + fmt.format(discount) + " baht.");
		System.out.println("Amount to be paid \t" + fmt.format(totalNetPrice) + " baht." );
		
		input.close();
		
	}

}
