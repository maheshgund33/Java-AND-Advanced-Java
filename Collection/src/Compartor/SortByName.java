package Compartor;
import java.util.*;
public class SortByName implements Comparator<Employee>{
	
	
	public int compare(Employee obj1,Employee obj2) {
		return obj1.empName.compareTo(obj2.empName);
	}

	
	
	
}
