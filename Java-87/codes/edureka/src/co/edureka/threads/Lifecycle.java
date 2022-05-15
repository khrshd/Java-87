package co.edureka.threads;

public class Lifecycle {

	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		
		for(int i=1; i<=10; i++) {
			System.out.println(t.getName() + " -- " + i);
			Thread.sleep(1000);
			if(i == 4)
				t.stop();
		}
	}

}
