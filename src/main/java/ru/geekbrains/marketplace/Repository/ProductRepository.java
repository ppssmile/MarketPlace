package ru.geekbrains.marketplace.Repository;

import ru.geekbrains.marketplace.Domain.Product;

import java.util.List;


public interface ProductRepository{

    List<Product> getProducts();

    void setProducts();

    Product getProduct(int id);
}
