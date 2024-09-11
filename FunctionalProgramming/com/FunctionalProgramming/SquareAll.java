package com.FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAll {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(2,4,1,3,4,3,2,5,6,6,6,7));
        nums=nums.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(nums);


    }
}
