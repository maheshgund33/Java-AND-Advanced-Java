package Deserilization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.IOException;

public class Demo throws IOExcpetion {
	

	FileOutputStream Es= new FileOutputStream("PlayerData.txt");
	
	ObjectOutputStream oor= new ObjectOutputStream(new FileOutputStream("PlayerData.txt"));
	
	Player obj1 = (Player)oor.readObject();
	Player obj2 = (Player)oor.readObject();
	
	
	oor.close();
	oor.close();
	
	System.out.println("Jemo"+ obj1.jerNo);
	System.out.println("Sam"+ obj1.jerNo);
	
	
	System.out.println("Leo"+ obj2.jerNo);
	System.out.println("Yeu"+ obj2.jerNo);

}
