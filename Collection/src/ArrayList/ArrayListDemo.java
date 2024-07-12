package ArrayList;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Object> arr= new ArrayList<>();
		arr.add(10);
		arr.add(20.5f);
		arr.add("Mahesh");
		arr.add("10");
		
		System.out.println("Out put of array is:- "+ arr);
	}
}

// Out put of array is:- [10, 20.5, Mahesh, 10]

//Diff opration on array:
//	2. arr.size()
//	3. arr.contains("Gund");
//    4. arr.indexof(10);
//    5. arr.lastindexof("10");
//    6. arr.get(3);
//    7. arr.set(1,"Mahesh");
//    8. arr.add(2,"add element");
//    9. arr.remove(4);
//    10. arr.remove(4,"Mahesh");
//    11. arr.area(arr2);
//    12. arr.addAll(3,arr2);
//    13. arr.removerange(3,6);
//    14.