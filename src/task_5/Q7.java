package task_5;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = scan.nextInt();
		
		System.out.print("Enter second number: ");
		int b = scan.nextInt();
		
		System.out.print("Enter third number: ");
		int c = scan.nextInt();
		
		int largest;
		
		if (a>=b && a>=c) {
			largest = a;
		}
		else if (b>=a && b>=c) {
			largest = b;
		}
		else {
			largest = c;
		}
		System.out.println("The largest number is: " +largest);
		scan.close();

	}

}
