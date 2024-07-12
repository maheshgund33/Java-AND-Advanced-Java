/*Program 3
WAP to take size of array from user and also take integer elements from user Print
product of odd index only
input : Enter size : 6
Enter array elements : 1 2 3 4 5 6
output : 48
//2 * 4 * 6
*/
import java.io.*;
public class Assignment3 {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of elemnt");
		
		int size= Integer.parseInt(br.readLine());
		
		int arr[]= new int[size];
		int product=0;
		
		System.out.println(" Enter the element of array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(i%2!=0) {
				product*=arr[i];
			}
		}
		System.out.println("Product array of element"+ product);
		
	}

}
