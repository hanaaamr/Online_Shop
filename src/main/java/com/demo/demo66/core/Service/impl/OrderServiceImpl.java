package com.demo.demo66.core.Service.impl;

import com.demo.demo66.core.Infrastructure.repo.OrderRepository;
import com.demo.demo66.core.Service.OrderService;
import com.demo.demo66.core.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;


    public ResponseEntity<List<Order>> getByCustomerId(Long customerId) {
        List<Order> order = orderRepository.findByUserId(customerId);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    public ResponseEntity<Order> addOrder(Order order) {
        orderRepository.save(order);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }



}
