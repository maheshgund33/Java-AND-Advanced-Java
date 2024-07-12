
package EmailApplication;
import java.util.Scanner;

public class EmailApp {
	
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String password;
	private int defaultPassowrdLength =10;
    private int mailboxCapacity;
    private int capacity=100;
    private String AlternateEmail;
    private String companysuffix="wipro.com";
    
     //first take emp first Name and Last Name 
     public EmailApp(String firstName, String lastName) {
    	this.firstName=firstName;
    	this.lastName=lastName;
    	System.out.println("Email Created :"+ this.firstName+" "+this.lastName );
    	
       //call the Departpment and write department code 
    	this.department= setdepartment();
    	 System.out.println("Department:"+ this.department);
    
   
		//set the random Password 
    	this.password=setrandomPassword(defaultPassowrdLength);
    	System.out.println("Your passowrd is:"+ this.password);
    	
    	//combine email for genrate alternate passoword 
    	email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companysuffix;
    	System.out.println("Your Email is: "+email);

    }
     
     //Ask for Department
     private String setdepartment() {
    	 
    	 System.out.println("New Emp "+firstName+" Department Code:\n1 for Sales \n2 for Development \n3 for Accounting \n4 for none");
         System.out.println("Enter the Department Code: ");
    	 Scanner sc= new Scanner(System.in);
         int depChoice = sc.nextInt();	
         
         if(depChoice==0) {return "Sales";}
         else if(depChoice==1) {return "Development";}
         else if(depChoice==2) {return "Accounting";}
         else {return "none";}
         
     }
     
     // call for password 
     private String setrandomPassword(int length) {
    	 String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
    	 char[] password= new char[length];
    	 for(int i=0;i<length;i++) {
    		 int rand =(int )(Math.random()*passwordset.length());
    		 password[i]=passwordset.charAt(rand);
    	 }
    	 return new String (password); 
     }
     
     //set capacity  
     private void setMailboxCapacity(int mailboxcapacity) {
    	 this.mailboxCapacity= capacity;
    	 
     }
     
     //Set alternate Emial 
     void setAlternateEmail(String altEmail) {
    	 this.AlternateEmail=altEmail;
     }
     
     // for change passowrd
     private void changePassowrd(String password) {
    	 this.password= password;
     }
     
     //get method to show Data 
     public int getmailboxCapacity() {
    	 return  mailboxCapacity;
     }
          
     public String getPassword() {
    	 return password;
     }
     public String getAlternateEmail() {
  		// TODO Auto-generated method stub
  		return AlternateEmail;
	}  
     
     
     public String Info() {
    	 return  "Employee Name: " + firstName+" "+lastName+
    			 "Company Email: " + email+  " "+
    			 "MailBox Caoacity: "+ mailboxCapacity+" mb "+
    			 "Department: "+ department; 
     }
     }
