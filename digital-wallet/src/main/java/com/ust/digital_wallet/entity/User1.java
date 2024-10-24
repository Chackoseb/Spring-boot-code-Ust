package com.ust.digital_wallet.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User1{


	@Id
    private Long phoneNo;
    private String name;
    
    @JsonManagedReference
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Documents> documents = new ArrayList<>();
    
//    public void addDocument(Documents document) {
//        documents.add(document);
//        document.setUser(this);
//    }
//
//    public void removeDocument(Documents document) {
//        documents.remove(document);
//        document.setUser(null);
//    }
}
