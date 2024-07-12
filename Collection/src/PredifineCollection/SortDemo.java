package PredifineCollection;
import java.util.*;
import java.util.Collections;
public class SortDemo {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<>();
		
		al.add("Mahesh");
		al.add("Gund");
		al.add("Honda");
		al.add("Hero");
		al.add("Suzuki");
		
		System.out.println("Array Element:"+ al);
		Collections.sort(al);
		System.out.println(al);
	}

}


//output 
//Array Element:[Mahesh, Gund, Honda, Hero, Suzuki]
//[Gund, Hero, Honda, Mahesh, Suzuki]