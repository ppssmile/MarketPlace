package ru.geekbrains.marketplace.Servise.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ru.geekbrains.marketplace.Domain.Product;
import ru.geekbrains.marketplace.Servise.Basket;

import java.util.HashMap;
import java.util.Map;

@Service
@Scope("prototype")
public class BasketImpl implements Basket {

    Map<Integer, Product> basket;

    @Autowired
    public BasketImpl() {
        this.basket = new HashMap<>();
    }

    @Override
    public Map<Integer, Product> getBasket() {
        return this.basket;
    }

    @Override
    public void addProductBasket(Product product) {
        basket.put(product.getId(), product);
    }

    @Override
    public void removeProductBasket(Product product) {
        basket.remove(product.getId());
    }

    @Override
    public void addAllProductsBasket() {

    }
}
