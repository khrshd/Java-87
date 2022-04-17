package co.edureka.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println(names + " | size=" + names.size());
		System.out.println("is list empty = " + names.isEmpty());
		
		names.add("Anil");
		names.add("Anil");
		names.add("Charles");
		names.add("Anil");
		names.add("Chris");
		names.add("Mark");
		names.add("Sanjay");
		
		System.out.println(names + " | size=" + names.size());
		names.add(1, "Praveen");
		names.set(3, "CHARLES");
		System.out.println(names + " | size=" + names.size());
		
		System.out.println("is \"Anil\" in list = " + names.contains("Anil"));
		
		System.out.println("location of \"Anil\" = " + names.indexOf("Anil"));
		System.out.println("location of \"Anil\" from last = " + names.lastIndexOf("Anil"));
		
		System.out.println("person at index 1 = " + names.get(1));
		
		System.out.println(names.remove(0)); //Anil
		System.out.println(names.remove("Anil")); //true
		
		System.out.println(names + " | size=" + names.size());
		
		names.sort(null); //null --- java.util.Comparator
		System.out.println(names);
	}

}
