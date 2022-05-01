package co.edureka.util;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>();
		
		System.out.println(names.add("Praveen")); //true
		System.out.println(names.add("Praveen")); //false
		System.out.println(names.add("Pankaj")); //true
		names.add("Sanjay");
		names.add("Abraham");
		names.add("Rahul");
		names.add("Brigith");
		
		System.out.println(names);
	}
}
