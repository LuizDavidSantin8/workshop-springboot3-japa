package com.Luiz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Luiz.course.entities.Category;
import com.Luiz.course.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
