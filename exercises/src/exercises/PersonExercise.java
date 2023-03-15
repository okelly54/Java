package exercises;

import java.util.ArrayList;
import java.util.List;

public class PersonExercise {

	static List<Person> people = new ArrayList<>();
	// <person> is the TYPE
	// the class we created is a custom type we made, so it is used as a type

	public static void main(String[] args) {
		// adding objects from (into?) the class
		Person p1 = new Person("Tom Nook", 39, "Capitalist fiend");
		Person p2 = new Person("Diana Burnwood", 48, "ICA Handler");
		Person p3 = new Person("SCP-999", 999, "Squishy");
		Person p4 = new Person("Fall Guy Guy", 52, "Chad");
		// looks inefficient could optimise better
	}

	public static Person find(String name) { // person type is used here again
		// people.add(p1.name);
		// taking notes right now!
		return null;
	}
}
