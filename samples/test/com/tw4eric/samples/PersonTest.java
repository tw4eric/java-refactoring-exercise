package com.tw4eric.samples;

import junit.framework.Assert;

import org.junit.Test;

public class PersonTest {
	@Test
	public void maleOf22YrsCanMarry() {
		Assert.assertTrue(new Person('M', 22).canMarry());
	}

	@Test
	public void maleOf20YrsCannotMarry() {
		Assert.assertFalse(new Person('M', 20).canMarry());
	}

	@Test
	public void maleOf21YrsCanMarry() {
		Assert.assertTrue(new Person('M', 21).canMarry());
	}

	@Test
	public void femaleOf19YrsCanMarry() {
		Assert.assertTrue(new Person('F', 19).canMarry());
	}

	@Test
	public void femaleOf17YrsCannotMarry() {
		Assert.assertFalse(new Person('F', 17).canMarry());
	}

	@Test
	public void femaleOf18YrsCanMarry() {
		Assert.assertTrue(new Person('F', 19).canMarry());
	}
}
