package com.eric4tw.pair3;

public enum Category {
	GENERAL {
		@Override
		public double calculateSalary(Gender gender,int totalSalary) {
			if (totalSalary <= gender.getTaxFreeIncome())
				return 0.0;
			if (totalSalary <= 500000)
				return (totalSalary - gender.getTaxFreeIncome()) * 0.10;
			if (totalSalary <= 800000)
				return gender.getMinForSecondSlab()
						+ (totalSalary - 500000) * 0.20;
			return gender.getMinForThirdSlab() + (totalSalary - 800000) * 0.30;
		}
	},
	SENIOR_CITIZEN {
		@Override
		public double calculateSalary(Gender gender,int totalSalary) {
			if (totalSalary <= 250000)
				return 0.0;
			if (totalSalary <= 500000)
				return (totalSalary - 250000) * 0.10;
			if (totalSalary <= 800000)
				return 25000
						+ (totalSalary - 500000) * 0.20;
			return 85000 + (totalSalary - 800000)
					* 0.30;
		}
	},
	VERY_SENIOR_CITIZEN {
		@Override
		public double calculateSalary(Gender gender,int totalSalary) {
			if (totalSalary <= 500000)
				return 0.0;
			else if (totalSalary <= 800000)
				return (totalSalary - 500000) * 0.20;
			return 60000 + (totalSalary - 800000)
					* 0.30;
		}
	};
	public abstract double calculateSalary(Gender aGender,int totalSalary);
}
