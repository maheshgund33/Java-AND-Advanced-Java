/*Program 2
WAP to take size of array from user and also take integer elements from user Print
product of even elements only
input : Enter size : 9
Enter array elements : 1 2 3 2 5 10 55 77 99
output : 40
// 2 * 2 * 10
*/
import java.io.*;
public class Assignmennt2 {
           public static void main(String[] args) throws IOException{
        	   
        	   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        	   
        	   System.out.println(" Enter the size of array ");
        	   
        	   int size=Integer.parseInt(br.readLine());
        	   
        	   System.out.println(" Enter the elemnt of array ");
        	   
        	   int arr[] = new int[size];
        	   
        	   int product=1;
        	   
        	   for(int i=0;i<arr.length;i++) {
        		   arr[i]=Integer.parseInt(br.readLine());
        		   if(arr[i]%2==0) {
        			   product= product*arr[i];
        			   

        		   }
        	   }
			   System.out.println("Product of Element" + product );
        	   
        	   
        	   
           }
	
	
	
	

}
