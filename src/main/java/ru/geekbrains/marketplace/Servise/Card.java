package ru.geekbrains.marketplace.Servise;

import ru.geekbrains.marketplace.Domain.Product;

import java.util.Map;

public interface Card {

    Map<Integer, Product> getBasket();

    void addProductBasket(int id);

    void removeProductBasket(int id);

    void addAllProductsBasket();
}
