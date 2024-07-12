
public class Child1 extends Parent1 {
	
	int x=10;
	int y=20;
	
	Child1(){
		System.out.println("Child");
	}
	void access() {
		System.out.println(Parent1.x);
		System.out.println(Parent1.y);
		System.out.println(x);
		System.out.println(y);
	}

}
