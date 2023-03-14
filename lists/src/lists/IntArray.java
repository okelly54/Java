package lists;

public class IntArray {

	public static void main(String[] args) {
		arrayInt(new int[0]);
	}

	public static void arrayInt(int[] stringArray) {
		int[] arrayInt = new int[] { 1, 5, 6, 2, 16, 20, 9, 3, 14, 12, 19, 13 };

		for (int i : arrayInt) {
			System.out.println(i);
		} // exercise 2
	}
}
