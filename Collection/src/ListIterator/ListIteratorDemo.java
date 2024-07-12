package ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ArrayList arr= new ArrayList();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		ListIterator litr = arr.listIterator();
		while(litr.hasnext()) {
			System.out.println(litr.next());
		}
		while(litr.hasPrevious(1)) {
			System.out.println("previous "+ litr.privious());
		}
		
		
	}

}
