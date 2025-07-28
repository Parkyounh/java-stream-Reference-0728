package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class OrderService {	//scanner를 사용해서 주문 정보를 입력 받아서 파일에 저장하고 파일의 내용을 출력하는 자바 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String orderId;
		String product;
		int quantity;
		boolean run = false;
		
		Order order =null;
		
		while(!run) {
			System.out.println("---------------------------------------------");
			System.out.println("1. 주문입력 | 2. 주문저장 | 3. 주문 불러오기 | 4. 종료");
			System.out.println("---------------------------------------------");
			System.out.print("입력>");
			int num= Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1:
				System.out.print("아이디를 입력>");
				orderId =sc.nextLine();
				
				System.out.print("상품명을 입력>");
				product =sc.nextLine();
				
				System.out.print("수량 입력>");
				quantity =Integer.parseInt(sc.nextLine());
				
				order = new Order(orderId,product,quantity);
				break;
			case 2:  //파일로 저장
				try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c:/tmp/order.dat"))){  // 객체(파일)
					oos.writeObject(order);
					System.out.println("주문 객체가 파일에 저장되었습니다.");
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 3: //읽어오기
				try (ObjectInputStream ois= new ObjectInputStream(new FileInputStream("c:/tmp/order.dat"))){
					order = (Order)ois.readObject();
					System.out.println("파일에서 주문 객체를 읽어왔습니다.");
					order.print();
				} catch (IOException| ClassNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				run = false;
				return;
			default:
				continue;
			}
		}

	}
}

