package HashMap;
import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		HashSet hs= new HashSet();
		
		hs.add("Mahesh");
		hs.add("Gund");
		hs.add("Mahesh");
		hs.add("Ashish");
		hs.add("Mayur");
		
		System.out.println("Hash Set: "+hs);
		
		
		HashMap hm = new HashMap();
		hm.put("Mahesh","Wipro");
		hm.put("Gund","Infosys");
		hm.put("Mahesh"," Wipro");
		hm.put("Ahish","TCS");
		hm.put("Mayur", "Google");
		System.out.println("Hash Map: "+ hm);
	}

}
//output
//Hash Set: [Gund, Ashish, Mayur, Mahesh]
//Hash Map: {Ahish=TCS, Gund=Infosys, Mayur=Google, Mahesh= Wipro}