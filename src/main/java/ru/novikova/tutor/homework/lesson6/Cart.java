package ru.novikova.tutor.homework.lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {

    public static void main(String[] args) {
        //Get a collection of products in cart
        ArrayList<Entry> entries = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            entries.add(new Entry());
        }

        CartService cartService = new CartService();
        cartService.getCartEntries(entries);

        //Get cart total price
        System.out.println(entries.stream().mapToDouble(x -> x.getProduct().getPrice()).sum());
        System.out.println(entries.stream().mapToDouble(x -> x.getQuantity()).sum());
        double totalPrice = entries.stream().mapToDouble(x -> (x.getProduct().getPrice() * x.getQuantity())).sum();
        System.out.println("totalPrice = " + totalPrice);

//        Сheck that no entry total does not exceed 1000
        if (entries.stream().filter(x -> x.getQuantity() >= 1000).count() == 0) {
            System.out.println("No entry total does not exceed 1000");
        };

//        Сheck that at least 1 entry quantity > 10
        if (entries.stream().anyMatch(x -> x.getQuantity() > 10)) {
            System.out.println("At least 1 entry quantity > 10");
        };

//        Get entry with quantity > 3
        entries.stream()
                .filter(x -> x.getQuantity() > 3)
                .forEach(x -> System.out.println(x));

//        Get max and min product price in cart
        entries.stream()
                .mapToDouble(v -> v.getProduct().getPrice())
                .max();

        entries.stream()
                .mapToDouble(v -> v.getProduct().getPrice())
                .min();

//        Sort entry by asc product price
        entries.stream()
                .mapToDouble(x -> x.getProduct().getPrice())
                .sorted()
                .forEach(x -> System.out.println(x));

//        Sort entry by desc product name
        entries.stream()
                .map(x -> x.getProduct().getName())
                .sorted((x, y) -> (y.compareTo(x)))
                .forEach(x -> System.out.println(x));

//        Get list all product names in cart
        List<String> productNames = entries.stream()
                .map(x -> x.getProduct().getName())
                .collect(Collectors.toList());
        System.out.println("productNames = " + productNames);

//        Get all entries with product category “Shoes”
        List<Entry> entryShoes = entries.stream()
                .filter(x -> x.getProduct().getCategory().equals("Shoes"))
                .collect(Collectors.toList());
        System.out.println("entryShoes = " + entryShoes);

//        Get unique collection of all categories in cart
        entries.stream()
                .map(x -> x.getProduct().getCategory())
                .distinct()
                .forEach(x -> System.out.println(x));

    }
}
