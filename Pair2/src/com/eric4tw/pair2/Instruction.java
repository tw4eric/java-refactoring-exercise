package com.eric4tw.pair2;

public enum Instruction {
	LEFT {
		@Override
		public Position followInstruction(Position aPosition) {
			return aPosition.turnLeft();
		}
	},RIGHT {
		@Override
		public Position followInstruction(Position aPosition) {
			return aPosition.turnRight();
		}
	},MIDDLE {
		@Override
		public Position followInstruction(Position aPosition) {
			return aPosition.changeCurrentPosition();
		}
	};
	public abstract Position followInstruction(Position position);
}
