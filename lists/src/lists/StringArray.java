package lists;

public class StringArray {

	public static void main(String[] args) {
		arrayName(new String[0]);
	}

	public static void arrayName(String[] stringArray) {
		String[] arrayName = new String[] { "blue", "pink", "green", "red" };

		for (String i : arrayName) {
			System.out.println(i);
		} // exercise 1
	}
}
