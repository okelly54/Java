package calculator;

import java.util.Scanner; // needed to take input

public class subtraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first number:");
		int subOne = sc.nextInt();

		System.out.print("Enter your second number:");
		int subTwo = sc.nextInt();

		int subResult = subOne - subTwo;
		System.out.println(subResult);
	}

}
