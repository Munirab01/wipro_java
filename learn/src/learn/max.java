package learn;
import java.util.Scanner;

public class max {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		
		int[] arr= new int[n];
		
		System.out.println("enter " + n + " elements");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		for(int i =0;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		//System.out.println("max element is:"+ max);
		
		for(int i=0;i<n;i++) {
			arr[i] = arr[i]-max;
		}
		for(int i=0;i<n;i++) {
			System.out.println("new array is:" + arr[i]);
		}
		sc.close();
	}
}
