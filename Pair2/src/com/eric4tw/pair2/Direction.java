package com.eric4tw.pair2;

public enum Direction {
	East {
		@Override
		public Direction turnLeft() {
			
			return Direction.North;
			
		}

		@Override
		public Direction turnRight() {
			return Direction.South;
		}

		@Override
		public Coordinate moveAhead() {
			return new Coordinate(1, 0);
			
		}
		
		
	}
	,West{

		@Override
		public Direction turnLeft() {
			return Direction.South;
		}

		@Override
		public Direction turnRight() {
			return Direction.North;
			
		}

		@Override
		public Coordinate moveAhead() {
			return new Coordinate(-1, 0);
		}
		
	},North{

		@Override
		public Direction turnLeft() {
			return Direction.West;
		}

		@Override
		public Direction turnRight() {
			return Direction.East;
			
		}

		@Override
		public Coordinate moveAhead() {
			return new Coordinate(0,1);
		}
		
	},South{

		@Override
		public Direction turnLeft() {
			return Direction.East;
		}

		@Override
		public Direction turnRight() {
			return Direction.West;
		}

		@Override
		public Coordinate moveAhead() {
			return new Coordinate(0, -1);
		}
		
		
	};	
	
	public abstract Direction turnLeft();
	public abstract Direction turnRight();
	public abstract Coordinate moveAhead();
}
