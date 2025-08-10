package learn;
import java.util.HashMap;

public class map {
	public static void main(String args[]) {
		String s = "WHO ARE YOU";
		
		HashMap<Character,Character> map = new HashMap<>();
		
		map.put('W','X');
		map.put('H','A');
		map.put('O','Z');
		map.put('A','B');
		map.put('R','H');
		map.put('E','J');
		map.put('Y','K');
		map.put('U','Q');
		
		StringBuilder encoded = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			if(c == ' ') {
				encoded.append(' ');
			}
			else {
				encoded.append(map.get(c));
			}
		}
		
		 System.out.println("Original: " + s);
	     System.out.println("Encoded : " + encoded.toString());  
	}
}
