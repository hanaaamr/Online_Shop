package com.demo.demo66.repo;

import com.demo.demo66.Entity.Product;
import com.demo.demo66.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
