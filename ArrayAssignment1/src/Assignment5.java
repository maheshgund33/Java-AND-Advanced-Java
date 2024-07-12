
import java.io.*;
public class Assignment5 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter the size: ");
		
		int size= Integer.parseInt(br.readLine());
		
		System.out.println(" Enter the element");
		
		int arr[]= new int[size];
		
		for(int i=0;i<=arr.length;i++) {
			
			arr[i]=Integer.parseInt(br.readLine());
			
			}
		 System.out.println("Number Divisible by Five ");
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%5==0) {
					System.out.println(arr[i]);
		 }
		}
		
	}

}
