package com.eric4tw.pair2;

/**
 * We have a rover which we control using commands 'R', 'L', 'M'. The rover
 * turns to its right if R is issued, turns to its Left if L is issued and moves
 * forward one position in the same direction if M is issued
 * 
 * @author amiruddinnagri
 * 
 */
public class Rover {
	private Position current;

	public Rover(Position current) {
		this.current = current;
	}

	public void command(char instruction) {
		switch (instruction) {
		// if instruction is to turn left
		case 'L':
			switch (current.getDirection()) {
			case 'N':
				// turn west if facing north
				current.setDirection('W');
				break;
			case 'S':
				// turn east if facing south
				current.setDirection('E');
				break;
			case 'E':
				// turn north if facing east
				current.setDirection('N');
				break;
			case 'W':
				// turn west if facing north
				current.setDirection('S');
				break;
			default:
				break;
			}
			break;
		// if instruction is to turn left
		case 'R':
			switch (current.getDirection()) {
			case 'N':
				current.setDirection('E');
				break;
			case 'S':
				current.setDirection('W');
				break;
			case 'E':
				current.setDirection('S');
				break;
			case 'W':
				current.setDirection('N');
				break;
			default:
				break;
			}
			break;
		// if instruction is to turn left
		case 'M':
			switch (current.getDirection()) {
			case 'N':
				current.setY(current.getY() + 1);
				break;
			case 'S':
				current.setY(current.getY() - 1);
				break;
			case 'E':
				current.setX(current.getX() + 1);
				break;
			case 'W':
				current.setX(current.getX() - 1);
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
	}

	public Position getCurrent() {
		return current;
	}
}
