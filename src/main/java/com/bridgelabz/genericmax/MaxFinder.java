package com.bridgelabz.genericmax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MaxFinder<T> {


	public T maximumValue(T... elements) {
		List<T> list=new ArrayList<>();
		for(T e:elements)
			list.add(e);
		Collections.sort(list, Collections.reverseOrder());
		T max=list.get(0);
		printMax(max, elements);
		return max;
	}
	public <T> void printMax(T max, T... elements) {
		System.out.print("The max element of ");
		for(T e:elements)
			System.out.print(e+", ");
		System.out.print(" is: "+max+"\n");
	}

}
