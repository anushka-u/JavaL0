package com.in.functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Original predicate checks if a number is greater than 10
        Predicate<Integer> greaterThan10 = num -> num > 10;

        // Using the negate() method to create a new predicate that checks if a number is NOT greater than 10
        Predicate<Integer> notGreaterThan10 = greaterThan10.negate();

        // Test the predicates
        System.out.println(greaterThan10.test(15));     // Output: true
        System.out.println(notGreaterThan10.test(15));  // Output: false
    }
}