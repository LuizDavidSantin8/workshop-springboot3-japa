package com.Luiz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Luiz.course.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
