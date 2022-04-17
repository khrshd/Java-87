class Except4 
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
      catch(ArrayIndexOutOfBoundsException ex){
		 System.out.println("error -> please provide minimum 2 cmd args"); 
	  }
      catch(NumberFormatException ex){
		 System.out.println("error -> please provide int type data as cmd args"); 
	  }
	  System.out.println("--- done ---");
	}
}
