package task_5;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number for pattern: ");
		int n = scan.nextInt();
		int number = 1;
		
		for(int i=1;i <=n; i++)
		{
			
			for(int j=1; j <=i; j++) {
				
				System.out.print(number + " ");
				number++;
		
			}
			System.out.println();
		}	
		
	scan.close();
	}

}
