package com.eric4tw.pair2;

import junit.framework.Assert;

import org.junit.Test;
import src.Direction;
public class RoverTest {
	@Test
	public void turnsToWIfInstructionIsLAndDirectionIsN() {
		
		Rover rover = new Rover(new Position(1, 1,Direction.NORTH));
		rover.command('L');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getY());
		Assert.assertEquals('W', position.getDirection());
	}

	@Test
	public void turnsToEIfInstructionIsLAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, Direction.SOUTH));
		rover.command('L');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals('E', position.getDirection());
	}

	@Test
	public void turnsToNIfInstructionIsLAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, Direction.EAST));
		rover.command('L');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals('N', position.getDirection());
	}

	@Test
	public void turnsToSIfInstructionIsLAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, Direction.WEST));
		rover.command('L');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals('S', position.getDirection());
	}

	@Test
	public void turnsToEIfInstructionIsRAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, Direction.NORTH));
		rover.command('R');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals('E', position.getDirection());
	}

	@Test
	public void turnsToWIfInstructionIsRAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1,Direction.SOUTH));
		rover.command('R');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals('W', position.getDirection());
	}

	@Test
	public void turnsToSIfInstructionIsRAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1,Direction.EAST));
		rover.command('R');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals('S', position.getDirection());
	}

	@Test
	public void turnsToNIfInstructionIsRAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1,Direction.WEST));
		rover.command('R');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals('N', position.getDirection());
	}

	@Test
	public void movesInYIfInstructionIsMAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, 'N'));
		rover.command('M');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(2, position.getX());
		Assert.assertEquals('N', position.getDirection());
	}

	@Test
	public void movesInXIfInstructionIsMAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, 'E'));
		rover.command('M');
		Position position = rover.getCurrent();
		Assert.assertEquals(2, position.getX());
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals('E', position.getDirection());
	}

	@Test
	public void movesInReverseYIfInstructionIsMAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, 'S'));
		rover.command('M');
		Position position = rover.getCurrent();
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals(0, position.getX());
		Assert.assertEquals('S', position.getDirection());
	}

	@Test
	public void movesInReverseXIfInstructionIsMAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, 'W'));
		rover.command('M');
		Position position = rover.getCurrent();
		Assert.assertEquals(0, position.getX());
		Assert.assertEquals(1, position.getX());
		Assert.assertEquals('W', position.getDirection());
	}
}
