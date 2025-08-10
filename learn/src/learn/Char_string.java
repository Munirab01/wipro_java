package learn;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Char_string {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.replaceAll("\\s","").toLowerCase();
		
		HashMap<Character,Integer> freqMap = new HashMap<>();
		
		for(char c : input.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c,0)+1);
		}
		
		System.out.println("Char freq is:");
		for(Map.Entry<Character,Integer> entry : freqMap.entrySet()) {
			System.out.println(entry.getKey() +":"+ entry.getValue());
		}
	}
}
