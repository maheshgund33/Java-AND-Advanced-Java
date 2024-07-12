package IteratorDemo;

import java.util.Iterator;
import java.util.ArrayList;
public class IteratorD {
	public static void main(String[] args) {
		
		ArrayList arr= new ArrayList();
		arr.add("Mahesh");
		arr.add("Rahul");
		arr.add("Gund");
		
		Iterator itr = arr.iterator();
		while(itr.hasNext()) {
			if("Rahul".equals(itr.next()))
			itr.remove();
			
			
			try{
			System.out.println(itr.next());
			}catch(Exception e) {
			  System.out.println("NO Such Element Exception");	
			  
			}
			
			
		}
		System.out.println(arr);
	}

}
  

