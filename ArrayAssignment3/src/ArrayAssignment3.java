/*Program 1
Write a program to print count of digits in elements of array.
Input: Enter array elements : 02 255 2 1554
Output: 2 3 1 4
*/

import java.io.*;
public class ArrayAssignment3 {
     public static void main(String args[]) throws IOException{
    	 
    	 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	 System.out.println("Enter array size : ") ;
    	 
    	 int size= Integer.parseInt(br.readLine());
    	 
    	 System.out.println("Enter the all element");
    	 int arr[]= new int[size];
    	 
    	 for(int i=0; i<arr.length;i++) {
    		 int sum=0;
    		 arr[i]= Integer.parseInt(br.readLine());
    		 
    	 }
    	 int count=0;
    	 
    	 for(int i=0;i<arr.length;i++) {
    		 int tmp= arr[i];
    		 while(tmp !=0) {
    			 count++;
    			 tmp= tmp/10;
    		 }
    		 
    		 System.out.println("Count of each :" + count); 
    	 }
    	 
     }
}

