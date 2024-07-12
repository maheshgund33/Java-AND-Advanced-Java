package BankAccountApp;
import java.util.Scanner;
public class BankApp {
	
	Account createAccount() {
		System.out.println("Create Accounts:");
		System.out.println("1. Saving");
		System.out.println("2. Checking");
		  System.out.println("Enter Your Choice");
		 Scanner sc= new Scanner(System.in);
		 int choice=sc.nextInt();
		 if(choice ==1 ) {
			 
			 return new Saving("Mahesh Gund", 10 );
		 }else {
			 return new Chceking(); 
		 }
		
	}
	public static void main(String[] args) {
		
		BankApp acc= new BankApp();
		
	  Account save= acc.createAccount();
	    save.showInfo();
	    save.deposit();
	    save.transfer();
	    save.withdraw();
	 
	
		 
	}

}
