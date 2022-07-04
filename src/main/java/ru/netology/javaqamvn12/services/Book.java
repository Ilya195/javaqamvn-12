package ru.netology.javaqamvn12.services;
public class Book extends Product {
    private String author;

    public Book(int id, String name, int price, String title, String author) {
        super(id, name, price, title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
