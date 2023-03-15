package exercises;

import java.util.ArrayList;

public class Person {
	public String name;
	public int age;
	public String jobTitle;
	// instance variables

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		// ask why this is here when we did the previous code before
	}

	// global variables
	// this refers to current object - need more clarification
	public ArrayList<String> ObjectList(String name, int age, String jobTitle) {
		ArrayList<String> objectlistarray = new ArrayList<>();
		return objectlistarray;
	}
}
