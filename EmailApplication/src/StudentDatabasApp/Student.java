package StudentDatabasApp;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeyears;
	private String studentId;
	private int TutionBalance=0;
	private String courses;
	private static int costOfCourse=600;
	private static int id=1000;
	
	
	// Constructore >> number of student add  each year 
     public  Student() {
    	  Scanner sc= new Scanner(System.in);
    	  System.out.print("Enter the Student First Name: ");
    	  this.firstName=sc.nextLine();
    	  
    	  
    	  System.out.print("Enter the Student last Name: ");
    	  this.lastName = sc.nextLine();
    	  
    	  System.out.println("1:-Fresher\n2:-second years\n3:-Junior\n4:-Senior\n");
    	  System.out.print
    	  ("Enter the class level code:-");
    	  this.gradeyears=sc.nextInt();
    	  
    	  setStudentId();
    	  System.out.println(firstName + " "+ lastName+" "+ gradeyears+ " "+ studentId);
      }
	
	//Genrate unique ID
    public void setStudentId() {
    	// grade years + Id
    	id++;
    	this.studentId= gradeyears+" "+ id;
    	
    } 
	
	//Entrollment courses
    public void enroll() {
        do {
    	System.out.print("Enter the to enroll(Q to quit):-");
    	Scanner sc= new Scanner(System.in);
        String course=sc.nextLine();
        
          if(!course.equals("Q")) {
        	courses= courses+"\n "+ course;
        	TutionBalance = TutionBalance + costOfCourse;
        	
           }else {
        	System.out.println("Break!");
        	break;
            }
          }
          while(1!=0); 
        System.out.println("Entrolled In:-"+ courses);
        System.out.println("Tution Fees:-"+ TutionBalance);
    }
	
	// view balaance 
    public void viewBalance() {
    	System.out.println("Your Balance is Rs:-"+ TutionBalance);
    }	
    
	//pay  tuition fee
    public void payTuition(int i) {
    	System.out.println("Enter your payment Rs:-");
    	Scanner sc1= new Scanner(System.in);
    	int payment =sc1.nextInt();
    	TutionBalance= TutionBalance - payment;
    	System.out.println("Thank for your Payment:-"+ payment);
    	viewBalance();
    	
    }
	// final Status with name, ID , years & course, Balance 
	public String toString() {
		return "Name:"+ firstName+" "+ lastName +
				"\nGradeLevel"+ gradeyears+
				"\nStudent ID:"+ studentId+
				"\nCourses Entrolled: "+ courses+
				"\nTution Balance:"+ TutionBalance;
	}

}
	