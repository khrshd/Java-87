class SBI implements Bank 
{
  public void deposit(float amt){
	  System.out.println("Rs."+amt+" Credited to SBI Bank");
  }

  public void withdraw(float amt){
	  System.out.println("Rs."+amt+" Debited from SBI Bank");
  }
}
