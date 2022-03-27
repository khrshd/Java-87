
public class IntegerTypes {

	public static void main(String[] args) {
		//byte b = 128; //Type mismatch: cannot convert from int to byte
		byte b = 127;
		System.out.println(b);
		System.out.println("maximum int value = " + Integer.MAX_VALUE);
		
		//long pop = 8457458;
		//long pop = 2147483647;
		long pop = 2147483648L;
		System.out.println("world population = " + pop);
		
		int n = (int)12L;
		System.out.println(n);
	}

}
