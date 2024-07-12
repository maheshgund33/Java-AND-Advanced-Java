package Comparable;
import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add(new MyClass("Mahesh"));
		ts.add(new MyClass("Gund"));
		ts.add(new MyClass("Hero"));
		ts.add(new MyClass("Honda"));
		
		System.out.println(ts);
	}

}
