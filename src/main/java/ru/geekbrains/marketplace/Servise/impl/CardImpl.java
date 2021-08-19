package ru.geekbrains.marketplace.Servise.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ru.geekbrains.marketplace.Domain.Product;
import ru.geekbrains.marketplace.Repository.ProductRepository;
import ru.geekbrains.marketplace.Repository.impl.ProductRepositoryImpl;
import ru.geekbrains.marketplace.Servise.Card;

import java.util.HashMap;
import java.util.Map;

@Service("card")
@Scope("prototype")
public class CardImpl implements Card {

    Map<Integer, Product> basket;

    public CardImpl() {
        this.basket = new HashMap<>();
    }

    @Override
    public Map<Integer, Product> getBasket() {
        return this.basket;
    }

    @Override
    public void addProductBasket(int id) {
        ProductRepository repository = new ProductRepositoryImpl();
        basket.put(id, repository.getProduct(id));
    }

    @Override
    public void removeProductBasket(int id) {
        basket.remove(id);
    }

    @Override
    public void addAllProductsBasket() {
        ProductRepository repository = new ProductRepositoryImpl();
        for (int i = 0; i < repository.getProducts().size(); i++) {
            basket.put(i, repository.getProduct(i));
        }
    }
}
