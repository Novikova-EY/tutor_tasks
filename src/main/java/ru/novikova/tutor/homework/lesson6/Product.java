package ru.novikova.tutor.homework.lesson6;

import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    private String code;
    private String name;
    private double price;
    private String category;

    private List<String> categories = List.of("Clothes", "Shoes", "Hats", "Accessories");
    private static AtomicInteger counterName = new AtomicInteger(1);

    public Product() {
    }

    public void generator() {
        this.code = String.valueOf((int) ((Math.random() * 1000) + 900));
        this.name = "name_" + (int) ((Math.random() * 9999));;
        this.price = Math.random() * 10000;
        this.category = categories.get((int) (Math.random() * categories.size()));
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + String.format("%.2f", price) +
                ", category='" + category + '\'' +
                '}' + "\n";
    }
}
