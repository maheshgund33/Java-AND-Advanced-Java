package HashSet1;
import java.util.*;
public class Criplayer extends HashSetDemo{
	int jerNo;
    String name;
    
    public Criplayer(int jerNo, String name) {
    	this.jerNo= jerNo;
    	this.name=name;
    	
    }
    @Override
    public String toString() {
        return "Criplayer{" + "jerNo=" + jerNo + ", name='" + name + '\'' + '}';
    }

    
}
