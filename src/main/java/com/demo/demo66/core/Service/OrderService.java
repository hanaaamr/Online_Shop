package com.demo.demo66.core.Service;

import com.demo.demo66.core.domain.Order;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface OrderService {
    public ResponseEntity<Order> addOrder(Order order);
    public ResponseEntity<List<Order>> getByCustomerId(Long customerId);
}
