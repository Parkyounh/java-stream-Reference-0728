package classEd;

public class Single1Ex {
	public static void main(String[] args) {
		Single1 sg = Single1.getInstance();
		Single1 sg1 = Single1.getInstance();
		
		if(sg == sg1) {
			System.out.println("같은 객체");
		}
	}
}
