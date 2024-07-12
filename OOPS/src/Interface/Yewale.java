package Interface;

interface  Yewale {
	
	void  MakingTea();  // withiout body interface 
	
	default void Makingtea() {
		System.out.println("With Body Interface use Static & default keywords");
	}
	
	

}
