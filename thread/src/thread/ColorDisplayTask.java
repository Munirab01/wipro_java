package thread;
import java.util.Random;

public class ColorDisplayTask implements Runnable {
	    String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
	    Random rand = new Random();

	    @Override
	    public void run() {
	        while (true) {
	            int index = rand.nextInt(colours.length);
	            String color = colours[index];

	            System.out.println("Color: " + color);

	            if (color.equals("red")) {
	                System.out.println("Red encountered. Stopping thread.");
	                break;
	            }

	            try {
	                Thread.sleep(500); // Slow it down a bit
	            } catch (InterruptedException e) {
	                System.out.println("Thread interrupted.");
	                break;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        ColorDisplayTask task = new ColorDisplayTask();
	        Thread thread = new Thread(task);
	        thread.start();
	    }
	}

