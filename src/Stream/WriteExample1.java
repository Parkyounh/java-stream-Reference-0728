package Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample1 {
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("c:/tmp/test8.txt");
		
		char[] array = {'A','B','C'};
		writer.write(array);
		
		writer.flush();
		writer.close();
	}
}
