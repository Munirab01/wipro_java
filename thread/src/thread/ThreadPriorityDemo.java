package thread;

public class ThreadPriorityDemo {
	public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("MAX priority thread running");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("NORM priority thread running");
        });

        Thread t3 = new Thread(() -> {
            System.out.println("MIN priority thread running");
        });

        t1.setPriority(Thread.MAX_PRIORITY);   // 10
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MIN_PRIORITY);   // 1

        t1.start();
        t2.start();
        t3.start();
    }
}
