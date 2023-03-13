package arrays;

import java.util.Scanner;

public class Arrays {
	public int exercisesMethod;
	{
		int[] numArray = new int[] { 43, 21, 1, 4, 34, 6, 13, 16, 41, 9 };
		for (int i = 0; i <= numArray.length - 1; i++) {
			System.out.println(numArray[i]);
		} // exercise 1

		for (int i = 0; i <= numArray.length - 1; i++) {
			numArray[i] = i * 10;
			System.out.println(numArray[i]);
		} // exercise 2

	}

	public int numbersMethod;
	{
		Scanner numInput = new Scanner(System.in);
		// need to add something to verify is between 10-99
		System.out.println("Enter your number :");
		int num = numInput.nextInt();

		String[] strArray = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		// work out how to break input into two
		// if num1 first digit is 2

		// for first part of number, repeat for second part
		if (num > 19 && num < 30) {
			String partOne = strArray[2];
		} else if (num > 29 && num < 40) {
			String partOne = strArray[3]; // too hard coded right now
		}

	}

	// public int verify; {
	// int num = 0;
	// while (num < 1 || num > 100);
	// Scanner numInput = new Scanner(System.in);
	// num = numInput.nextInt();

}
