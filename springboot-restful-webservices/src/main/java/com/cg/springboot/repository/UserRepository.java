package com.cg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
