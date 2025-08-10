package learn;

import java.util.Scanner;
import java.util.Arrays;

public class multi {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number of elements for array 1");
	int n1 = sc.nextInt();
	
	int[] arr1= new int[n1];
	
	System.out.println("enter " + n1 + " elements");
	for(int i=0;i<n1;i++) {
		arr1[i] = sc.nextInt();
		}
	
	System.out.println("Enter number of elements for array 2");
	int n2 = sc.nextInt();
	
	int[] arr2= new int[n2];
	
	System.out.println("enter " + n2 + " elements");
	for(int i=0;i<n2;i++) {
		arr2[i] = sc.nextInt();
		} 
	
	int i =0;
	int j =0;
	int k =0;
	
	int arr3[] = new int[n1];
	while(i<n1 && j<n2 && k<n2) {
		arr3[k] = arr1[i]*arr2[j];
		i++;
		j++;
		k++;
	}
	
	System.out.println(Arrays.toString(arr3));
	
	}
}