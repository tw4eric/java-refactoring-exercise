package com.eric4tw.pair3;

public class TaxEngineFactory {
	public static TaxEngine getSeniorCitizenTaxEngine() {
		return new TaxEngineBuilder().freeSlab(250000).incomeSlab(500000, 0.10)
				.incomeSlab(800000, 0.20).finalSlab(0.30).taxEngine();
	}

	public static TaxEngine getVerySeniorCitizenTaxEngine() {
		return new TaxEngineBuilder().freeSlab(500000).incomeSlab(800000, 0.20)
				.finalSlab(0.30).taxEngine();
	}

	public static TaxEngine getGeneralCitizenTaxEngine(Gender gender) {
		if (gender == Gender.FEMALE) {
			return new TaxEngineBuilder().freeSlab(190000)
					.incomeSlab(500000, 0.10).incomeSlab(800000, 0.20)
					.finalSlab(0.30).taxEngine();
		} else {
			return new TaxEngineBuilder().freeSlab(180000)
					.incomeSlab(500000, 0.10).incomeSlab(800000, 0.20)
					.finalSlab(0.30).taxEngine();
		}
	}

	static class TaxEngineBuilder {
		private TaxEngine taxEngine;
		private IncomeSlab lastSlab;

		public TaxEngineBuilder() {
			super();
			taxEngine = new TaxEngine();
		}

		public TaxEngineBuilder freeSlab(int noTaxTill) {
			lastSlab = new IncomeSlab(noTaxTill, 0.0, IncomeSlab.NULL);
			taxEngine.addIncomeSlab(lastSlab);
			return this;
		}

		public TaxEngineBuilder finalSlab(double taxRate) {
			incomeSlab(Integer.MAX_VALUE, taxRate);
			return this;
		}

		public TaxEngineBuilder incomeSlab(int maxIncome, double taxRate) {
			lastSlab = new IncomeSlab(maxIncome, taxRate, lastSlab);
			taxEngine.addIncomeSlab(lastSlab);
			return this;
		}

		public TaxEngine taxEngine() {
			return taxEngine;
		}
	}
}
