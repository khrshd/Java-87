package co.edureka.util;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
		
		System.out.println(names.add("Praveen")); //true
		System.out.println(names.add("Praveen")); //false
		System.out.println(names.add("Pankaj")); //true
		names.add("Sanjay");
		names.add("Abraham");
		names.add("Rahul");
		names.add("Brigith");
		
		System.out.println(names);
		
		names.add(null); //java.lang.NullPointerException		
	}

}
