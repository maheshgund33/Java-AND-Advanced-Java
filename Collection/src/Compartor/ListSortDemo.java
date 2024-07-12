package Compartor;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortDemo {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(new Employee("Mahesh",1000.00f));
		al.add(new Employee("Gund",5000.00f));
		al.add(new Employee("Mohit",6600.00f));
		al.add(new Employee("Akshay",7700.00f));
		al.add(new Employee("Rajesh",8800.00f));
		
		System.out.println(al);
		
		Collections.sort(al, new SortByName());
		System.out.println(al);
		
		
		Collections.sort(al,new SortBySal());
		System.out.println(al);
	}

}
