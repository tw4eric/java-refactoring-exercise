package com.eric4tw.pair2;

public class Position {
	private int x, y;
	private Direction myDirection;

	public Position(int x, int y, Direction direction) {
		super();
		this.x = x;
		this.y = y;
		this.myDirection = direction;
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

	public Direction getDirection() {
		return myDirection;
	}

	public void setDirection(Direction direction) {
		this.myDirection = direction;
	}
}
