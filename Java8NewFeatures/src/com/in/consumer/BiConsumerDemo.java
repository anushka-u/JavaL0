package com.in.consumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiConsumer<String, String> biConsumer = (arg1,arg2) -> System.out.println("Hello, My name is "+ arg1 + " My Friend here is "+ arg2);
		biConsumer.accept("Harlini", "kumud");
	}

}
