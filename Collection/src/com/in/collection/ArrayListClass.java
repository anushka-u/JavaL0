package com.in.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(23);
		list.add(10);
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		
	}

}
