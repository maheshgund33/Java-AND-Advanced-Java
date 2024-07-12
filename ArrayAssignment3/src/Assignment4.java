
/*Program 4
WAP to find a prime number from an array and return its index.
Take size and elements from the user
Input: 10 25 36 566 34 53 50 100
Output: prime no 53 found at index: 5
*/

import java.io.*;
public class Assignment4 {
    public static void main(String[] args) throws IOException{
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("Enter size of array");
      int size= Integer.parseInt(br.readLine()); // yetana string manhun yete ani nantr integer madhe convert karte
      
      System.out.println("Enter the element of array");
      int arr[]= new int[size];
      
      for(int i=0;i<arr.length;i++) {
    	  arr[i]= Integer.parseInt(br.readLine()); // nuste string asel tr = br.readLine(); use kr 
          
         }
     
      for(int i=0;i<arr.length;i++) {
    	  int count=0;
    	  for(int j=1;j<=arr[i]/2;j++) {
    		  if(arr[i]%j==0) {
    		  count++;
    		  }
    		  
    	  }
          count++;
          if(count==2) {
        	  System.out.println(" prime number is :"+ i+ " ");
        	  
          }
        }
      System.out.println(); 
    }
}
