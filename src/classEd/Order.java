package classEd;

public class Order {

	private OrderStatus status;
	
	public Order() {          // enum = 주로 상태정보 사용 많음
		status = OrderStatus.PENDING;
	}
	
	public void nextStatus() {
		switch(status) {
			case PENDING:
				status = OrderStatus.PROCESSING;
				break;
			case PROCESSING:
				status = OrderStatus.SHIPPED;
				break;
			case SHIPPED:
				status = OrderStatus.DELIVERD;
				break;
			case DELIVERD:
				System.out.println("이미 완료");
				break;
		}
	}
	
	public void printStatus() {
		System.out.println("현재 주문 상태" + status);
	}
}
