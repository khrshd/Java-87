package co.edureka;

import co.edureka.services.Nums;
import co.edureka.services.NumsServiceLocator;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		NumsServiceLocator locator = new NumsServiceLocator();
		Nums ref = locator.getNums();
		
		System.out.println("sum = " + ref.add(10, 20));
		System.out.println("diff = " + ref.sub(20, 10));
	}

}
