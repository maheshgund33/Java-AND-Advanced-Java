
/*Program 7
WAP to find a Strong number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 36 564 145
Output: Strong no 145 found at index: 5
*/
import java.io.*;
public class Assignment7 {
	public static void main(String[] args)throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println(" Enter the size of array ");
	
	int size= Integer.parseInt(br.readLine());
	
	System.out.println(" Enter the element");
	int arr[] = new  int[size];
	
	for(int i=0;i<arr.length;i++) {
		arr[i]= Integer.parseInt(br.readLine());
		
	}
	  for(int i=0;i<arr.length;i++){
		int N=arr[i];
		int sum=0;

		for(int k=N;k>0;k=k/10){
			int rem=k%10;
			int fact=1;
			for(int j=rem;j>0;j--){
				fact=fact*j;
			}
			sum=sum+fact;
		}
		if(sum==N){
			System.out.println("Is strong number index is : "+i);

	}
	}
	
}
}
