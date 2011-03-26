package com.eric4tw.pair2;

import static com.eric4tw.pair2.Direction.*;
import static junit.framework.Assert.*;

import org.junit.Test;

public class RoverTest {
	@Test
	public void turnsToWIfInstructionIsLAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, NORTH));
		Position position = rover.command('L');
		assertEquals(new Position(1, 1, WEST), position);
	}

	@Test
	public void turnsToEIfInstructionIsLAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, SOUTH));
		Position position = rover.command('L');
		assertEquals(new Position(1, 1, EAST), position);
	}

	@Test
	public void turnsToNIfInstructionIsLAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, EAST));
		Position position = rover.command('L');
		assertEquals(new Position(1, 1, NORTH), position);
	}

	@Test
	public void turnsToSIfInstructionIsLAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, WEST));
		Position position = rover.command('L');
		assertEquals(new Position(1, 1, SOUTH), position);
	}

	@Test
	public void turnsToEIfInstructionIsRAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, NORTH));
		Position position = rover.command('R');
		assertEquals(new Position(1, 1, EAST), position);
	}

	@Test
	public void turnsToWIfInstructionIsRAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, SOUTH));
		Position position = rover.command('R');
		assertEquals(new Position(1, 1, WEST), position);
	}

	@Test
	public void turnsToSIfInstructionIsRAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, EAST));
		Position position = rover.command('R');
		assertEquals(new Position(1, 1, SOUTH), position);
	}

	@Test
	public void turnsToNIfInstructionIsRAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, WEST));
		Position position = rover.command('R');
		assertEquals(new Position(1, 1, NORTH), position);
	}

	@Test
	public void movesInXIfInstructionIsMAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, NORTH));
		Position position = rover.command('M');
		assertEquals(new Position(2, 1, NORTH), position);
	}

	@Test
	public void movesInYIfInstructionIsMAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, EAST));
		Position position = rover.command('M');
		assertEquals(new Position(1, 2, EAST), position);
	}

	@Test
	public void movesInReverseXIfInstructionIsMAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, SOUTH));
		Position position = rover.command('M');
		assertEquals(new Position(0, 1, SOUTH), position);
	}

	@Test
	public void movesInReverseYIfInstructionIsMAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, WEST));
		Position position = rover.command('M');
		assertEquals(new Position(1, 0, WEST), position);
	}
}
