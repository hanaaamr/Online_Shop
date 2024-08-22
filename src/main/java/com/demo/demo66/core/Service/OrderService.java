package com.demo.demo66.core.Service;

import com.demo.demo66.core.domain.Order;
import org.springframework.http.ResponseEntity;

public interface OrderService {
    public ResponseEntity<Order> addOrder(Order order);
    public ResponseEntity<Order> getByCustomerId(Long customerId);
}
