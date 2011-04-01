package com.eric4tw.pair3;

/**
 * 
 * understand taxes of a Citizen
 * 
 * @author ejaansh
 * 
 */

public class TaxOnSalary {

	private final Gender gender;

	private final int totalSalary;

	private final int age;

	public TaxOnSalary(Gender gender, int age, int totalSalary) {
		this.gender = gender;
		this.age = age;
		this.totalSalary = totalSalary;
	}

	public double calculatetax() {
		TaxSlab[] taxSlabForCategory = CitizenCategory.getCategory(age).getTaxSlabForCategory(gender);
		double Tax = 0;
		for (TaxSlab slab : taxSlabForCategory) {
			Tax+=slab.findTax(totalSalary);
		}		
		return Tax;
	}
}
