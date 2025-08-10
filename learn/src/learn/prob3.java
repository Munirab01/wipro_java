package learn;
import java.util.Scanner;

public class prob3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println(2);
		}
		else {
			System.out.println(1);
		}
	}
}
