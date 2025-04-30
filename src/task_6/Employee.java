package task_6;

import java.util.Scanner;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getid() {
		return id;
	}

	public String getfirstName() {
		return firstName;
		
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public int salary() {
		return salary;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualsalary() {
		return salary*12;
	}
	
	public int raiseSalary(int percent) {
		salary +=(salary * percent)/100;
		return salary;
	}
	
	public String toString() {
		return "Employee id=" + id + ",name=" +getName() + ",salary=" + salary ;
		}
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter Employee id: ");
	int id = scan.nextInt();
	scan.nextLine();
	
	System.out.print("Enter First Name: ");
	String firstName = scan.next();
	
	System.out.print("Enter Last Name: ");
	String lastName =  scan.next();
	
	System.out.print("Enter salary: ");
	int salary = scan.nextInt();
	
	Employee emp = new Employee(id, firstName, lastName, salary);
	
	System.out.println("\nEmployee Details: "+emp);
	
	System.out.print("Enter raise percentage: ");
	int percent = scan.nextInt();
	int newSalary = emp.raiseSalary(percent);
	
	System.out.println("Updated Salary: " +newSalary);
	System.out.println("Updated Employee Details: " +emp);
	
	scan.close();
}
}
