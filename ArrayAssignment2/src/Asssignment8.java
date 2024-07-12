import java.io.*;
public class Asssignment8 {
	public static void main(String[] main) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    
		System.out.println("Enter the size of array  :");
		int size1 = Integer.parseInt(br.readLine());
		int size2 = Integer.parseInt(br.readLine());
		
		System.out.println(" Enter the Element");
		int arr1[]= new int[size1];
		int  arr2[]= new int[size2];
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=Integer.parseInt(br.readLine());
			
		}
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i])
				System.out.println("Uncommon element are :  "+ arr1[i]+ " "+arr2[i]);
		}
		
	}

}
