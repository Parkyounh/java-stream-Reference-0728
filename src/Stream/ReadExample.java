package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:/tmp/test1.db");
		while(true) {
			int data = is.read();
			if(data ==-1) //파일의 끝이 -1임 EOF
				break;
			System.out.println(data);
			
		}is.close(); 
	}
}
