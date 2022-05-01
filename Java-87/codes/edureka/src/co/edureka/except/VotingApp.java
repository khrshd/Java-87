package co.edureka.except;

import java.util.Scanner;

public class VotingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String req = "Y";
		
		while(req.equalsIgnoreCase("Y")) {
		  try {	
			System.out.print("enter age of voter: ");
			int age = sc.nextInt();
			
			if(age < 18)
				throw new InvalidAgeException("age should be >= 18");
			
			System.out.println("$--- VOTING DONE <beep> <beep>");
		  }catch(Exception ex) {
			  System.out.println("ERROR --> " + ex.toString());
		  }
		  System.out.print("anyone else in queue[Y/N]: ");
		  req= sc.next();
		}//while

	}

}
