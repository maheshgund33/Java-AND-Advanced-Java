/*Program 2
WAP to reverse each element in an array.
Take size and elements from the user
Input: 10 25 252 36 564
Output: 01 52 252 63 465
*/

import java.io.*;
public class Assignment2 {
   public static void main(String[] args) throws IOException{
	   BufferedReader br= new BufferedReader(new  InputStreamReader(System.in));
	   
	   System.out.println("Enther the size of array ");
	   int size = Integer.parseInt(br.readLine());
	   
	   System.out.println("Enter the array elemnt");
	   int arr[] = new int[size];
	   
	   for(int i=0;i<=arr.length;i++) {
		   int sum=0;
	    arr[i]= Integer.parseInt(br.readLine());
	   }
	  

	   int temp=0;
	   
	   for(int i=0;i<arr.length;i++) {
          temp= arr[i];
   	   int  rev=0;
		   while(temp!=0) {
			  int rem= temp%10;
			   rev=rev*10+ rem;
			   temp= temp/10;
		   }
		   System.out.println(" Revese INteger + :"+ rev);
	   }
	   System.out.println();
	   
	    
   }  
   
   
}
