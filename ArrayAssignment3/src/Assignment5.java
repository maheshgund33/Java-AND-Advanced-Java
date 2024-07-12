
/*
 * Program 5
WAP to find a Perfect number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 496 564
Output: Perfect no 496 found at index: 3
*/
import java.io.*;
public class Assignment5 {
	public static void main(String[] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter the size of array ");
		
		int size= Integer.parseInt(br.readLine());
		
		System.out.println(" Enter the element");
		int arr[] = new  int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= Integer.parseInt(br.readLine());
			
		}
		for(int i=0;i<arr.length;i++) {
			int N= arr[i]/2;
			int sum=0;
			for(int j=1;j<arr.length;i++) {
				if(N%j==0) {
					sum +=j; 
				}
				if(sum==N) {
					System.out.println("perfect number of index is :"+ i);
				}
				
			}
		}
	   
	}
	

}
