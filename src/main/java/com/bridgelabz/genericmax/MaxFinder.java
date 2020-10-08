package com.bridgelabz.genericmax;

public class MaxFinder {
	Integer x, y, z;
	Float xF,yF,zF;

	public Integer maximumIntValue(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		printIntMax(x, y, z, max);
		return max;
	}
	public Float maximumFloatValue(Float xF, Float yF, Float zF) {
		Float max = xF;
		if (yF.compareTo(max) > 0)
			max = yF;
		if (zF.compareTo(max) > 0)
			max = zF;
		printFloatMax(xF, yF, zF, max);
		return max;
	}

	public void printIntMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.println("Maximum of " + x + ", " + y + ", " + z + " is: " + max);
	}
	public void printFloatMax(Float x, Float y, Float z, Float max) {
		System.out.println("Maximum of " + x + ", " + y + ", " + z + " is: " + max);
	}
}
