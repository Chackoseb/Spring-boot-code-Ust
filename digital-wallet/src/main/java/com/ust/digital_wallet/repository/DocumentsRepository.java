package com.ust.digital_wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.digital_wallet.entity.Documents;

@Repository
public interface DocumentsRepository extends JpaRepository<Documents, Integer>{

}
