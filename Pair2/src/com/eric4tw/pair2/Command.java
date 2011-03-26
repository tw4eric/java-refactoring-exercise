package com.eric4tw.pair2;

public enum Command {
	LEFT('L') {
		@Override
		public Position processCommand(Position current) {
			return current.turnLeft();
		}
	},
	RIGHT('R') {
		@Override
		public Position processCommand(Position current) {
			return current.turnRight();
		}
	},
	MOVE('M') {
		@Override
		public Position processCommand(Position current) {
			return current.moveForward();
		}
	};
	
	private final char identifier;

	private Command(char identifier) {
		this.identifier = identifier;
	}

	public static Command command(char identifier) {
		for (Command command : values()) {
			if (command.identifier == identifier)
				return command;
		}
		throw new IllegalArgumentException(identifier + " is not value command");
	}

	public abstract Position processCommand(Position current);
}
