package ru.geekbrains.marketplace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.geekbrains.marketplace.Domain.Product;
import ru.geekbrains.marketplace.Servise.impl.BasketImpl;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.geekbrains.marketplace.Configuration.MarketPlaceConfiguration.class");
        BasketImpl basket = context.getBean("basketImpl", BasketImpl.class);
        basket.addAllProductsBasket();
        for (Map.Entry<Integer,Product> iter:basket.getBasket().entrySet()) {
            System.out.println("id = " + iter.getKey() + "   product - "+ iter.getValue());
        }
    }
}
