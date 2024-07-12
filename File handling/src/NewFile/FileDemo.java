package NewFile;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class FileDemo {
 
	
	public static void main(String[] args) throws IOException {
		
		File obj = new File("FileFromFileHandling.txt"); // not created file 
		
	
			obj.createNewFile();// create new file 
		
	}
}

// output 
// txt file create keli aseel 