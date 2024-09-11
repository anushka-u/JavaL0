package com.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetItems {

        public static void main(String[] args) {
            // Create some items
            Item item1 = new Item("Laptop", 1000.00);
            Item item2 = new Item("Phone", 500.00);
            Item item3 = new Item("Headphones", 100.00);
            Item item4 = new Item("Tablet", 300.00);
            Item item5 = new Item("Smartwatch", 200.00);

            // Create orders with lists of items
            Order order1 = new Order(Arrays.asList(item1, item2));
            Order order2 = new Order(Arrays.asList(item3, item4));
            Order order3 = new Order(Arrays.asList(item5));

            // Create customers with lists of orders
            Customer customer1 = new Customer(Arrays.asList(order1, order2));
            Customer customer2 = new Customer(Arrays.asList(order3));

            // Create a list of customers
            List<Customer> customers = Arrays.asList(customer1, customer2);

            List<String> itemName = customers.stream().flatMap(customer -> customer.getOrder().stream())
                    .flatMap(order -> order.getItems().stream()).filter(item -> "Laptop".equalsIgnoreCase(item.getItemName()))
                    .map(it -> it.getItemName()).collect(Collectors.toList());

            itemName.forEach(item -> System.out.println(item));


        }
    }
