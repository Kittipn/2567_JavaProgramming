
import javax.swing.*;



public class Lab203 {

	public static void main(String[] args) {
		
		double weight = Double.parseDouble(JOptionPane.showInputDialog(null,"Input Weight : "));
		
		double height = Double.parseDouble(JOptionPane.showInputDialog(null,"Input Height : "));
		
		double heightM = height / 100;
		
		double bmi = weight / (heightM*heightM);
		
		String message = "";
		
		if(bmi < 18.5)
		{
			message = "Underweight";
		}
		
		else if(bmi <= 24.9)
		{
			message = "Normal-weight";
		}
		
		else if(bmi <= 29.9)
		{
			message = "Overweight";
		}
		
		else
		{
			message = "Obese";
		}
		
		JOptionPane.showMessageDialog(null, "BMI = " + bmi + "\n" +
											"You are " + message);

	}

}
