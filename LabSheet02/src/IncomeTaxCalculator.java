import java.util.*;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;

        int taxableIncome;
        double incomeTax20k = 0, incomeTax40k = 0, incomeTax60k = 0, totalIncomeTax;

        System.out.print("Enter the taxable income: ");
        taxableIncome = input.nextInt();

        if (taxableIncome <= 20000) {
            totalIncomeTax = 0; 
        } else if (taxableIncome <= 40000) {
            incomeTax20k = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
            totalIncomeTax = incomeTax20k;
        } else if (taxableIncome <= 60000) {
            incomeTax20k = 20000 * TAX_RATE_ABOVE_20K; 
            incomeTax40k = (taxableIncome - 40000) * TAX_RATE_ABOVE_40K;
            totalIncomeTax = incomeTax20k + incomeTax40k;
        } else {
            incomeTax20k = 20000 * TAX_RATE_ABOVE_20K; 
            incomeTax40k = 20000 * TAX_RATE_ABOVE_40K; 
            incomeTax60k = (taxableIncome - 60000) * TAX_RATE_ABOVE_60K; 
            totalIncomeTax = incomeTax20k + incomeTax40k + incomeTax60k;
        }

        // Output
        System.out.printf("The income tax to be paid is %.2f baht.", totalIncomeTax);
        
        input.close();
	}

}