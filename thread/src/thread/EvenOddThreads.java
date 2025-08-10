package thread;

	public class EvenOddThreads {
	    public static void main(String[] args) {
	        Thread evenThread = new Thread(() -> {
	            for (int i = 2; i <= 20; i += 2) {
	                System.out.print(i + " ");
	            }
	        });

	        Thread oddThread = new Thread(() -> {
	            for (int i = 1; i < 20; i += 2) {
	                System.out.print(i + " ");
	            }
	        });

	        evenThread.start();
	        try {
	            evenThread.join();  // Wait for evenThread to finish
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        oddThread.start();
	    }
	}


