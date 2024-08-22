package com.demo.demo66.core.Infrastructure.repo;

import com.demo.demo66.core.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
