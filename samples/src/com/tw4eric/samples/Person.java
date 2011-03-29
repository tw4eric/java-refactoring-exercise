package com.tw4eric.samples;

// conditional by strategy
public class Person {
	private final char gender;
	private final int age;

	public Person(char gender, int age) {
		this.gender = gender;
		this.age = age;
	}

	public boolean canMarry() {
		if (gender == 'M')
			return age >= 21;
		return age >= 18;
	}
}
