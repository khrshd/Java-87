package co.edureka;

import static java.lang.Math.*;
import static java.lang.System.out;

public class MathTest {

	public static void main(String[] args) {
		out.println(E);
		out.println(PI);
		
		out.println(sqrt(25));
		out.println(floor(10.9)); //10.0
		out.println(ceil(10.1));//11.0
		out.println(round(10.553));
		
		out.println(sin(0));
		out.println(cos(0));
		
		out.println(min(10, 20));
		out.println(max(10, 20));
		
		double random = random();
		out.println(random);
		int otp = (int)(random * 10000);
		out.println("OTP = " + otp);
	}
}
