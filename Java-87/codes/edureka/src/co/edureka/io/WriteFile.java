package co.edureka.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception{
		//FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt", true);
		
		String str = "World’s #1 E-Learning Platform. Edureka's online training helps you land your dream job. "
				+ "Best-selling technology certification courses co-created with global industry experts. "
				+ "Flexible Batch Timings. Expert Educators. Instructor-led Classes. 24/7 Lifetime Support.\n\n";
		
		byte[] b = str.getBytes();
		fout.write(b);
		
		System.out.println("file saved");
		
		fout.close();
	}
}
