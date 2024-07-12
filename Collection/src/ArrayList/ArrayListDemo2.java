package ArrayList;
import java.util.ArrayList;
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList arr= new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(new Integer(40));
		arr.add(30);
		
		
//		for(Object obj:arr) {
//			System.out.println(obj);
//		}
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		
		
	}

}

//out put
//10
//20
//30
//40
//30

