package com.tw4eric.samples;

public enum Gender {
	MALE {
		@Override
		public boolean canMarry(int age) {
			return age >= 21;
		}
	},
	FEMALE {
		@Override
		public boolean canMarry(int age) {
			return age >= 18;
		}
	};

	public abstract boolean canMarry(int age);
}
