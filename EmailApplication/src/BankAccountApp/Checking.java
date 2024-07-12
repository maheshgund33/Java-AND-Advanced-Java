package BankAccountApp;

public class Checking implements Account{
	
	String accountPIN;
	int accountkey;
	
	
	public String setShowinfo() {
		return this.accountPIN; 
	}
	

	   
	public int setTransfer() {
		return this.accountkey;
	}
	
	
	
}


