import java.io.*;
public class Assignment5 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
		
		System.out.println(" Enter the array Size ");
		int size= Integer.parseInt(br.readLine());
		System.out.println(" Enter the element ");
		
		int arr[]= new int[size];
		
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			
			
		}
		int min= arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			
		}
		System.out.println(" Minnimun number of the array is :"+ min);
	}

}
