package task_5;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter the month number (1-12): ");
		int month = scan.nextInt();
		
		System.out.print("Enter the room rent perday: ");
		float rent = scan.nextFloat();
		
		System.out.print("Enter the number of days stayed: ");
		int numberofdays = scan.nextInt();
		
		if (month == 4 || month == 5 || month == 6 || month == 11 || month == 12) {
			rent = rent * 1.2f;
		}
		
		float total = rent * numberofdays;
		System.out.printf("%.2f", total);
		
		scan.close();

	}

}
