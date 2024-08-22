package com.demo.demo66.core.Web.Controller;


import com.demo.demo66.core.Service.OrderService;
import com.demo.demo66.core.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/{id}")
    public ResponseEntity<List<Order>> getOrderByCustomer(@PathVariable long id) {
        return orderService.getByCustomerId(id);
    }

    @PostMapping("/order")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }
}
