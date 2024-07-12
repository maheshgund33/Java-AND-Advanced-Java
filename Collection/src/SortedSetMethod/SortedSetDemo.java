package SortedSetMethod;
import java.util.*;
public class SortedSetDemo {
	
	public static void main(String[] args) {
		
		SortedSet ss= new TreeSet();
	    ss.add("mahesh");
	    ss.add("Gund");
	    ss.add("Omkar");
	    ss.add("Akshay");
	    
	    System.out.println(ss);
	 
	    System.out.println("Head"+ss.headSet("Gund"));
	    
	    
	    System.out.println("TailSet:"+ ss.tailSet("Gund"));
	    
	    System.out.println(ss.first());
	    
	    System.out.println(ss.last());
	    
	    System.out.println("SubSet:"+ss.subSet("Akshay","Omkar"));  
	}

}
//
//output
//[Akshay, Gund, Omkar, mahesh]
//Head[Akshay]
//TailSet:[Gund, Omkar, mahesh]
//Akshay
//mahesh
//SubSet:[Akshay, Gund]
