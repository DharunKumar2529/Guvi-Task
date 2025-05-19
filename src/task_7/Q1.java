package task_7;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Enter the first integer: ");
			int num1 = scan.nextInt();
			
			System.out.print("Enter the second integer: ");
			int num2 = scan.nextInt();
			
			int result = num1/num2;
			System.out.print("Result: " + result);
		}
		catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed");
		}
		catch (Exception e) {
			System.out.println("Error: Invalid input");
		}
		finally {
			scan.close();
		}

	}

}
