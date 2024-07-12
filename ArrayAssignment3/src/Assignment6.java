/*Program 6
WAP to find a palindrome number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 36 564

*/
import java.io.*;
public class Assignment6 {
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter the size of array ");
		
		int size= Integer.parseInt(br.readLine());
		
		System.out.println(" Enter the element");
		int arr[] = new  int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= Integer.parseInt(br.readLine());
			
		}
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			int rev=0;
			while(temp!=0) {
				int rem= temp%10;
				rev= rev*10+ rem;
				temp=temp/10;
				
			}
			if(arr[i]==rev){
				System.out.print("palindrome No index: "+i);
			}
		}
		System.out.println();
	}

}
