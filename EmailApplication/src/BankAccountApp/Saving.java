package BankAccountApp;

public class Saving implements Account{

	String name;
	int Balance=0;
	
	
	public Saving(String name, int Balance) {
		this.name=name;
		this.Balance=Balance;
	}
	
	
	
	public void showInfo() {
		System.out.println("Welcome"+ name+ ","+"SBI Saving Account");
		System.out.println("What DO you want to check:");
	}
	
	public void withdraw() {
	  System.out.println("Please Enter the Amount you want to ");
	  
	}
	
	public void transfer() {
		System.out.println("Transfer your money");
		
	}
	
	public void deposit() {
		System.out.println("Deposit ammount");	
	}	
	}


