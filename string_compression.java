package fourth_java;
import java.util.Scanner;

public class string_compression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of characters");
		int n = sc.nextInt();
		char[] arr = new char[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter character" +i);
			arr[i] = sc.next().charAt(0);
		}
		
		int newLength = CompressString(arr);
		for(int i=0;i<newLength; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static int CompressString(char[] chars) {
		int i = 0;
		int ansIndex = 0;
		
		while(i<chars.length) {
			int j = i+1;
			while(j<chars.length && chars[j]==chars[i]) {
				j++;
			}
			
			chars[ansIndex++] = chars[i];
			
			int count = j-i;
			if(count>1) {
				for(char c : String.valueOf(count).toCharArray()) {
					chars[ansIndex++] = c;
				}
			}
			i=j;
		}
		return ansIndex;
	}
}

