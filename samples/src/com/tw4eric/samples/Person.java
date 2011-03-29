package com.tw4eric.samples;

// conditional by strategy
public class Person {
	private final Gender gender;
	private final int age;

	public Person(Gender gender, int age) {
		this.gender = gender;
		this.age = age;
	}

	public boolean canMarry() {
		return gender.canMarry(age);
	}
}
