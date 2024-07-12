package NumberFormatExcpetion;

public class Parent  {
	
	public static void main(String[] args) {
		Child obj= new Child();
		obj.show();
	}

}


//output 
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	This method must return a result of type String
//
//	at NumberFormatExcpetion.Child.show(Child.java:5)
//	at NumberFormatExcpetion.Parent.main(Parent.java:7)
