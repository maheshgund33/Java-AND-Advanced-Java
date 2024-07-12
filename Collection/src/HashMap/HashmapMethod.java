package HashMap;
import java.util.*;

public class HashmapMethod {
	
	public static void main(String[] args ) {
	
		HashMap hm = new HashMap();
		hm.put("Java", "java");
		hm.put("Python", "py");
		hm.put("Dart","Dt");
		
		System.out.println(hm);
		//get
		System.out.println(hm.get("Python"));
		
		//keyset
		System.out.println(hm.keySet());  // key chya value
		
		//values 
		System.out.println(hm.values());
		
		//entry set
		System.out.println(hm.entrySet());
	}
}
//output
//{Java=java, Python=py, Dart=Dt}
//py
//[Java, Python, Dart]
//[java, py, Dt]
//[Java=java, Python=py, Dart=Dt]
