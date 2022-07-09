package com.portfolio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.course.entities.OrderItem;
import com.portfolio.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}