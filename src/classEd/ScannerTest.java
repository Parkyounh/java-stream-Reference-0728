package classEd;

import java.util.Scanner;

public class ScannerTest {
	String str;
	
	void method(Scanner sc) {
		System.out.println("입력>");
		str = sc.nextLine();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ScannerTest st = new ScannerTest();
		st.method(sc);
		System.out.println(st.str);
	}
}

