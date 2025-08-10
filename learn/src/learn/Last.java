package learn;
import java.util.Scanner;

public class Last {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter digit1: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter digit2: ");
		int n2 = sc.nextInt();
		
		if(n1%10 == n2%10) {	
			System.out.println("true");
        }
		else {
			System.out.println("false");
		}
}
}