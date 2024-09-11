package com.FunctionalProgramming;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Even {

    public static void main(String[] args) throws Exception {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(14);numbers.add(12);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);

        numbers = numbers.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println(numbers);




    }
}
