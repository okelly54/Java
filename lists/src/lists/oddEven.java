package lists;

import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = scn.nextInt(); // store the number from the scanner
		boolean isTrue = otherMethod(num1); // check if it's even
		System.out.println(isTrue); // print
		scn.close();
	}

	public static boolean otherMethod(int num1) {
		return num1 % 2 == 0;
//		return is this true
	}

}
