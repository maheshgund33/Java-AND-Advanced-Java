package Comparator1;

import java.util.Comparator;

public class SortBytotcoll implements Comparator<Movie>{
	
	public int compare(Movie obj1,Movie obj2) {
		return (int) (obj1.totcoll-obj2.totcoll);
	}
}
