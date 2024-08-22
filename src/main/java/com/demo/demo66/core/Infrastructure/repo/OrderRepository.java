package com.demo.demo66.core.Infrastructure.repo;

import com.demo.demo66.core.domain.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByUserId(Long userId);
    Order save(Order order);
}
