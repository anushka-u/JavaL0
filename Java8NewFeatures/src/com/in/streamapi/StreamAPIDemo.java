package com.in.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Approach to create Stream
		
		Stream<String> stream = Stream.of("Anu","Bhaskar","Bhuvnesh","Aastha");
		
		//or it can be created in below way as well
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(2);
		list.add(3);
		list.add(13);
		list.add(21);
		list.add(1);
		
		Stream<Integer> stream2 = list.stream();
		
		//stream filtering
		
		//way 1
//		Stream<Integer>filStream = stream2.filter(i-> i >=5);
//		filStream.forEach(System.out::println);
		
		//way 2
		stream2.filter(i->i>=5).forEach(System.out::println);
		
		//stream.filter(name->name.startsWith("A")).forEach(System.out::println);
		
		Person p1 = new Person(1, "Associate", 18);
		Person p2 = new Person(2, "Associate", 17);
		Person p3 = new Person(3, "PA", 20);
		Person p4 = new Person(4, "Associate", 16);
		Person p5 = new Person(5, "SE", 21);
		
		List<Person> list2 = Arrays.asList(p1,p2,p3,p4,p5);
		Stream<Person> stream3 = list2.stream();
		
		stream3.filter(p-> p.age>=18 && p.position.equals("Associate")).forEach(System.out::println);
		
		
		//Print name and length of those whose name start with A
		
		stream.filter(name -> name.startsWith("A")).map(name-> name + "::" + name.length()).forEach(System.out::println);
		
		//FlatMap are used to flatten the stream when we have collection inside collection
		
		List<String> li = Arrays.asList("Java","SBMS","REST API");
		List<String> li2 =  Arrays.asList("HTML","CSS","JS");
		List<String>li3 = Arrays.asList("AWS","GoogleCloud","Devops");
		
		List<List<String>> list3 = Arrays.asList(li,li2,li3);
		
		Stream<List<String>> course = list3.stream();
		course.flatMap(s-> s.stream()).forEach(System.out::println);
		
		}
	}

