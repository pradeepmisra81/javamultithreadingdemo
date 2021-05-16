package thread.creation.example2;

public class Main2 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				// Code that will run in a new thread
				throw new RuntimeException("Intentional Exception");
			}
		});
		
		thread.setName("Misbehaving thread");
		
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				// TODO Auto-generated method stub
				System.out.println("A critical error happened in thread " + t.getName()
                + " the error is " + e.getMessage());
				
			}
		});
		
		thread.start();

	}

}
