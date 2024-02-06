package com.in.methodreference;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceDemo {

	public int cool() {
		return 9;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> consumer = System.out::println;
		consumer.accept("Nalanda");
		
		Function<MethodReferenceDemo, Integer> function = MethodReferenceDemo::cool;
		System.out.println(function.apply(new MethodReferenceDemo()));
	}

}
