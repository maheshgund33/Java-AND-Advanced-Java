/*Write a program in which user should enter two numbers if both the numbers are positive multiply them and provide to switch case to verify number is even or odd, if user enters any negative number program should terminate saying "Sorry negative numbers not allowed" */


import java.io.*;

public class Assignment3 {
	public static void main(String[] main) throws IOException {
		BufferedReader br=  new BufferedReader( new InputStreamReader(System.in));
		
		System.out.println("Enter the First Number ");
		int num1=Integer.parseInt(br.readLine());
		
		System.out.println(" Enter the second number ");
		int num2=Integer.parseInt(br.readLine());
		
		
		
		if(num1>0 && num2>0) {
			int mul= (num1*num2) & 1;
			switch(mul) {
			  case 1: System.out.println(" odd number ");
			        break;
			        
			  default: System.out.println("even number ");
			        break;
			        } 
		
		} else{
		       {
				System.out.println(" Enter the positive Number");
			}
		  }
			
		}
		
		
	

}
