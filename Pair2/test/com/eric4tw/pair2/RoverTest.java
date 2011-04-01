package com.eric4tw.pair2;

import junit.framework.Assert;

import org.junit.Test;

public class RoverTest {
	@Test
	public void turnsToWIfInstructionIsLAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, Direction.North));
		rover.command('L');
		Position position = rover.getCurrent();
		Assert.assertEquals(new Position(1, 1, Direction.West), rover
				.getCurrent());
		Assert.assertEquals(Direction.West, position.getDirection());
	}

	@Test
	public void turnsToEIfInstructionIsLAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, Direction.South));
		rover.command('L');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('E', position.getDirection());
	}

	@Test
	public void turnsToNIfInstructionIsLAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, Direction.East));
		rover.command('L');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('N', position.getDirection());
	}

	@Test
	public void turnsToSIfInstructionIsLAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, Direction.West));
		rover.command('L');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('S', position.getDirection());
	}

	@Test
	public void turnsToEIfInstructionIsRAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, Direction.North));
		rover.command('R');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('E', position.getDirection());
	}

	@Test
	public void turnsToWIfInstructionIsRAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, Direction.South));
		rover.command('R');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('W', position.getDirection());
	}

	@Test
	public void turnsToSIfInstructionIsRAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, Direction.East));
		rover.command('R');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('S', position.getDirection());
	}

	@Test
	public void turnsToNIfInstructionIsRAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, Direction.West));
		rover.command('R');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('N', position.getDirection());
	}

	@Test
	public void movesInYIfInstructionIsMAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, Direction.North));
		rover.command('M');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(2, position.getY());
		Assert.assertEquals('N', position.getDirection());
	}

	@Test
	public void movesInXIfInstructionIsMAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, Direction.East));
		rover.command('M');
		Position position = rover.getCurrent();
		Assert.assertEquals(2, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('E', position.getDirection());
	}

	@Test
	public void movesInReverseYIfInstructionIsMAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, Direction.South));
		rover.command('M');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(0, position.getY());
		Assert.assertEquals('S', position.getDirection());
	}

	@Test
	public void movesInReverseXIfInstructionIsMAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, Direction.West));
		rover.command('M');
		Position position = rover.getCurrent();
		Assert.assertEquals(0, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('W', position.getDirection());
	}
}
