package com.FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumInList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,5,3,2,6,9,12));
        int max = numbers.stream().max(Integer::compareTo).get();
        System.out.println(max);


    }
        }
