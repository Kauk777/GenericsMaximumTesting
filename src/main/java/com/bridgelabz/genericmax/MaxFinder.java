package com.bridgelabz.genericmax;

public class MaxFinder {
	Integer x, y, z;

	public Integer maximumValue(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		printMax(x, y, z, max);
		return max;
	}

	public void printMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.println("Maximum of " + x + ", " + y + ", " + z + " is " + max);
	}
}
