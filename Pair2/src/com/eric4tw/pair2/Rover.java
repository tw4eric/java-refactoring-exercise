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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rover other = (Rover) obj;
		if (current == null) {
			if (other.current != null)
				return false;
		} else if (!current.equals(other.current))
			return false;
		return true;
	}

	public void command(Instruction instruction) {
		Position returnedPosition = instruction.followInstruction(current);
		this.current = returnedPosition;
	}

	public Position getCurrent() {
		return current;
	}
}
