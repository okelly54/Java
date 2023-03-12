package calculator;

import java.util.Scanner;

public class calculator {

	public void main(String[] args) {
		Scanner numberInput = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		double num1 = numberInput.nextDouble();
		System.out.println("Enter your second number: ");
		double num2 = numberInput.nextDouble();
		numberInput.close();
		// obtains num1 and num2

		System.out.println("Choose an option:");
		System.out.println("a - addition \n b - subtraction \n c - division \n d - multiplication");
		Scanner optionInput = new Scanner(System.in);
		String option = optionInput.nextLine();

		if (option == "a") {
			double ans = num1 + num2;
			System.out.println("The result is " + ans);
		} else if (option == "b") {
			double ans = num1 - num2;
			System.out.println("The result is " + ans);
		} else if (option == "c") {
			double ans = num1 / num2;
			System.out.println("The result is " + ans);
		} else if (option == "d") {
			double ans = num1 * num2;
			System.out.println("The result is " + ans);
		} else {
			System.out.println("Incorrect option, please try again.");
		}

		optionInput.close();
		// code to verify answer and run corresponding methods
	}
}
