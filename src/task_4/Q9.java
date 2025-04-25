package task_4;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		if (age >=60) {
			System.out.println("The Person is a Senoir Citizen");
		}
		else {
			System.out.println("The Person not a Senior Citizen");
		}
			

	}

}
