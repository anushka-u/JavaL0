package com.in.supplier;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> supplier = () ->{
			String otpString = "";
			for(int i = 1 ;i<= 5;i++)
			{
				otpString= otpString+(int)(Math.random()*10);
			}
			return otpString.toString();
		};
		
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());

	}

}
