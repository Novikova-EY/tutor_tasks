package ru.novikova.tutor.homework.lesson6;

import java.util.concurrent.atomic.AtomicInteger;

public class Entry {
    private int id;
    private int quantity;
    private Product product;
    private static AtomicInteger counterId = new AtomicInteger(1);

    public Entry() {
        this.id = counterId.getAndIncrement();
        this.quantity = (int) (Math.random() * 1000);
        this.product = new Product();
        product.generator();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", quantity=" + quantity + ", " + product;
    }
}
