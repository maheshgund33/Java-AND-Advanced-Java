package Set;
import java.util.HashSet;
public class HashDemo {
	public static void main(String[] args) {
		HashSet hs= new HashSet();
		
		hs.add("Mahesh");
		hs.add("Gund");
		hs.add("Ashish");
		hs.add("Sontakke");
		hs.add("Nikhil");
		System.out.println("HashSet output:-"+ hs);
		
		
	}

}
//output
//HashSet output:-[Gund, Ashish, Nikhil, Mahesh, Sontakke]