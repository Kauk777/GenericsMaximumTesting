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
		System.out.println("Max of element is: "+list.get(0));
		return list.get(0);
	}

}
