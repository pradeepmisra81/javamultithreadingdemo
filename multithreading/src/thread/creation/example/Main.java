package thread.creation.example;

public class Main {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				// code that will run in new thread
				System.out.println("We are now in thread"+ Thread.currentThread().getName());
			}
		});
		
		System.out.println("We are in thread "+ Thread.currentThread().getName()+ " before starting a new thread");

		thread.start();
		
		System.out.println("We are in thread "+ Thread.currentThread().getName()+ " after starting a new thread");
		
		//Thread.sleep( millis: 1000);
	}

}
