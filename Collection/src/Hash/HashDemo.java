package Hash;
import java.util.*;
public class HashDemo {
	public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(new Integer(10));  // new integer add karaycha asel set madhe with same number 
		hs.add(new Integer(20));  // new integer add karaycha asel set madhe with same number
		
		System.out.println("Hash Set Element is:"+hs);
	}

}

//output:
//	Hash Set Element is:[20, 10]