package com.in.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer = (arg) -> System.out.println(arg + ", Welcome in our Resort!");
		consumer.accept("Hello");

	}

}
