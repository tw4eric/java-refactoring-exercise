package com.eric4tw.pair3;

public enum Category {
	GENERAL(0, 59) {
		@Override
		public double calculateTax(Gender gender, int totalSalary) {
			TaxEngine taxEngine = TaxEngineFactory
					.getGeneralCitizenTaxEngine(gender);
			return taxEngine.calculateTax(totalSalary);
		}
	},
	SENIOR(60, 79) {
		@Override
		public double calculateTax(Gender gender, int totalSalary) {
			TaxEngine taxEngine = TaxEngineFactory.getSeniorCitizenTaxEngine();
			return taxEngine.calculateTax(totalSalary);
		}
	},
	VERY_SENIOR(80, Integer.MAX_VALUE) {
		@Override
		public double calculateTax(Gender gender, int totalSalary) {
			TaxEngine taxEngine = TaxEngineFactory
					.getVerySeniorCitizenTaxEngine();
			return taxEngine.calculateTax(totalSalary);
		}
	};

	private final int maxAge;
	private final int minAge;

	private Category(int minAge, int maxAge) {
		this.minAge = minAge;
		this.maxAge = maxAge;
	}

	public static Category category(int age) {
		for (Category category : values()) {
			if (age >= category.minAge && age <= category.maxAge) {
				return category;
			}
		}
		throw new IllegalArgumentException(
				"No category exists for citizen of age " + age);
	}

	public abstract double calculateTax(Gender gender, int totalSalary);
}
