package com.eric4tw.pair3;

public enum CitizenCategory {

	GENERAL_CITIZEN(0, 59) {
		@Override
		public TaxSlab[] getTaxSlabForCategory(Gender gender) {
			return gender.taxSlabForGeneralCitizen();
		}
	},
	SENIOR_CITIZEN(60, 79) {
		@Override
		public TaxSlab[] getTaxSlabForCategory(Gender gender) {
			return TaxSlab.getTaxSlabsForSeniorCitizen();
		}
	},
	SUPER_SENIOR_CITIZEN(80, Integer.MAX_VALUE) {
		@Override
		public TaxSlab[] getTaxSlabForCategory(Gender gender) {
			return TaxSlab.getTaxSlabsForVerySeniorCitizen();
		}
	};

	private final int minAge;

	private final int maxAge;

	private CitizenCategory(int minAge, int maxAge) {
		this.minAge = minAge;
		this.maxAge = maxAge;
	}

	public static CitizenCategory getCategory(int age) {
		for (CitizenCategory citizenCategory : values()) {
			if (citizenCategory.applicable(age))
				return citizenCategory;
		}
		throw new IllegalArgumentException(
				"Citizen category not found for age " + age);
	}

	private boolean applicable(int age) {
		return minAge <= age && maxAge >= age;
	}

	public abstract TaxSlab[] getTaxSlabForCategory(Gender gender);
}
