package HashMap;
import java.util.*;
public class HashMapDemo1 {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("Mahesh", "Katalwedhe");
		hm.put("Omkar", "Kaknewadi");
		hm.put("Mayur", "Chakan");
		hm.put("Amol", "Ahmednagar");
		hm.put("Rohit", "Chakan");
		
		System.out.println(hm);
	}
	

}
//output
//{Rohit=Chakan, Omkar=Kaknewadi, Amol=Ahmednagar, Mayur=Chakan, Mahesh=Katalwedhe}