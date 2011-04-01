package com.eric4tw.pair3;

public enum Gender {
	MALE {
		@Override
		public TaxSlab[] taxSlabForGeneralCitizen() {
			return TaxSlab.getTaxSlabsForGeneralMale();
		}
	},
	FEMALE {

		@Override
		public TaxSlab[] taxSlabForGeneralCitizen() {
			return TaxSlab.getTaxSlabsForGeneralFemale();
		}

	};
	public abstract TaxSlab[] taxSlabForGeneralCitizen();
}
