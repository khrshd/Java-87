import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 3 numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int lar;
		/*
		if(x > y) {
			if(x > z) {
				lar = x;
			}else {
				lar = z;
			}
		}
		else {
			if(y > z) {
				lar = y;
			}else {
				lar = z;
			}				
		}
		*/
		
		lar = (x>y)?(x>z?x:z):(y>z?y:z);
		
		System.out.println("Largest of ("+x+", "+y+", "+z+") is " + lar);
	}

}
