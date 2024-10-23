package com.ust.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.security.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}