package learn;
import java.util.Scanner;
import java.util.HashMap;

public class Occurence {
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String input = sc.nextLine();
		
		System.out.println("Enter the char:");
		Character c = sc.next().charAt(0);
		
		HashMap<Character,Integer> freqMap = new HashMap<>();
		
		for(char ch : input.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
		}
		
		if(freqMap.containsKey(c)) {
			int value = freqMap.get(c);
			System.out.println("Frequency of " +c+ " is:" +value);
		}
		
	}

}
