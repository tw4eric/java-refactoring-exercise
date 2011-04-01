package com.eric4tw.pair3;

/**
 * Understands the employee of a company
 * 
 * @author eashsma
 * 
 */
public class Employee {

	private final Gender gender;
	private final int totalSalary;
	private final int age;


	public Employee(Gender gender, int age, int totalSalary) {
		this.gender = gender;
		this.age = age;
		this.totalSalary = totalSalary;
		
	}

	public double calculatetax() {
		return getCategory().calculateSalary(gender,totalSalary);
	}

	private Category getCategory() {
		if (age >= 80)
			return Category.VERY_SENIOR_CITIZEN;
		if (age >= 60 && age < 80)
			return Category.SENIOR_CITIZEN;
		return Category.GENERAL;
	}

/*	private TaxSlab getTaxSlab(int aTotalSalary)
	{
		if()
	}*/



}
