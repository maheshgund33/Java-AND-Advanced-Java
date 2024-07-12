//Project 2
//Student Database Application
//Scenario: You are a Database Administrator for a university and need to
//create an application to manage student enrollments and balance.
//Your application should do the following:
// Ask the user how many new students will be added to the database
// The user should be prompted to enter the name and year for each student
// The student should have a 5-digit unique ID, with the first number being their grade level
// A student can enroll in the following courses:
//History 101
//Mathematics 101
//English 101
//Chemistry 101
//Computer Science 101
// Each course costs $600 to enroll
// The student should be able to view their balance and pay the tuition
// To see the status of the student, we should see their name, ID, courses enrolled, and balance
package StudentDatabasApp;

import java.util.Scanner;

public class StudentDatabseApp {
	 public static void main(String[] args ) {
		 
		 // ask how want to entroll 
		 System.out.print("Enter the number of student you want to enroll:");
		 Scanner student= new Scanner(System.in);
		 int numOfStudent=student.nextInt();
		 Student[] TotalStudent= new Student[numOfStudent];
		 
		 for(int i=0;i<numOfStudent;i++) {
			 TotalStudent[i]= new Student();
			 TotalStudent[i].enroll();
			 TotalStudent[i].payTuition(500);
			  
		 }
		 for(int i=0;i<numOfStudent;i++) {
			 System.out.println(TotalStudent[i].toString());
		 }
	
		 
		 
	 }

}

//output 
//Enter the number of student you want to enroll:1
//Enter the Student First Name: Mahesh
//Enter the Student last Name: Gund
//1:-Fresher
//2:-second years
//3:-Junior
//4:-Senior
//
//Enter the class level code:-3
//Mahesh Gund 3 3 1001
//Enter the to enroll(Q to quit):-Math  101
//Enter the to enroll(Q to quit):-History 101
//Enter the to enroll(Q to quit):-Q
//Break!
//Entrolled In:-null
// Math  101
// History 101
//Tution Fees:-1200
//Enter your payment Rs:-
//150
//Thank for your Payment:-150
//Your Balance is Rs:-1050
//Name:Mahesh Gund
//GradeLevel3
//Student ID:3 1001
//Courses Entrolled: null
// Math  101
// History 101
//Tution Balance:1050


