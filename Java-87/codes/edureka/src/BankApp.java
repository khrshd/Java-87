import java.util.Scanner;

public class BankApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		float amt;
		
		while (true) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Exit");

			System.out.println("------------------------------------------------------");
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			 case 1:
				if(acc == null) {
					System.out.print("enter a/c no: ");
					long acno = sc.nextLong();
					sc.nextLine();

					System.out.print("enter a/c holder's name: ");
					String name = sc.nextLine();

					System.out.print("enter initial deposit: ");
					float amount = sc.nextFloat();

					// --- create Account object
					acc = new Account(acno, name, amount);
					System.out.println("A/C OPENED ... WELCOME TO BANK!!!!");					
				} else {
					System.out.println("###--- YOU HAVE AN ACCOUNT WITH US ---###");						
				}
				break;
			 case 2:
				if(acc != null) {
					System.out.print("enter amount to deposit: ");
					amt = sc.nextFloat();
					acc.deposit(amt);
				}else {
					 System.out.println("###--- YOU DON'T HAVE AN ACCOUNT WITH US ---###");	
				}				 
				break;
			 case 3:
				if(acc != null) {
					System.out.print("enter amount to withdraw: ");
					amt = sc.nextFloat();
					acc.withdraw(amt);
				}else {
					System.out.println("###--- YOU DON'T HAVE AN ACCOUNT WITH US ---###");	
				}				 
				break;
			 case 4:
				if(acc != null) {
					acc.getBalance();
				}else {
				 System.out.println("###--- YOU DON'T HAVE AN ACCOUNT WITH US ---###");	
				}
				break;
			 case 5:
				System.out.println("$$$--- Application Designed & Develped by ---$$$");
				System.out.println("###--- team @ edureka ---###");
				System.exit(0); //to terminate application
				break;
			 default:
				System.out.println("@@@--- INVALID OPTION @@@ TRY AGAIN ---@@@");
			}//switch
			System.out.println("======================================================");
		}//while		
	}

}
