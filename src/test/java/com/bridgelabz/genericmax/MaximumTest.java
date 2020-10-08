package com.bridgelabz.genericmax;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

	@Test
	public void whenGivenIntegers_maximumAtFirst_shouldReturnTrue() {

		Integer result = new MaxFinder<Integer>(7, 4, 3).maximumValue();
		Assert.assertSame(7, result);
	}

	@Test
	public void whenGivenIntegers_maximumAtSecond_shouldReturnTrue() {

		Integer result = new MaxFinder<Integer>(4, 7, 3).maximumValue();
		Assert.assertSame(7, result);
	}

	@Test
	public void whenGivenIntegers_maximumAtThird_shouldReturnTrue() {

		Integer result = new MaxFinder<Integer>(4, 3, 7).maximumValue();
		Assert.assertSame(7, result);
	}

	@Test
	public void whenGivenFloat_maximumAtFirst_shouldReturnTrue() {

		Float result = new MaxFinder<Float>(7.54f, 4.20f, 7.45f).maximumValue();
		Assert.assertEquals(7.54f, result, 0.0f);
	}

	@Test
	public void whenGivenFloat_maximumAtSecond_shouldReturnTrue() {

		Float result = new MaxFinder<Float>(4.20f, 7.54f, 7.45f).maximumValue();
		Assert.assertEquals(7.54f, result, 0.0f);
	}

	@Test
	public void whenGivenFloat_maximumAtThird_shouldReturnTrue() {

		Float result = new MaxFinder<Float>(7.45f, 4.20f, 7.54f).maximumValue();
		Assert.assertEquals(7.54f, result, 0.0f);
	}

	@Test
	public void whenGivenString_maximumAtFirst_shouldReturnTrue() {
		String result = new MaxFinder<String>("Peach", "Apple", "Grape").maximumValue();
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void whenGivenString_maximumAtSecond_shouldReturnTrue() {
		String result = new MaxFinder<String>("Apple", "Peach", "Grape").maximumValue();
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void whenGivenString_maximumAtThird_shouldReturnTrue() {
		String result = new MaxFinder<String>("Apple", "Grape", "Peach").maximumValue();
		Assert.assertEquals("Peach", result);
	}

}
