package task_5;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		boolean isPalindrome = true;
		for(int i=0; i<str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() -1 -i)) {
				isPalindrome = false;
				break;
				
			}
		}
			if (isPalindrome) {
				System.out.println("This string is a Palindrome");
			}
			else {
				System.out.println("This string is not a palindrome");
			}
			scan.close();
		
	}

}
