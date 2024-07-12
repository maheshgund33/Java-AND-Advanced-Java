package LinkedHashSet;
import java.util.*;

public class LinkedhashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add("Mahesh");
		lhs.add("Gund");
		lhs.add("Omkar");
		lhs.add("Rahul ");
		
		System.out.println(lhs);
	}

}

//
//output:
//	[Mahesh, Gund, Omkar, Rahul ]