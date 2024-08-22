package com.demo.demo66.core.Service;

import com.demo.demo66.core.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product addProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Long id);
}
