package com.eric4tw.pair2;

public enum Directions {
	NORTH {
		@Override
		public Directions turnLeft() {
			// TODO Auto-generated method stub
			return WEST;
			
		}

		@Override
		public Directions turnRight() {
			// TODO Auto-generated method stub
			return EAST;
		}

		@Override
		public Position changeX_And_Y_Position(int x, int y) {
			// TODO Auto-generated method stub
			return new Position(x,y+1,NORTH);
		}

		
	}
	,SOUTH {
		@Override
		public Directions turnLeft() {
			// TODO Auto-generated method stub
			return EAST;
		}

		@Override
		public Directions turnRight() {
			// TODO Auto-generated method stub
			return WEST;
		}

		@Override
		public Position changeX_And_Y_Position(int x, int y) {
			// TODO Auto-generated method stub
			return new Position(x,y-1,SOUTH);
		}

		
	}
	,EAST {
		@Override
		public Directions turnLeft() {
			return NORTH;
		}

		@Override
		public Directions turnRight() {
			return SOUTH;
		}

		@Override
		public Position changeX_And_Y_Position(int x, int y) {
			// TODO Auto-generated method stub
			return new Position(x+1,y,EAST);
		}

		
	}
	,WEST {
		@Override
		public Directions turnLeft() {
			return SOUTH;
		}

		@Override
		public Directions turnRight() {
			return NORTH;
		}

		@Override
		public Position changeX_And_Y_Position(int x, int y) {
			// TODO Auto-generated method stub
			return new Position(x-1,y,WEST);
		}

		
	};
	public abstract Directions turnLeft();
	public abstract Directions turnRight();
	
	public abstract Position changeX_And_Y_Position(int x, int y);
}
