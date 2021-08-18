package ru.geekbrains.marketplace.Repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.geekbrains.marketplace.Domain.Product;
import ru.geekbrains.marketplace.Repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Repository("ProductRepository")
public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> products;

    @Autowired
    public ProductRepositoryImpl() {
        products=new ArrayList<>();
        setProducts();
    }

    @Override
    public List<Product> getProducts() {
        return this.products;
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
