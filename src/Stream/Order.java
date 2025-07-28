package Stream;

import java.io.Serializable;

public class Order implements Serializable{   //객체화 해서 파일 저장
	//scanner를 사용해서 주문 정보를 입력 받아서 파일에 저장하고 파일의 내용을 출력하는 자바 프로그램
	private String orderId;
	private String product;
	private int quantity;
	
	public Order(String orderId, String product, int quantity) {
		this.orderId = orderId;
		this.product = product;
		this.quantity = quantity;
	}
	
	public void print() {
		System.out.println("Order ID: "+orderId);
		System.out.println("Product: "+product);
		System.out.println("Quantity:"+quantity);
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
