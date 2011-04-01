package com.eric4tw.pair2;

import junit.framework.Assert;

import org.junit.Test;

public class RoverTest {
	@Test
	public void turnsToWIfInstructionIsLAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, Directions.NORTH));
		rover.command(Instruction.LEFT);		
		Assert.assertEquals(new Rover(new Position(1,1,Directions.WEST)), rover);
	}

	@Test
	public void turnsToEIfInstructionIsLAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, Directions.SOUTH));
		rover.command(Instruction.LEFT);
		Assert.assertEquals(new Rover(new Position(1,1,Directions.EAST)), rover);
	}

	@Test
	public void turnsToNIfInstructionIsLAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, Directions.EAST));
		rover.command(Instruction.LEFT);
		Assert.assertEquals(new Rover(new Position(1,1,Directions.NORTH)), rover);		
	}

	@Test
	public void turnsToSIfInstructionIsLAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, Directions.WEST));
		rover.command(Instruction.LEFT);
		Assert.assertEquals(new Rover(new Position(1,1,Directions.SOUTH)), rover);
		
	}

	@Test
	public void turnsToEIfInstructionIsRAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, Directions.NORTH));
		rover.command(Instruction.RIGHT);
		Assert.assertEquals(new Rover(new Position(1,1,Directions.EAST)), rover);
		
	}

	@Test
	public void turnsToWIfInstructionIsRAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, Directions.SOUTH));
		rover.command(Instruction.RIGHT);
		Assert.assertEquals(new Rover(new Position(1,1,Directions.WEST)), rover);
		
	}

	@Test
	public void turnsToSIfInstructionIsRAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, Directions.EAST));
		rover.command(Instruction.RIGHT);
		Assert.assertEquals(new Rover(new Position(1,1,Directions.SOUTH)), rover);
		
	}

	@Test
	public void turnsToNIfInstructionIsRAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, Directions.WEST));
		rover.command(Instruction.RIGHT);
		Assert.assertEquals(new Rover(new Position(1,1,Directions.NORTH)), rover);
		
	}

	@Test
	public void movesInYIfInstructionIsMAndDirectionIsN() {
		Rover rover = new Rover(new Position(1, 1, Directions.NORTH));
		rover.command(Instruction.MIDDLE);
		Assert.assertEquals(new Rover(new Position(1,2,Directions.NORTH)), rover);
		
	}

	@Test
	public void movesInXIfInstructionIsMAndDirectionIsE() {
		Rover rover = new Rover(new Position(1, 1, Directions.EAST));
		rover.command(Instruction.MIDDLE);
		Assert.assertEquals(new Rover(new Position(2,1,Directions.EAST)), rover);
		
	}

	@Test
	public void movesInReverseYIfInstructionIsMAndDirectionIsS() {
		Rover rover = new Rover(new Position(1, 1, Directions.SOUTH));
		rover.command(Instruction.MIDDLE);
		Assert.assertEquals(new Rover(new Position(1,0,Directions.SOUTH)), rover);
		
	}

	@Test
	public void movesInReverseXIfInstructionIsMAndDirectionIsW() {
		Rover rover = new Rover(new Position(1, 1, Directions.WEST));
		rover.command(Instruction.MIDDLE);
		Assert.assertEquals(new Rover(new Position(0,1,Directions.WEST)), rover);
		
	}
}
