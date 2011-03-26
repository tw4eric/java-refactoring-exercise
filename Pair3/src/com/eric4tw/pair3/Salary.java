package com.eric4tw.pair3;

public class Salary {

	private final Gender gender;
	private final int totalSalary;
	private final Category category;

	public Salary(Gender gender, int age, int totalSalary) {
		this.gender = gender;
		this.category = Category.category(age);
		this.totalSalary = totalSalary;
	}

	public double calculatetax() {
		return category.calculateTax(gender, totalSalary);
	}
}
