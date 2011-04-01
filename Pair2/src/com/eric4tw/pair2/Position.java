package com.eric4tw.pair2;

public class Position {
	private Coordinate coordinate;

	private Direction direction;

	public Position(Coordinate coordinate, Direction direction) {
		super();
		this.coordinate = coordinate;
		this.direction = direction;
	}

	public Position(int x, int y, Direction direction) {
		this(new Coordinate(x, y), direction);
	}

	public Direction getDirection() {
		return direction;
	}

	public void moveAhead() {
		Coordinate deltaAxis = direction.moveAhead();

	}

	public void trunRight() {
		direction = direction.turnRight();
	}

	void turnLeft() {
		direction = direction.turnLeft();
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result
				+ ((direction == null) ? 0 : direction.hashCode());
		result = PRIME * result
				+ ((coordinate == null) ? 0 : coordinate.hashCode());
		result = PRIME * result + ((yAxis == null) ? 0 : yAxis.hashCode());
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
		final Position other = (Position) obj;
		if (direction == null) {
			if (other.direction != null)
				return false;
		} else if (!direction.equals(other.direction))
			return false;
		if (coordinate == null) {
			if (other.coordinate != null)
				return false;
		} else if (!coordinate.equals(other.coordinate))
			return false;
		if (yAxis == null) {
			if (other.yAxis != null)
				return false;
		} else if (!yAxis.equals(other.yAxis))
			return false;
		return true;
	}

}
