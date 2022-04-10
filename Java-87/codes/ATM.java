import java.util.Scanner;

class ATM 
{
	public static void main(String[] args) 
	{
		Bank card = null;
		Scanner sc = new Scanner(System.in);

		System.out.print("which Bank's card[1.SBI | 2.ICICI]: ");
		int bankType = sc.nextInt();

		switch(bankType){
			case 1:
				card = new SBI();
				break;
			case 2:
				card = new ICICI();
				break;
			default:
				System.out.println("CARD READ ERROR xxxxx TRY AGAIN");
				return;
		}

		System.out.println("====================================================");
		System.out.println("\t\t WELCOME TO "+card.getClass().getName().toUpperCase()+ " BANK");
		System.out.println("====================================================");

		card.deposit(1000);
		card.withdraw(500);
		System.out.println("====================================================");
	}
}
