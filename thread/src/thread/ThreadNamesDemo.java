package thread;

public class ThreadNamesDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }, "Scooby");

        Thread t2 = new Thread(() -> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }, "Shaggy");

        t1.start();
        t2.start();
    }
}
