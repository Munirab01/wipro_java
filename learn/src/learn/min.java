package learn;
import java.util.Scanner;
import java.util.Arrays;

public class min {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		
		int[] arr= new int[n];
		
		System.out.println("enter " + n + " elements");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		} 
		
		int mini = arr[0];
		for(int i=0;i<n;i++) {
			if(mini>arr[i]) {
				mini = arr[i];
			}
		}
		
		for(int i =0;i<n;i++) {
			arr[i] *= mini;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
