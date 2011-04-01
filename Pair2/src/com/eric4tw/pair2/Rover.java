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
		case 'L':
			current.turnLeft();
			break;
		case 'R':
			current.trunRight();
			break;
		case 'M':
			current.moveAhead();
			break;
		default:
			break;
		}
	}

	public Position getCurrent() {
		return current;
	}
}
