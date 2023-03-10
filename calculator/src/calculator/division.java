package calculator;

import java.util.Scanner; // needed to take input

public class division {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first number:");
		int divisionOne = sc.nextInt();

		System.out.print("Enter your second number:");
		int divisionTwo = sc.nextInt();

		int divisionResult = divisionOne / divisionTwo;
		System.out.println(divisionResult);
	}

}
