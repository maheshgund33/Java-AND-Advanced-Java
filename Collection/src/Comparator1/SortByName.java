package Comparator1;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class SortByName implements Comparator<Movie> {
	
	public int compare(Movie obj1,Movie obj2) {
		return obj1.mname.compareTo(obj2.mname);
	}

	
	
	

}
