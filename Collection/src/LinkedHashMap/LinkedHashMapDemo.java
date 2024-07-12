package LinkedHashMap;
import java.util.*;
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		
		
		LinkedHashMap lhm = new LinkedHashMap();
		
		lhm.put("Mahesh","Wipro");
		lhm.put("Gund","Infosys");
		lhm.put("Mahesh"," Wipro");
		lhm.put("Ahish","TCS");
		lhm.put("Mayur", "Google");
		
		System.out.println("Linked Hash Map: "+ lhm);
	}

}
//output 
//Linked Hash Map: {Mahesh= Wipro, Gund=Infosys, Ahish=TCS, Mayur=Google}


///Map madhe iterator chalat nhi map set la convert karun iterator karta yeta