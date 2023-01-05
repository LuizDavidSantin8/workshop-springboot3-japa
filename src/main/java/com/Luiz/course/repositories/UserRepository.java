package com.Luiz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Luiz.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
