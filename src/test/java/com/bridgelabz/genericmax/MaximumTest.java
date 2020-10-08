package com.bridgelabz.genericmax;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

	@Test
	public void whenGivenIntegers_maximum_shouldReturnTrue() {

		Integer result = new MaxFinder<Integer>().maximumValue(7, 4, 3, 2, 41, 5);
		Assert.assertSame(41, result);
	}

	@Test
	public void whenGivenFloat_maximum_shouldReturnTrue() {

		Float result = new MaxFinder<Float>().maximumValue(7.54f, 4.20f, 7.45f, 14.5f, 8.4f);
		Assert.assertEquals(14.5f, result, 0.0f);
	}

	@Test
	public void whenGivenString_maximumAtFirst_shouldReturnTrue() {
		String result = new MaxFinder<String>().maximumValue("Peach", "Apple", "Grape", "Guava", "Orange");
		Assert.assertEquals("Peach", result);
	}

}
