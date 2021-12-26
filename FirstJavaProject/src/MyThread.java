
public class MyThread extends Thread{
	@Override
	public void run() {
		// For task 16. check if thread is a deamon
		if(this.isDaemon()) {
			System.out.println("This is a deamon thread that is running");
		}
		else {
			System.out.println("This is a user thread that is running");
		}
		
		// Count down for task 17. and wait 1 second every time
		for(int i = 5; i > 0; i--) {
			System.out.println("Thread 1: " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread 1 is finished");
	}
}
