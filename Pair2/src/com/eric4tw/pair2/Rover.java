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
    private Move myMove;
	private Position current;
	private Direction myDirection;

	public Rover(Position current) {
		this.current = current;
	}

	public void command(Move aMove) {
	    
	   // myMove.setPostion(instruction);
	    
	    
		    myDirection =   myDirection.moveLeft();
			 
		    break;
		// if instruction is to turn left
		case 'R':
		    myDirection =   myDirection.moveRight();
			break;
		// if instruction is to turn left
		case 'M':
		    myDirection.
			
			break;
		default:
			break;
		}
	}

	public Position getCurrent() {
		return current;
	}
	

	

}
