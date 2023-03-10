package calculator;

import java.util.Scanner; // needed to take input

public class addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first number:");
		int additionOne = sc.nextInt();

		System.out.print("Enter your second number:");
		int additionTwo = sc.nextInt();

		int additionResult = additionOne + additionTwo;
		System.out.println(additionResult);
	}

}
