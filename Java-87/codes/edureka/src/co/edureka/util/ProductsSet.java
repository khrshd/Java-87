package co.edureka.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProductsSet {

	public static void main(String[] args) throws InterruptedException {
		
		Set<Product> products = new TreeSet<Product>(new ProductComparator());
		
		Product product1 = new Product(187, "Mouse", 257.50f);
		Product product2 = new Product(193, "Monitor", 7500f);
		Product product3 = new Product(154, "Keyboard", 375.50f);
		Product product4 = new Product(125, "Speaker", 14500f);
		
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		
		Iterator<Product> it = products.iterator();
		
		while(it.hasNext()) {
			Product p = it.next();
			System.out.println(p);
			Thread.sleep(1000);
		}
	}
}

class ProductComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {		
		//return -1;
		//return o1.getProductId()-o2.getProductId();
		return o1.getProductName().compareTo(o2.getProductName());
	}
	
}
