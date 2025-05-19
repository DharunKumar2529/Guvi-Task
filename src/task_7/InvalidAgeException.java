package task_7;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		
		try {
			int age = scan.nextInt();
			validateAge(age);
			System.out.print("You are Eligible");
		}
		catch(InvalidAgeException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error: Please enter a avalid integer for age");
		}
		finally {
		
		scan.close();

	}
}

	private static void validateAge(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Age must be 18 or older");
		}
		
	}
}

