package com.w3schools.www.xml;

public class App {

	public static void main(String[] args) throws Exception{
		TempConvertLocator locator = new TempConvertLocator();
		TempConvertSoap ref = locator.getTempConvertSoap();
		
		String cel = "37";
		String fah = ref.celsiusToFahrenheit(cel);
		
		System.out.println(cel+"C = " + fah+"F");
	}
}
