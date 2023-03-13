package flowchart;

public class Flowchart {

	public static void firstFlowchart() {
		int a = 0;
		for (a = 100; a < 200; a++) {
			System.out.println(a);
			// does a++ automatically
		} // ends when a is bigger than 200
	}

	public static void secondFlowchart() {
		int a = 100;
		while (a <= 200) { // if last decision is true
			for (a = 100; a % 2 == 0; a++) { // a = 100 or a = 0????
				System.out.println("-");
			} // if first decision is true
			System.out.println("*");
			a++; // if first decision is false
		} // if last decision is false program ends
	}

	public static void methodThree() {
		int i = 0;
		for (i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public static void methodFive() {
		// for loop that takes variable
		// for loop increments variable for amount of value itself
		int i = 0;
		int x = 10;
		for (i = 0; i < x; i++) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		firstFlowchart();
		secondFlowchart();
		methodThree();
		methodFive();
	}

}