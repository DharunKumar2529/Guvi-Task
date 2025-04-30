package task_6;

import java.util.Scanner;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getage() {
		return age;
	}


public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = scan.nextLine();
		
		System.out.print("Enter age: ");
		int age = scan.nextInt();
		
		Person person = new Person(name,age);
		
		System.out.println("Name: "+person.getName());
		System.out.println("Age: "+person.getage());
		
		scan.close();

	}
}
