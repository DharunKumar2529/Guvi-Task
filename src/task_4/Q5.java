package task_4;

public class Q5 {

	public static void main(String[] args) {
		int num = 2;
		boolean Prime = true;
				if (num <=1) Prime = false;
		
		for (int i=2; i<num; i++) {
			if (num % i==0) {
				Prime = false;
				break;
			}
		}
		if (Prime)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}

}
