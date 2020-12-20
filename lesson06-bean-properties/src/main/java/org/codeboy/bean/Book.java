package org.codeboy.bean;

public class Book {
    private String name;
    private String category;
    private float price;

    public Book(String name, String category, float price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
