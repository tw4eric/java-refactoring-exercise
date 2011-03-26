package com.eric4tw.pair2;

import junit.framework.Assert;

import org.junit.Test;

public class RoverTest {
	@Test
	public void turnsToWIfInstructionIsLAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, 'N'));
		rover.command('L');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('W', position.getDirection());
	}

	@Test
	public void turnsToEIfInstructionIsLAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, 'S'));
		rover.command('L');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('E', position.getDirection());
	}

	@Test
	public void turnsToNIfInstructionIsLAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, 'E'));
		rover.command('L');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('N', position.getDirection());
	}

	@Test
	public void turnsToSIfInstructionIsLAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, 'W'));
		rover.command('L');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('S', position.getDirection());
	}

	@Test
	public void turnsToEIfInstructionIsRAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, 'N'));
		rover.command('R');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('E', position.getDirection());
	}

	@Test
	public void turnsToWIfInstructionIsRAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, 'S'));
		rover.command('R');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('W', position.getDirection());
	}

	@Test
	public void turnsToSIfInstructionIsRAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, 'E'));
		rover.command('R');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('S', position.getDirection());
	}

	@Test
	public void turnsToNIfInstructionIsRAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, 'W'));
		rover.command('R');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('N', position.getDirection());
	}

	@Test
	public void movesInXIfInstructionIsMAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, 'N'));
		rover.command('M');
		Position position = rover.getCurrent();
		Assert.assertEquals(2, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('N', position.getDirection());
	}

	@Test
	public void movesInYIfInstructionIsMAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, 'E'));
		rover.command('M');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(2, position.getY());
		Assert.assertEquals('E', position.getDirection());
	}

	@Test
	public void movesInReverseXIfInstructionIsMAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, 'S'));
		rover.command('M');
		Position position = rover.getCurrent();
		Assert.assertEquals(0, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('S', position.getDirection());
	}

	@Test
	public void movesInReverseYIfInstructionIsMAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, 'W'));
		rover.command('M');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(0, position.getY());
		Assert.assertEquals('W', position.getDirection());
	}
}
