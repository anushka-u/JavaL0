package com.in.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionWithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Ravi", 12));
		employees.add(new Employee("Ratan", 11));
		employees.add(new Employee("Kavya", 1));
		employees.add(new Employee("kanak", 2));
		
		List<String> list = employees.stream().map(e -> e.name).collect(Collectors.toList());
		System.out.println(employees);

	}

}
