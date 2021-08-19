package ru.geekbrains.marketplace.Repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.geekbrains.marketplace.Domain.Product;
import ru.geekbrains.marketplace.Repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Repository("productRepository")
public class ProductRepositoryImpl implements ProductRepository {

    private static List<Product> products;

    public ProductRepositoryImpl() {
        products=new ArrayList<>();
        setProducts();
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void setProducts() {
        for (int i = 0; i < 5; i++) {
            products.add(new Product(i));
        }
    }

    @Override
    public Product getProduct(int id) {
        for (Product iter: products) {
            if (iter.getId()==id){
                return iter;
            }
        }
        return null;
    }
}
