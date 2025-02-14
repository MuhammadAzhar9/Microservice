package com.azhar.microservices.order.repository;

import com.azhar.microservices.order.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
