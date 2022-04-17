package co.edureka.util;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String, Float> bank = new TreeMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 25000f)); //null
		System.out.println(bank.put("Sunil", 12500.5f)); //25000.0
		System.out.println(bank.put("Anil", 25000f)); //null
		bank.put("Praveen", 45000f);
		bank.put("Rahul", 32500.5f);
		bank.put("Sanjay", 75000f);
		
		System.out.println(bank);

	}

}
