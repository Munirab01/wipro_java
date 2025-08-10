package fourth_java;
import java.util.Scanner;

public class Add_last {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	  System.out.println("Enter first digit:");
	  int n1 = sc.nextInt();
	  
	  System.out.println("Enter second digit:");
	  int n2 = sc.nextInt();
	  
	  int ans = 0;
	  
	  
		  int digit1 = n1%10;
		  int digit2 = n2%10;
		  
		  ans = digit1 + digit2;
	  
	  System.out.println("Answer is:" + ans);
   }
}
