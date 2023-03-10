package fizzbuzz;

import java.util.Scanner; // needed to take input

public class fizzbuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number:");
		int num = Scanner.nextInt();

		if (num % 3 == 0)
			if (num % 5 == 0)
				System.out.print("Fizzbuzz");
		return;
		System.out.print("Fizz!");
		return;
		if (num % 5 == 0)
			System.out.print("Buzz!");
		return;
		sc.close();
	}

}
