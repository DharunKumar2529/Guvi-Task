package task_7;

public class Q2 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		
		try {
			System.out.println("Accessing 4th element of array: " + numbers[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Error: " + e.getMessage());
		}
		
		String text = "Hello";
		
		try {
			System.out.println("Accessing 10th character of string: " + text.charAt(9));
		}
		
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Error: " + e.getMessage());
		}

	}

}
