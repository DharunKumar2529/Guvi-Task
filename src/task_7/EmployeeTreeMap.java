package task_7;

import java.util.*;

public class EmployeeTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> employees = new TreeMap<>();
		
		employees.put(101, "Dharun");
		employees.put(102, "Akshaya");
		employees.put(103, "Nithulan");
		
		List<String> names = new ArrayList<>(employees.values());
		
		Collections.sort(names);
		
		System.out.println("Employee names in alphabetical order: ");
		for (String name : names) {
			System.out.println(name);
		}

	}

}
