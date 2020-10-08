package com.bridgelabz.genericmax;

public class MaxFinder<T extends Comparable<T>> {
	T x, y, z;

	public MaxFinder(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T maximumValue() {
		return this.maximumValue(x, y, z);
	}

	public <T extends Comparable<T>> T maximumValue(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		printMax(x, y, z, max);
		return max;
	}

	public <T> void printMax(T x, T y, T z, T max) {
		System.out.println("Maximum of " + x + ", " + y + ", " + z + " is: " + max);
	}

}
