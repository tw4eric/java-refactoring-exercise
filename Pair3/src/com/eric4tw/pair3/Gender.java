package com.eric4tw.pair3;

/**
 * Understand Tax slabs for each gender
 * @author eashsma
 *
 */

public enum Gender {
	

	MALE {
		@Override
		public double getTaxFreeIncome() {
			return 180000;
		}

		@Override
		public double getMinForSecondSlab() {
			return 32000;
		}

		@Override
		public double getMinForThirdSlab() {
			// TODO Auto-generated method stub
			return 92000;
		}


	},
	FEMALE{
		@Override
		public double getTaxFreeIncome() {

			return 190000;
		}

		@Override
		public double getMinForSecondSlab() {
			
			return 31000;
		}

		@Override
		public double getMinForThirdSlab() {
			// TODO Auto-generated method stub
			return 91000;
		}
		
		

	};	
	public abstract double getTaxFreeIncome();
	public abstract double getMinForSecondSlab();
	public abstract double getMinForThirdSlab();
	

}
