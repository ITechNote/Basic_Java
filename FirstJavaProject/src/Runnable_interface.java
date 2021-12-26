
public class Runnable_interface implements Runnable { // Using Runnable.class interface
	@Override
	public void run() {
		// Count down for task 17. and wait 1 second every time
		for(int i = 0; i < 5; i++) {
			System.out.println("Thread 2: " + i);
			
			// Test if another thread will keep going if thread2 got interrupt
//			System.out.println(1/0);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread 2 is finished");
	}
}
