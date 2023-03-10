package calculator;

import java.util.Scanner; // needed to take input

public class multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first number:");
		int multiplyOne = sc.nextInt();

		System.out.print("Enter your second number:");
		int multiplyTwo = sc.nextInt();

		int multiplyResult = multiplyOne * multiplyTwo;
		System.out.println(multiplyResult);
	}

}
