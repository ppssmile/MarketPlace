package ru.geekbrains.marketplace.Servise;

import ru.geekbrains.marketplace.Domain.Product;

import java.util.Map;

public interface Basket {

    Map<Integer, Product> getBasket();

    void addProductBasket(Product product);

    void removeProductBasket(Product product);

    void addAllProductsBasket();
}
