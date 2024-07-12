/*Q2.


Write a program in which ask the user to enter a number from 0 to 5 and print it's spelling, if the entered number is greater than 5 print entered number is greater than 5


e.g


Input -Enter a number - 4 Output-four
*/

import java.io.*;
public class Assignment2 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number:"+ " ");
		
		int number= Integer.parseInt(br.readLine());
		
		if(number>=0) {
		
		switch(number) {
		case 1: System.out.println("one");
		       break;
		
		case 2: System.out.println("Two");
	       break; 
	    
		case 3: System.out.println("Three");
	       break; 
	       
		case 4: System.out.println("Four");
	       break; 
	       
		case 5: System.out.println("Five");
	       break;  
	     
		default: System.out.println("Invalid input");
	       break;   
		       
		
		     }
		  
		 }
		else {
			System.out.println("Please enter number greater than Zero");
		}
		while(true);
	}

	
	
		

}
