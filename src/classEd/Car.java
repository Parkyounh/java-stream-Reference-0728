package classEd;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("가스 없음");
			return false;
		}
		System.out.println("가스 있음");
		return true;
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(잔량:"+gas+")");
				gas-=1;
			}else {
				System.out.println("멈춥니다.(잔량:"+gas+")");
				return;
			}
		}
	}
}
