/*Program 9
Write a program to print the second min element in the array
Input: Enter array elements: 2 255 2 1554 15 65
Output: 0
*/
import java.io.*;
public class Assignemnt10 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		System.out.println("Enter Array Elements: ");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

		}
		
		int a=0;
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		if (arr[0]<min) {
			a = min;
			min=arr[i];

		
		 if(arr[i]<a && arr[i] !=min ){
			a=arr[i];
		}
		}
		System.out.println("Second element+"+ a);

		
	}

}
