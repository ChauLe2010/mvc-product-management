package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    static List<Product> products=new ArrayList<>();
    static{
        products.add(new Product(1,"Tivi",100,"Ti vi xem choi "));
        products.add(new Product(2,"Tu lanh",50,"Tu lanh papa "));
        products.add(new Product(3,"May giat",200,"May giat "));
        products.add(new Product(4,"Dieu hoa",150,"Dieu hoa "));
    }

    @Override
    public List<Product> findAllProduct() {
        return products;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void delete(int id) {

    }
}
