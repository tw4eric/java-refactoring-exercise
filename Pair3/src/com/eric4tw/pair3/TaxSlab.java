package com.eric4tw.pair3;

public class TaxSlab {

	private static final TaxSlab TAX_SLAB_4 = new TaxSlab(800000,
			Integer.MAX_VALUE, 0.3);

	private static final TaxSlab TAX_SLAB_3 = new TaxSlab(500000, 800000, 0.2);

	int LowBand;

	int HighBand;

	double TaxPercentage;

	public TaxSlab(int lowBand, int highBand, double taxPercentage) {
		super();
		LowBand = lowBand;
		HighBand = highBand;
		TaxPercentage = taxPercentage;
	}

	public static TaxSlab[] getTaxSlabsForGeneralMale() {
		return new TaxSlab[] { new TaxSlab(0, 180000, 0.0),
				new TaxSlab(180000, 500000, 0.1), TAX_SLAB_3, TAX_SLAB_4 };
	}

	public static TaxSlab[] getTaxSlabsForGeneralFemale() {
		return new TaxSlab[] { new TaxSlab(0, 190000, 0.0),
				new TaxSlab(190000, 500000, 0.1), TAX_SLAB_3, TAX_SLAB_4 };
	}

	public static TaxSlab[] getTaxSlabsForSeniorCitizen() {
		return new TaxSlab[] { new TaxSlab(0, 250000, 0),
				new TaxSlab(250000, 500000, 0.10), TAX_SLAB_3, TAX_SLAB_4 };
	}

	public static TaxSlab[] getTaxSlabsForVerySeniorCitizen() {
		return new TaxSlab[] { new TaxSlab(0, 500000, 0.0), TAX_SLAB_3,
				TAX_SLAB_4 };
	}

	public double findTax(int totalSalary) {
		// TODO Auto-generated method stub
		if(totalSalary > LowBand)
			return (((totalSalary > HighBand) ? HighBand : totalSalary) - LowBand) * TaxPercentage;
		else
			return 0;
		
	}
}
