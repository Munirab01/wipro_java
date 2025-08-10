package learn;
import java.util.Scanner;

	class Student {
	     String name;
	     int roll_no;
	     double percentage;
	}

	public class Main{
		public static void main(String[] args) {
			final int n = 4;
			Student[] students = new Student[n];
			Scanner sc = new Scanner(System.in);
			
			
			for(int i=0;i<n;i++) {
				System.out.println("Details of Student " + (i+1) + " are :");
				
				students[i] = new Student();
				
				System.out.println("Enter the name of student:");
				students[i].name = sc.nextLine(); 
				
				System.out.println("Roll no is:");
				students[i].roll_no = sc.nextInt();
				
				System.out.println("Percentage is:");
				students[i].percentage = sc.nextDouble();

				sc.nextLine();
			}
			
			for(int i=0;i<n;i++) {
				System.out.println("Student " + (i + 1) + ":");
	            System.out.println("Name: " + students[i].name);
	            System.out.println("Roll No: " + students[i].roll_no);
	            System.out.println("Percentage: " + students[i].percentage);
	            System.out.println();
			}
			
			sc.close();
		}	
	}

