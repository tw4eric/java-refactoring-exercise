package com.eric4tw.pair3;

public class IncomeSlab {
	public static final IncomeSlab NULL = new IncomeSlab(0, 0, null);

	private final int maxIncome;
	private final double taxRate;

	private final IncomeSlab previousSlab;

	public IncomeSlab(int maxIncome, double taxRate, IncomeSlab previousSlab) {
		this.maxIncome = maxIncome;
		this.taxRate = taxRate;
		this.previousSlab = previousSlab;
	}

	public boolean applicable(int income) {
		return income > previousSlab.maxIncome;
	}

	public double calculateTax(int income) {
		double exceedingIncome = previousSlab.exceedingIncome(income);
		double taxableIncome = taxableIncome(exceedingIncome);
		return taxableIncome * taxRate;
	}

	private double taxableIncome(double income) {
		return Math.min(income, maxIncome - previousSlab.maxIncome);
	}

	private double exceedingIncome(int income) {
		return income - maxIncome;
	}
}
