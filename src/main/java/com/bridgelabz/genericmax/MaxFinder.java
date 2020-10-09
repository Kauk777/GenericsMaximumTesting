package com.bridgelabz.genericmax;

public class MaxFinder<T extends Comparable<T>> {
	
	public <T extends Comparable<T>> T maximumValue(T x, T y, T z, T... elements) {
		T max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		if(elements.length!=0)
			max=findWithOptional(max,elements);
		printMax(max, x, y, z, elements);
		return max;
	}
	
	public <T extends Comparable<T>> T findWithOptional(T max, T... elements) {
		for(T element:elements)
			if(element.compareTo(max)>0)
				max=element;
		return max;
	}
	public <T> void printMax(T max, T x, T y, T z, T... elements) {
		System.out.print("The max element of "+x+", "+y+", "+z+", ");
		for(T e:elements)
			System.out.print(e+", ");
		System.out.print(" is: "+max+"\n");
	}

}
