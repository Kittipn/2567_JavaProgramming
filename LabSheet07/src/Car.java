
public class Car {
	
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	// Default Constructor
	Car(){
		companyName = "Unknown";
		modelName = "Unknown";
		year = 2000;
		mileage = 0.0;
	}
	
	// Parameterize Constructor
	Car(String companyName, String modelName, int year, double mileage){
		this.companyName = companyName;
		this.modelName = modelName;
		// Make manufacture year to Default if less than 1886
		this.year = (year >= 1886)? year:2000;
		this.mileage = mileage;
	}
	
	// Getter and Setter
	public void setCompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}
		else {
			System.out.println("Error : Invalid company name");
		}
	}
	
	public void setModelName(String modelName) {
		if(modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}
		else {
			System.out.println("Error : Invalid model name");
		}
	}
	
	public void setYear(int year) {
		if(year >= 1886) {
			this.year = year;
		}
		else {
			this.year = 2000;
			System.out.println("Error : Invalid Year");
		}
	}
	
	public double getMileage() {
		return this.mileage;
	}
	
	public void Showdata() {
		System.out.println("Company Name : " + companyName);
		System.out.println("Model Name : " + modelName);
		System.out.println("Year : " + year);
		System.out.println("Mileage : " + mileage);
	}

}
