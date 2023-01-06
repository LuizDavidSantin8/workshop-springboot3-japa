package com.Luiz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Luiz.course.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{

}
