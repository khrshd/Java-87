package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) throws InterruptedException {
		Set<String> names = new HashSet<String>();
		
		System.out.println(names.add("Praveen")); //true
		System.out.println(names.add("Praveen")); //false
		System.out.println(names.add("Pankaj")); //true
		names.add("Sanjay");
		names.add("Abraham");
		names.add("Rahul");
		names.add("Brigith");
		
		System.out.println(names);
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.print(name + "     ");
			Thread.sleep(1000);
		}
		System.out.println();
		names.add(null);
		System.out.println(names);
	}
}
