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
		Integer result = maxValue.maximumValue(7, 4, 3);
		Assert.assertSame(7, result);
	}

	@Test
	public void whenGivenIntegers_maximumAtSecond_shouldReturnTrue() {
		Integer result = maxValue.maximumValue(4, 7, 3);
		Assert.assertSame(7, result);
	}

	@Test
	public void whenGivenIntegers_maximumAtThird_shouldReturnTrue() {
		Integer result = maxValue.maximumValue(4, 3, 7);
		Assert.assertSame(7, result);
	}
}
