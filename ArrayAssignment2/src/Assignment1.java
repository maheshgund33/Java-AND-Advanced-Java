
import java.io.*;
public class Assignment1 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter the size of the array ");
		
		int size = Integer.parseInt(br.readLine());

	    int arr[] = new int[size];
	    System.out.println("Enter the Element");
	    
	    int sum =0;
	    for(int i=0;i<arr.length;i++){
	    	
	    	arr[i]= Integer.parseInt(br.readLine());
	    	
              sum+=arr[i];
	    	
	    	System.out.println(" Sum of array Element is : " + sum );
	    	
	    	
	    
	    	
	    	
	    }
	    
	    
	}

}
