import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Shape sh = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Choose a Shape [1.Rectangle | 2.Circle]: ");
		int shapeType = sc.nextInt();
		
		switch(shapeType) {
		  case 1:
			sh = new Rectangle("Blue", 15, 8);  
			break;
		  case 2:
			sh = new Circle("Red", 12.5f);  
			break;
		  default:
			  System.out.println("###--- INVALID SHAPE SELECTED ---###");
			  return;
		}//switch
		
		System.out.println("---------------------------------------------");
		System.out.println("\t SHAPE SELECTED: " + sh.getClass().getName().toUpperCase());
		System.out.println("---------------------------------------------");
		
		System.out.println("Color of Shape = " + sh.getColor());
		sh.setColor("Black");
		sh.area();
	}

}
