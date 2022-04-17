package co.edureka.io;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class WriteFile1 {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("src/co/edureka/io/edureka1.txt");
			
		String str = "World’s #1 E-Learning Platform. Edureka's online training helps you land your dream job. "
				+ "Best-selling technology certification courses co-created with global industry experts. "
				+ "Flexible Batch Timings. Expert Educators. Instructor-led Classes. 24/7 Lifetime Support.\n\n";
		
		fw.write(str);
		
		System.out.println("file saved");
		
		fw.close();

	}

}
