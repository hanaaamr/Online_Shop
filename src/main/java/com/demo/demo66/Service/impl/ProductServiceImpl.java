package com.demo.demo66.Service.impl;

import com.demo.demo66.Entity.Product;
import com.demo.demo66.Service.ProductService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> products() {
        List<Product> products = new LinkedList<>();
        products.add(new Product(1L,"fff","fff"));
        return products;
    }
}
