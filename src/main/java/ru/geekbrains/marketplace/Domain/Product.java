package ru.geekbrains.marketplace.Domain;

import org.springframework.stereotype.Component;

@Component
public class Product {

    private int id;
    private String title;
    private long cost;

    public Product(int id) {
        this.id = id;
        this.title = "product" + id;
        this.cost = id*1000;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }
}

