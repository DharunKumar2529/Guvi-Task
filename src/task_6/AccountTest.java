package task_6;

import java.util.Scanner;

class Account{
	private String name;
	private double balance;
	
	public Account() {
		name = "Unnamed";
		balance = 0.0;
	}
	
	public Account(String name,double initialbalance) {
		this.name = name;
		this.balance = initialbalance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit successsfull. \nNew balance: " +balance);
		}
		else {
			System.out.println("Invalid amount. Cannot deposit");
		}
	}
	
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successfull. \nRemaining balance: "+balance);
		}
		else {
			System.out.println("Insufficient balance or invalid amount");
		}
	}
	
	public void checkbalance() {
		System.out.println("Current balance: "+balance);
	}
	
	public String getName() {
		return name;
	}
}

public class AccountTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Account acc;
		
		System.out.println("Create account:");
		System.out.println("1. Default account");
		System.out.println("2. Custom account with name and balance");
		System.out.print("Enter choice: ");
		int ch = scan.nextInt();
		scan.nextLine();
		
		if(ch == 1) {
			acc = new Account();
		}
		else {
			System.out.print("Enter account holder name: ");
			String name = scan.nextLine();
			System.out.print("Enter initial balance: ");
			double bal = scan.nextDouble();
			acc = new Account(name, bal);
		}
		
		int option;
		do {
			System.out.println("\nMenu:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			option = scan.nextInt();
			
			switch (option) {
			case 1:
				System.out.print("Enter deposit amount: ");
				double dep = scan.nextDouble();
				acc.deposit(dep);
				break;
			
			case 2:
				System.out.print("Enter withdrawal amount: ");
				double wd = scan.nextDouble();
				acc.withdraw(wd);
				break;
				
			case 3:
				acc.checkbalance();
				break;
				
			case 0:
				System.out.println("Thank You");
				break;
				
			default:
				System.out.println("Invalid option");
			}
		}
		while (option !=0);
		
		scan.close();
	}
}

