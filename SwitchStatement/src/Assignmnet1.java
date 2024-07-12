/*
Write a program in which students should enter marks of 5 different subjects. If all subject having above passing marks add them and provide to switch case to print grades (first class second class), if student get fail in any subject program should print "You failed in exam
*/

import java.io.*;
public class Assignmnet1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int percent=0;
		int sum=0;
		int flag=0;
		
		for(int i=0;i<5; i++) {
			System.out.println("Enther the marks our of 100: ");
			
			int marks= Integer.parseInt(br.readLine());
			
			System.out.println("MArks is : "+ marks);
			if(marks >=35) {
				sum+=marks;
			}
			else  flag=1;
			System.out.println(" Btter Luck Next Time");
			break;
			
			
			
		}
				
	
	if(flag==0) {
		percent= (sum/5);
		System.out.println("Sum of :"+sum);
		System.out.println("Percentage "+ " " + percent);
		
		switch(percent/10) {
		case 10: System.out.println(" First class");
		         break;
		
		case 9: System.out.println(" First class");
                break;
                
		case 8: System.out.println(" First class");
                break; 
        
		case 7: System.out.println(" First class");
                break;
        
		case 6: System.out.println(" second class");
                break;
                
		case 5: System.out.println(" Pass");
                break; 
        
		case 4: System.out.println(" fail");
               break;       
        
		case 3: System.out.println(" Fail");
                break;   
                
        default: System.out.println("Invalid input ");        
                break;
		}
		
	}
	}	
	

}
