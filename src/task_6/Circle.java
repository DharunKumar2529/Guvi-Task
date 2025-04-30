package task_6;

import java.util.Scanner;

public class Circle {
	private double radius;
	
	public Circle() {
		this.radius = 0.0;
	}
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Circle circle1 = new Circle();
		System.out.print("Enter radius of circle 1: ");
		double inputRadius = scan.nextDouble();
		circle1.setRadius(inputRadius);
		System.out.print("Circumference of Circle1: " + circle1.getCircumference());
		
		System.out.print("\nEnter radius of Circle 2: ");
		double r2 = scan.nextDouble();
		Circle circle2 = new Circle(r2);
		System.out.println("Circumference of Circle2: " + circle2.getCircumference());
		
		scan.close();

	}

}
