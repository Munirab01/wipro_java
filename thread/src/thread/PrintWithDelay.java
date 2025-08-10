package thread;

public class PrintWithDelay extends Thread {
	public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                try {
                    Thread.sleep(5000); // 5 second delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
	}
	
	public static void main(String[] args) {
	    new PrintWithDelay().start();
	}
}

