import java.io.*;
public class Assignment9 {
	public  static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(" Enter the first size");
		int size1= Integer.parseInt(br.readLine());
		 
		System.out.println(" Enter the second element");
		int size2 = Integer.parseInt(br.readLine());
		
		int arr1[]= new int[size1];
		
		System.out.println("Enter the first elemnt array ");
		
		int arr2[]= new int[size2];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]= Integer.parseInt(br.readLine());
	
		}
		System.out.println(" Enter the second  elemnt of array ");
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i]= Integer.parseInt(br.readLine());
		}
		int arr3[] = new int[arr1.length+ arr2.length];
		int j=0; 	 	
		for(int i=0;i<arr1.length;i++) {
			arr3[j]= arr1[i];
		   System.out.println(" adding array"+ " "+ arr3[j]);
		    j++;
		}
		
		for(int i=0;i<arr2.length;i++) {
			arr3[j]= arr2[i];
			System.out.println( "adding array" +arr3[j] );
			j++;
		}
		System.out.println();
		 
		
	}

}
