package fourth_java;
import java.util.Scanner;

public class phone_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the phone number:");
		String input = sc.nextLine();
		
		try {
			String result = convertToDigits(input);
			System.out.println(result);
		}
		catch(IllegalArgumentException e) {
			System.out.println("error " + e.getMessage());
		}
		
	}
	
	public static String convertToDigits(String input) {
		StringBuilder digits = new StringBuilder();
		
		for(char ch : input.toCharArray()) {
			if(Character.isDigit(ch)) {
				digits.append(ch);
			}else if(Character.isLetter(ch)) {
				digits.append(mapCharToDigit(Character.toUpperCase(ch)));
			}else if(!Character.isWhitespace(ch)) {
				throw new IllegalArgumentException("invalid character");
			}
		}
		
		if(digits.length() != 10) {
			throw new IllegalArgumentException("should be exactly 10 values");
		}
		
		return "(" + digits.substring(0,3) + ")" + digits.substring(3,6) + "-" + digits.substring(6);
	}
	
	public static char mapCharToDigit(char ch) {
		if("ABC".indexOf(ch)>=0) return '2';
		else if ("DEF".indexOf(ch)>=0) return '3';
		else if ("GHI".indexOf(ch)>=0) return '4';
		else if ("JKL".indexOf(ch)>=0) return '5';
		else if ("MNO".indexOf(ch)>=0) return '6';
		else if ("PQR".indexOf(ch)>=0) return '7';
		else if ("STU".indexOf(ch)>=0) return '8';
		else if ("WXYZ".indexOf(ch)>=0) return '9';
		
		else throw new IllegalArgumentException("invalid letter");
	}
}
