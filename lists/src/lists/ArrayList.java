package lists;

import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(34);
		arrayList.add(9);
		arrayList.add(13);
		arrayList.add(1);
		arrayList.add(22);
		arrayList.add(31);
		arrayList.add(2);
		arrayList.add(16);
		arrayList.add(27);
		arrayList.add(1);
		arrayList.add(8);
		forMethod();
		enhancedForMethod();
	}

	public static void forMethod() {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}

	public static void enhancedForMethod() {
		for (int i : arrayList) {
			System.out.println(i);
		}
	}

	public static void getsetremoveMethod() {
		System.out.println(arrayList.get(0)); // first element in list
		System.out.println(arrayList.get(4)); // fifth element in list
		System.out.println(arrayList.get(arrayList.size() - 1)); // maybe maybe not last element in list
		// get

		arrayList.set(1, 5); // set second element in list as 5
		arrayList.set(3, 17); // set fourth element in list as 17
		arrayList.set(0, 22); // set first element in list as 22
		arrayList.set(arrayList.size() - 1, 29); // set last element as 29
		// set

		arrayList.remove(2); // removes value at index 2 (third value)
		arrayList.remove(7); // removes value at index 7 (eighth value)
		// remove

	}

}
