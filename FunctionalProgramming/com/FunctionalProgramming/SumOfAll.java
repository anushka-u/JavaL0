package com.FunctionalProgramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAll {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,3,52,3,2,3,3,21));
        /*
        Purpose: To aggregate elements of the stream into a single result.
        Parameters: It takes two primary forms:
        reduce(identity, accumulator):
        identity: The initial value for the reduction operation.
        accumulator: A function that takes two parameters and combines them. It is applied to each element of the stream.
        reduce(accumulator) (without an identity):
        accumulator: A function that takes two parameters and combines them. The reduction starts with the first two elements of the stream.
         */
        int sum = list.stream().reduce(1,(a,b)->a+b);
        System.out.println(sum);
        int multiply = list.stream().reduce(1,(a,b)->a*b);
        System.out.println(multiply);
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println(max.orElse(0));
    }
}
