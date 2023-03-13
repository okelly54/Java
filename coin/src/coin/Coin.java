package coin;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		Scanner costscanner = new Scanner(System.in);
		System.out.println("Enter the cost: ");
		double cost = costscanner.nextDouble();
		costscanner.close();
		// get cost

		Scanner amountscanner = new Scanner(System.in);
		System.out.println("Enter your money: ");
		double amount = amountscanner.nextDouble();
		amountscanner.close();
		// get amount

		// loop until change is 0
		// check to see if taking away 20 pounds leaves balance as pos or neg
		// if you cant take 20 because its neg then take 10, 5, etc and so on
		// if > 20 do this
		// note50, note20, note10, note5, pound1, pound2, 50p, 20p, 10p, 5p, 2p, 1p
		double change = amount - cost;
		int note50 = 0;
		int note20 = 0;
		int note10 = 0;
		int note5 = 0;
		int pound1 = 0;
		int pound2 = 0;
		int p50 = 0;
		int p20 = 0;
		int p10 = 0;
		int p5 = 0;
		int p2 = 0;
		int p1 = 0;
		// should use switch case statements for this
		while (change != 0) {
			while (change % 50 == 0) {
				note50 += 1;
			}
			while (change % 20 == 0) {
				note20 += 1;
			}
			while (change % 10 == 0) {
				note10 = 0;
			}
			while (change % 5 == 0) {
				note5 = 0;
			}
			while (change % 2 == 0) {
				pound2 += 1;
			}
			while (change % 1 == 0) {
				pound1 += 1;
			}

		}

	}

}
