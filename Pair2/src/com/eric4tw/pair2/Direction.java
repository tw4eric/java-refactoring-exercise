package com.eric4tw.pair2;

public enum Direction {
EAST{
	public Direction turnLeft(){
		return Direction.NORTH;
	}
	public Direction turnRight(){
		return  Direction.SOUTH;
	}
	public  Cordinate  moveAhead()
	{
		return new Cordinate(1,0);
	}
},
WEST{
	public Direction turnLeft(){
		return  Direction.SOUTH;
	}
	public Direction turnRight(){
		return  Direction.NORTH;
	}
	public  Cordinate  moveAhead()
	{
		return new Cordinate(-1,0);
	}
},
NORTH{
	public Direction turnLeft(){
		return Direction.WEST;
    }
	public Direction turnRight(){
		return Direction.EAST;
	}
	public  Cordinate  moveAhead()
	{
		return new Cordinate(0,1);
	}
},
SOUTH{
	public Direction turnLeft(){
		return Direction.EAST;
	}
	public Direction turnRight(){
		return Direction.WEST;
	}
	public  Cordinate  moveAhead()
	{
		return new Cordinate(0,-1);
	}

};

public abstract Direction turnLeft();
public abstract Direction turnRight();
public  abstract Cordinate  moveAhead();

}
