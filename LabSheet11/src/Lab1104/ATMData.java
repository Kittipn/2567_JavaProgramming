package Lab1104;

public class ATMData {
	
	private String accountNumber;
	private String password;
	
	ATMData(String accountNumber, String password){
		this.accountNumber = accountNumber;
		this.password = password;
	}
	
	public String getID() {
		return this.accountNumber;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	

}
