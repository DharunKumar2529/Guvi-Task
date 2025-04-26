package task_5;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		
		String str1 = scan.nextLine();
		String str2="";
		
		for(int i=str1.length() -1; i>=0; i--) {
			
			str2 += str1.charAt(i);
		}
		System.out.println("Reversed string: " +str2);
		
		scan.close();
	}

}
