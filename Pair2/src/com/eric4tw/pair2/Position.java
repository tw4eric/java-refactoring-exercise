package com.eric4tw.pair2;

public class Position {
	private final int x, y;
	private final Direction direction;

	public Position(int x, int y, Direction direction) {
		super();
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Direction getDirection() {
		return direction;
	}

	Position processCommand(Command instruction) {
		return instruction.processCommand(this);
	}

	public Position turnLeft() {
		return new Position(x, y, direction.turnLeft());
	}

	public Position turnRight() {
		return new Position(x, y, direction.turnRight());
	}

	public Position moveForward() {
		return direction.moveForward(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((direction == null) ? 0 : direction.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (direction != other.direction)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
