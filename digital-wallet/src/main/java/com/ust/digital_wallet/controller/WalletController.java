package com.ust.digital_wallet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.digital_wallet.entity.Documents;
import com.ust.digital_wallet.entity.User1;
import com.ust.digital_wallet.service.WalletService;

@RestController
@RequestMapping("/api/wallet")
public class WalletController {
    @Autowired
    private WalletService walletService;

    // User endpoints
    @GetMapping("/users")
    public List<User1> getAllUsers() {
        return walletService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User1> getUserById(@PathVariable int id) {
        User1 user = walletService.getUserById(id);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @PostMapping("/users")
    public User1 createUser(@RequestBody User1 user) {
        return walletService.createUser(user);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User1> updateUser(@PathVariable int id, @RequestBody User1 user) {
        User1 updatedUser = walletService.updateUser(id, user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        walletService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    // Document endpoints
    @GetMapping("/documents")
    public List<Documents> getAllDocuments() {
        return walletService.getAllDocuments();
    }

    @GetMapping("/documents/{id}")
    public ResponseEntity<Documents> getDocumentById(@PathVariable int id) {
        Documents document = walletService.getDocumentById(id);
        return document != null ? ResponseEntity.ok(document) : ResponseEntity.notFound().build();
    }

    @PostMapping("/users/{userId}/documents")
    public ResponseEntity<Documents> addDocumentToUser(@PathVariable int userId, @RequestBody Documents document) {
        Documents addedDocument = walletService.addDocumentToUser(userId, document);
        return addedDocument != null ? ResponseEntity.ok(addedDocument) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/documents/{id}")
    public ResponseEntity<Void> deleteDocument(@PathVariable int id) {
        walletService.deleteDocument(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/users/{userId}/documents/{docType}")
    public ResponseEntity<Documents> getDocumentByUserIdAndDocType(@PathVariable int userId, @PathVariable String docType) {
        Documents document = walletService.getDocumentByUserIdAndDocType(userId, docType);
        if (document != null) {
            return ResponseEntity.ok(document);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
    
