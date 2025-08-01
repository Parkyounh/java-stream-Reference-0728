package Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveOrder {
	public static void main(String[] args) {
		Order order = new Order("ORD123","Notebook",5);
		
		try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c:/tmp/order.dat"))){  // 객체(파일)
			oos.writeObject(order);
			System.out.println("주문 객체가 파일에 저장되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
