/*Program 8
WAP to find an ArmStong number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 36 153 55 89
Output: Armstrong no 153 found at index: 4
*/

import java.io.*;
public class Assignment8 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size: ");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		
		System.out.println("Enter Array Elements: ");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

		}

		for(int i=0;i<arr.length;i++){
			int N=arr[i];
			int sum=0;
			int count=0;
			for(int l=N;l>0;l=l/10){
				count++;
			}
			for(int k=N;k>0;k=k/10){
				int rem=k%10;
				int mult=1;
				for(int j=0;j<count;j++){
					mult=mult*rem;
				}
				sum=sum+mult;
			}

			if(sum==N){
				System.out.println("Is amstrong no index is : "+i);
			}
		}
		
	}
}



