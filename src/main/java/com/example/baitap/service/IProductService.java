package com.example.baitap.service;

import com.example.baitap.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Product> getAll();
    Product save(Product product);

    Optional<Product> findById(int id);

    void update(Product product);
    void delete(Product product);
}
