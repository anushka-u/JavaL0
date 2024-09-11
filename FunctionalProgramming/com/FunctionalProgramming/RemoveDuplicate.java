package com.FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,32,4,2,5,5,6,7));
        list = list.stream().distinct().sorted(Integer::compareTo).collect(Collectors.toList());
        System.out.println(list);
    }
}
