package classEd;

public class ClassName {
	int field1;       //인스턴스 멤버
	void method1() {
		field1 = 1;
	}
	
	static int field2;       //static 멤버
	static void method2() {
		System.out.println("1");
	}
	public static void main(String[] args) {
		method2();
		
		ClassName cn = new ClassName(); 
	}
	
}
