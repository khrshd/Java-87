package co.edureka;

public class WrapperTest1 {

	public static void main(String[] args) {
		Integer i = Integer.valueOf(25);
		
		System.out.println(i.byteValue());
		System.out.println(i.shortValue());
		System.out.println(i.intValue());
		System.out.println(i.longValue());
		System.out.println(i.floatValue());
		System.out.println(i.doubleValue());
	}
}
