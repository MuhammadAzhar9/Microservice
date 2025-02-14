package com.azhar.microservices.order.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.azhar.microservices.order.dto.OrderRequest;
import com.azhar.microservices.order.model.Order;
import com.azhar.microservices.order.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder( OrderRequest orderRequest) {
        // map OrderRequest to Order Object
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setSkuCode(orderRequest.skuCode());
        order.setPrice(orderRequest.price());
        order.setQuantity(orderRequest.quantity());

        // save Order object to Order Repository
        orderRepository.save(order);
    }

}
