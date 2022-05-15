class Except3 
{
	public static void main(String[] args) 
	{
      try{
		int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
		int z = x / y;
		System.out.println(x + " / " + y + " = " + z);
      }
      catch(ArithmeticException ex){
		 System.out.println("error -> cannot divide an integer by 0"); 
	  }
	  System.out.println("--- done ---");
	}
}
