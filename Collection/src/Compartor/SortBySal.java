package Compartor;

import java.util.Comparator;

public class SortBySal implements Comparator<Employee> {
	public int compare(Employee obj1, Employee obj2) {
	return  (int) (obj1.sal-obj2.sal);
   }
 
}
