package co.edureka.threads;

class MyThread extends Thread
{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);		
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		System.out.println("no of active threads = " + Thread.activeCount());
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		MyThread thread = new MyThread();
		thread.start();
		
		System.out.println("no of active threads = " + Thread.activeCount());
	}
}

