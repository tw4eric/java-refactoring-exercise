package com.eric4tw.pair2;

public class Position {
	private int x, y;
	private Directions direction;

	public Position(int x, int y, Directions direction) {
		super();
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Directions getDirection() {
		return direction;
	}

	public void setDirection(Directions direction) {
		this.direction = direction;
	}

	public Position changeCurrentPosition() {
		Position tempPosition = direction.changeX_And_Y_Position(getX(),getY());
		this.direction = tempPosition.direction;
		this.x = tempPosition.x;
		this.y = tempPosition.y;
		return this;
	}

	public Position turnLeft() {
		//setDirection(getDirection().turnLeft());
		return new Position(x, y, getDirection().turnLeft());
	}

	public Position turnRight() {
		return new Position(x, y, getDirection().turnRight());
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
