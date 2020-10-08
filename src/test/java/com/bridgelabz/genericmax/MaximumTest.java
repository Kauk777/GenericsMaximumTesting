package com.bridgelabz.genericmax;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumTest {
	MaxFinder maxValue;

	@Before
	public void intalize() {
		maxValue = new MaxFinder();
	}

	@Test
	public void whenGivenIntegers_maximumAtFirst_shouldReturnTrue() {
		Integer result = maxValue.maximumIntValue(7, 4, 3);
		Assert.assertSame(7, result);
	}

	@Test
	public void whenGivenIntegers_maximumAtSecond_shouldReturnTrue() {
		Integer result = maxValue.maximumIntValue(4, 7, 3);
		Assert.assertSame(7, result);
	}

	@Test
	public void whenGivenIntegers_maximumAtThird_shouldReturnTrue() {
		Integer result = maxValue.maximumIntValue(4, 3, 7);
		Assert.assertSame(7, result);
	}

	@Test
	public void whenGivenFloat_maximumAtFirst_shouldReturnTrue() {
		Float result = maxValue.maximumFloatValue(7.54f, 4.20f, 7.45f);
		Assert.assertEquals(7.54f, result, 0.0f);
	}

	@Test
	public void whenGivenFloat_maximumAtSecond_shouldReturnTrue() {
		Float result = maxValue.maximumFloatValue(4.20f, 7.54f, 7.45f);
		Assert.assertEquals(7.54f, result, 0.0f);
	}

	@Test
	public void whenGivenFloat_maximumAtThird_shouldReturnTrue() {
		Float result = maxValue.maximumFloatValue(4.20f, 7.45f, 7.54f);
		Assert.assertEquals(7.54f, result, 0.0f);
	}

	@Test
	public void whenGivenString_maximumAtFirst_shouldReturnTrue() {
		String result = maxValue.maximumStringValue("Peach", "Apple", "Grape");
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void whenGivenString_maximumAtSecond_shouldReturnTrue() {
		String result = maxValue.maximumStringValue("Apple", "Peach", "Grape");
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void whenGivenString_maximumAtThird_shouldReturnTrue() {
		String result = maxValue.maximumStringValue("Apple", "Grape", "Peach");
		Assert.assertEquals("Peach", result);
	}
}
