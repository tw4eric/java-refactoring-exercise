package com.eric4tw.pair2;

public enum Direction {
	NORTH {
		@Override
		public Direction turnLeft() {
			return WEST;
		}

		@Override
		public Direction turnRight() {
			return EAST;
		}

		@Override
		public Position moveForward(Position current) {
			return new Position(current.getX(), current.getY() + 1, this);
		}
	},
	SOUTH {
		@Override
		public Direction turnLeft() {
			return EAST;
		}

		@Override
		public Direction turnRight() {
			return WEST;
		}

		@Override
		public Position moveForward(Position current) {
			return new Position(current.getX(), current.getY() - 1, this);
		}
	},
	EAST {
		@Override
		public Direction turnLeft() {
			return NORTH;
		}

		@Override
		public Direction turnRight() {
			return SOUTH;
		}

		@Override
		public Position moveForward(Position current) {
			return new Position(current.getX() + 1, current.getY(), this);
		}
	},
	WEST {
		@Override
		public Direction turnLeft() {
			return SOUTH;
		}

		@Override
		public Direction turnRight() {
			return NORTH;
		}

		@Override
		public Position moveForward(Position current) {
			return new Position(current.getX() - 1, current.getY(), this);
		}
	};

	public abstract Direction turnLeft();

	public abstract Direction turnRight();

	public abstract Position moveForward(Position current);
}
