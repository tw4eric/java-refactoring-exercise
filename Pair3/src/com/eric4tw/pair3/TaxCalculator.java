package com.eric4tw.pair3;

public class TaxCalculator {
	private final int firstSalarySlabForMen = 180000;
	private final int firstSalarySlabForWomen = 190000;
	private final int firstSalarySlabForSeniorCitizens = 250000;
	private final int secondSalarySlab = 500000;
	private final int thirdSalarySlab = 800000;

	private final char gender;
	private final int totalSalary;
	private final int age;

	public TaxCalculator(char gender, int age, int totalSalary) {
		this.gender = gender;
		this.age = age;
		this.totalSalary = totalSalary;
	}	

	public double calculatetax() {
		if (age < 60) { 			
			return calculateTaxForGeneralCitizens();
		} 
		else if (age < 80) {
			return calculateTaxForSeniorCitizen();
		}
		return calculateTaxForVerySeniorCitizens();
	}

	private double calculateTaxForGeneralCitizens() {
		switch (gender) {
		case 'M':
			return calculateTaxForMen();
		case 'F':
			return calculateTaxForWomen();
		default:
			return 0;
		}
	}
	
	private double calculateTaxForWomen() {

		if (totalSalary <= firstSalarySlabForWomen)
			return 0.0;
		if (totalSalary <= secondSalarySlab)
			return (totalSalary - firstSalarySlabForWomen) * 0.10;
		if (totalSalary <= thirdSalarySlab)
			return 31000 + (totalSalary - secondSalarySlab) * 0.20;
		return 91000 + (totalSalary - thirdSalarySlab) * 0.30;

	}

	private double calculateTaxForMen() {
		if (totalSalary <= firstSalarySlabForMen)
			return 0.0;
		if (totalSalary <= secondSalarySlab)
			return (totalSalary - firstSalarySlabForMen) * 0.10;
		if (totalSalary <= thirdSalarySlab)
			return 32000 + (totalSalary - secondSalarySlab) * 0.20;
		return 92000 + (totalSalary - thirdSalarySlab) * 0.30;
	}

	private double calculateTaxForSeniorCitizen() {
		if (totalSalary <= firstSalarySlabForSeniorCitizens)
			return 0.0;
		if (totalSalary <= secondSalarySlab)
			return (totalSalary - firstSalarySlabForSeniorCitizens) * 0.10;
		if (totalSalary <= thirdSalarySlab)
			return 25000 + (totalSalary - secondSalarySlab) * 0.20;
		return 85000 + (totalSalary - thirdSalarySlab) * 0.30;
	}
	
	private double calculateTaxForVerySeniorCitizens() {
		if (totalSalary <= secondSalarySlab)
			return 0.0;
		else if (totalSalary <= thirdSalarySlab)
			return (totalSalary - secondSalarySlab) * 0.20;
		return 60000 + (totalSalary - thirdSalarySlab) * 0.30;
	}

	
}
