package co.edureka;

import co.edureka.services.Nums;

public class PackTest {

	public static void main(String[] args) {
		System.out.println("package example");
		
		Nums obj = new Nums();
		obj.add(10, 20);
		
		System.out.println("diff = " + obj.sub(12.5f, 10.4f));

	}

}
