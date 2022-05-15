package co.edureka.threads;
class Naturals extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" - " + i);
		}
	}
}

class Evens extends Thread{
	public void run() {
		for(int i=2;i<=20;i+=2) {
			System.out.println(Thread.currentThread().getName()+" - " + i);
		}
	}
}

public class ThreadTest3 {

	public static void main(String[] args) {
		Naturals nat = new Naturals();
		Evens eve = new Evens();
		
		nat.setName("NATURAL");
		eve.setName("EVEN   ");
		
		nat.start();
		eve.start();
	}

}
