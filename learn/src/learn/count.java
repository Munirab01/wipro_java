package learn;
import java.util.Scanner;

public class count {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int length = s.length();
		int upperCase = 0;
		int lowerCase = 0;
		int special = 0;
		int digit = 0;
		
		for(char c: s.toCharArray()) {
			if(Character.isUpperCase(c)) {
				upperCase++;
			}
			else if(Character.isLowerCase(c)) {
				lowerCase++;
			}
			else if(Character.isDigit(c)) {
				digit++;
			}
			else {
				special++;
			}
		}
		
		 System.out.println("Uppercase %" + (upperCase*100)/length);
		 System.out.println("Lowercase %" + (lowerCase*100)/length);
		 System.out.println("digit %" + (digit*100)/length);
		 System.out.println("special char %" + (special*100)/length);
	}
}
