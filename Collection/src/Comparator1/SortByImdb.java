package Comparator1;

import java.util.Comparator;

public class SortByImdb implements Comparator<Movie>{
	
	public int compare(Movie obj1,Movie obj2) {
		return (int) (obj1.Imdb-obj2.Imdb);
	}
	

}
