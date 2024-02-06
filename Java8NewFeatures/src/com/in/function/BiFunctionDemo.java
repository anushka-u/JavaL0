package com.in.function;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer, Integer, Integer> biFunction = (x,y) -> x+y;
		System.out.println(biFunction.apply(4, 14));
	}

}
