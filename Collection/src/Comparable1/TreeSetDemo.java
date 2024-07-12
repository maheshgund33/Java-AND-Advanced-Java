package Comparable1;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet tr= new TreeSet();
		tr.add(new Movie("Mahesh",150.00f));
		tr.add(new Movie("gund",120.00f));
		tr.add(new Movie("Rahul",250.00f));
		tr.add(new Movie("Omkar",120.00f));
		
		System.out.println(tr);
		
	}

}
//output
//[Mahesh, Omkar, Rahul, gund]