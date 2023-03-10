package blackjack;

import java.util.Scanner;

public class blackjack {
	public static void main(String[] args) {
		Scanner numScanner = new Scanner(System.in);
		int i = 1;
		while (i <= 1) {
			System.out.println("Enter your first number: ");
			int num1 = numScanner.nextInt();

			System.out.println("Enter your second number: ");
			int num2 = numScanner.nextInt();

			if (num1 + num2 >= 21) {
				System.out.println("You have reached 21!");
				if (num1 == num2) {
					System.out.println(num1 + " and " + num2 + "are the same");
				} else if (num1 > num2) {
					System.out.println(num1 + " is bigger than " + num2);
				} else {
					System.out.println(num2 + " is bigger than " + num1);
					break;
				}
			} else {
				i++;
			}
			
			if (num1 == num2) {
				System.out.println(num1 + " and " + num2 + " are the same");
			
			} else if (num1 > num2) {
				System.out.println(num1 + " is bigger than " + num2);
				
			} else {
				System.out.println(num2 + " is bigger than " + num1);
			}
			
			if (num1 + num2 >= 21) {
				System.out.println("You have hit 21");
			}
			
			
			
			
			
			if (num1 <= 0) {
				System.out.println("Please enter a value bigger than 0: ");
				num1 = numScanner.nextInt();
			}
			if (num2 <= 0) {
				System.out.println("Please enter a value bigger than 0: ");
				num2 = numScanner.nextInt();
			}
			// ensures value is bigger than 0
			
			if (num1 < 21 && num1 > num2) {
				// checks if value is smaller than 21
				// and if value is bigger than other value
				// if so, it wins
				System.out.println(num1 + " was the bigger number under 21");
				
			}
			if (num2 < 21 && num2 > num1) {
				// checks if value is smaller than 21
				// and if value is bigger than other value
				// if so, it wins
				System.out.println(num2 + " was the bigger number under 21");
			
			} else if (num2 > 21 && num1 < num2) {
				
				System.out.println(num2 + " was the biggest number under 21");
			
			} else if (num2 > 21 && num2 < num1) {
				
				System.out.println(num2 + " was bigger");
			
			} else if (num1 > 21 && num2 > 21) {
				
			}
			
			
			
			if (num1 <= 21) {
				if (num1 > num2) {
					System.out.println(num2 + " was the biggest!");
				}
				else if (num1 == num2) {
					System.out.println(num1 + " and " + num2 + " are the same values!");
				} else {
					System.out.println(num1 + " is above 21!");
				}
			}
			
			if (num1 > num2) {
				if (num1 <= 21) {
					System.out.println(num1 + " was the biggest!");
				} else {
					System.out.println(num1 + " is larger than 21 so won't count!");
				}
			else if (num1 == num2) {
				// a and b over 21, return 0
				// a over 21 return b
				// b over 21 return a, etc
				// simplify pleasae
					
				}
			
			}
			
			
			
			
			
			
			
			

		}
		numScanner.close();
	}

}
