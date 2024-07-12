/*Program 3
WAP to find a composite number from an array and return its index.
Take size and elements from the user
Input: 1 2 3 5 6 7
Output: composite 6 found at index: 4
*/

import java.io.*;
public class Assignment3 {
	public static void main(String[]  args) throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the size of array ");
	
	int size = Integer.parseInt(br.readLine());
	
	System.out.println("Enter the elemnt of array ");
	int  arr[]= new int[size];
	
	for(int i=0;i<arr.length;i++) {
		arr[i]= Integer.parseInt(br.readLine());
		
	}
	int count =0;
	for(int i=0;i<arr.length;i++) {
		int N=arr[i];
		
		for(int j=1;j<N/2;j++) {
		 if(N%j==0) {
			 
			 count++;
		}if(count>2) {

			System.out.println(" composite number is:"+ i);
			
		}
		}
	}
	System.out.println();	
	}

}
