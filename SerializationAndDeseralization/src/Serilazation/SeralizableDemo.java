package Serilazation;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SeralizableDemo {
	public static void main(String[] args) throws IOException {
		
		Player  obj = new Player(1,"Ruturaj");
		Player obj2= new Player(2,"Rhoit");
		
		FileOutputStream Es= new FileOutputStream("PlayerData.txt");
		
		ObjectOutputStream oor= new ObjectOutputStream(new FileOutputStream("PlayerData.txt"));
		
		oor.writeObject(obj);
		oor.writeObject(obj2);
		
		oor.close();
		Es.close();
		
	}

}

//output
//Excptiom