package GarbageCollectorWeakHashMap;

public class Demo extends GCDemo {
	String str;
	
    Demo(String str){
	this.str=str;
	
      }
   public String toString() {
	return str;
	
    }
    public void finalize() {          // Desructor 
	System.out.println("Notify");
    }

}
