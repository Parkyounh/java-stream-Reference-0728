package classEd;

public class Computer {
	
	int sum(int ...val) {
		int sum =0;
		for (int v:val) {
			sum+=v;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Computer computer = new Computer();
		int ret = computer.sum(10,9,8,7,6,5,4,3,2,1);
		System.out.println(ret);
	}
}
