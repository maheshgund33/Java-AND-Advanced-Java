package LambdaExpressionComparator;
import java.util.*;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
     		
	  ArrayList<Employee> al= new ArrayList();
	  
	  al.add(new Employee(15, "Mahesh"));
	  al.add(new Employee(16, "Gund"));
	  al.add(new Employee(17, "Mayur"));	
	  al.add(new Employee(18, "Rhoit"));
	  al.add(new Employee(19, "Sachin"));
	  
	  System.out.println("unsorted list"+ al); //
	  
	Collections.sort(al,(Employee e1, Employee e2) ->e1.name.compareTo(e2.name));
	
	  System.out.println("Sorted List"+al);
		
	}

}
// output 
//unsorted list[15:Mahesh, 16:Gund, 17:Mayur, 18:Rhoit, 19:Sachin]
//Sorted List[16:Gund, 15:Mahesh, 17:Mayur, 18:Rhoit, 19:Sachin]
