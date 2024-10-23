package com.ust.digital_wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.digital_wallet.entity.User1;

@Repository
public interface UserRepository extends JpaRepository<User1, Long>{}
