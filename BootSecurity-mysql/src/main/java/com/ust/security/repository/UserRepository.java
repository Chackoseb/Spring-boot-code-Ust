package com.ust.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.security.model.MyUser;


public interface UserRepository extends JpaRepository<MyUser, Long>{
	Optional<MyUser> findByUsername(String username);

}
