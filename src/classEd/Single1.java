package classEd;

public class Single1 {
	private static Single1 s1 = new Single1();
	
	private Single1() {
		
	}
	
	static Single1 getInstance() {
		
		
		return s1;
	}
	
	
}
