package task_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		String fileName =  "data.txt";
		
		try {
			File file = new File(fileName);
			Scanner scan = new Scanner(file);
			
			System.out.println("File contents: ");
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
			scan.close();
		}catch (FileNotFoundException e) {
			System.out.println("Error: File \"" + fileName + "\" not found");
		}

	}

}
