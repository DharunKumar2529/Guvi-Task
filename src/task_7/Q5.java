package task_7;

import java.util.ArrayList;

public class Q5 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Dharun");
		names.add("Akshaya");
		names.add("Nithulan");
		
		System.out.println("ArrayList before removing elements: " + names);
		
		names.clear();
		
		System.out.println("ArrayList after removing elements: " + names);

	}

}
