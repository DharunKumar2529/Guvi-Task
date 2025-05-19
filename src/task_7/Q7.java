package task_7;

import java.util.*;

public class Q7 {

	public static void main(String[] args) {
		
		List<String> itemList = new ArrayList<>();
		
		itemList.add("Dharun");
		itemList.add("Akshaya");
		itemList.add("Nithulan");
		
		String[] itemArray = itemList.toArray(new String[0]);
		
		System.out.println("Array elements: ");
		for (String item : itemArray) {
			System.out.println(item);
		}

	}

}
