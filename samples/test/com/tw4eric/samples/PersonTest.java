package com.tw4eric.samples;

import junit.framework.Assert;
import static com.tw4eric.samples.Gender.*;
import org.junit.Test;

public class PersonTest {
	@Test
	public void maleOf22YrsCanMarry() {
		Assert.assertTrue(new Person(MALE, 22).canMarry());
	}

	@Test
	public void maleOf20YrsCannotMarry() {
		Assert.assertFalse(new Person(MALE, 20).canMarry());
	}

	@Test
	public void maleOf21YrsCanMarry() {
		Assert.assertTrue(new Person(MALE, 21).canMarry());
	}

	@Test
	public void femaleOf19YrsCanMarry() {
		Assert.assertTrue(new Person(FEMALE, 19).canMarry());
	}

	@Test
	public void femaleOf17YrsCannotMarry() {
		Assert.assertFalse(new Person(FEMALE, 17).canMarry());
	}

	@Test
	public void femaleOf18YrsCanMarry() {
		Assert.assertTrue(new Person(FEMALE, 19).canMarry());
	}
}
