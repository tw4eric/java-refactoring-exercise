package com.eric4tw.pair3;

import java.util.ArrayList;
import java.util.List;

public class TaxEngine {
	private final List<IncomeSlab> incomeSlabs;

	public TaxEngine() {
		super();
		incomeSlabs = new ArrayList<IncomeSlab>();
	}

	public void addIncomeSlab(IncomeSlab incomeSlab) {
		incomeSlabs.add(incomeSlab);
	}

	public double calculateTax(int totalIncome) {
		double totalTax = 0.0;
		for (IncomeSlab incomeSlab : incomeSlabs) {
			if (incomeSlab.applicable(totalIncome)) {
				totalTax += incomeSlab.calculateTax(totalIncome);
			} else {
				break;
			}
		}
		return totalTax;
	}
}
