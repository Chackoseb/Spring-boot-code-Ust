package com.ust.digital_wallet.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Documents {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int docId;
    private String docType;
    private String credNumber;
    private String issueDate;
    private String expiryDate;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User1 user;
}
