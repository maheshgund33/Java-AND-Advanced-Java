package TreeSet;
import java.util.*;
public class TreeSetDemo {
	
	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add("Kanha");
		ts.add("krishna");
		ts.add("Govind");
		ts.add("Parth");
		
		System.out.println("Tree set Element are:"+ ts);
	}

}

// arrange in proper Alphabetical seq.
//output:
//Tree set Element are:[Govind, Kanha, Parth, krishna]
