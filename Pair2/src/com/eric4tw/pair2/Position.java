package com.eric4tw.pair2;



/**
 * Understands position 
 * @author esigaje
 *
 */
public class Position {
	
	private static final char MOVE = 'M';
	private static final char RIGHT = 'R';
	private static final char LEFT = 'L';

	
	private Cordinate cordinate;
	private Direction direction;
	
	
	public Position(int aX, int aY, Direction direction) {
		cordinate = new Cordinate(aX,aY);
		this.direction = direction;
	}

	public void move(char instruction) {
		switch (instruction) {
		
		case LEFT:
			turnLeft();
			break;
		
		case RIGHT:
			turnRight();
			break;
		case MOVE:
			moveAhead();
			break;
		default:
			break;
		}
	}

	public void moveAhead() {
		cordinate.add(direction.moveAhead());
	}

	public void turnRight() {
		direction = direction.turnRight();
	}


	public void turnLeft() {
		direction = direction.turnLeft();
	}

	public Object getDirection() {
			return direction;
	}

}
