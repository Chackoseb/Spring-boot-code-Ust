package com.ust.digital_wallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.digital_wallet.entity.Documents;
import com.ust.digital_wallet.entity.User1;
import com.ust.digital_wallet.repository.DocumentsRepository;
import com.ust.digital_wallet.repository.UserRepository;

@Service
public class WalletService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DocumentsRepository documentRepository;

    // User operations
    public List<User1> getAllUsers() {
        return userRepository.findAll();
    }

    public User1 getUserById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User1 createUser(User1 user) {
        return userRepository.save(user);
    }

    public User1 updateUser(long id, User1 user) {
        user.setPhoneNo(id);
        return userRepository.save(user);
    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    // Document operations
    public List<Documents> getAllDocuments() {
        return documentRepository.findAll();
    }

    public Documents getDocumentById(int id) {
        return documentRepository.findById(id).orElse(null);
    }
    
    public Documents addDocumentToUser(long userId, Documents document) {
        User1 user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            // Assign a new docId based on the current size of the user's documents
//            int newDocId = user.getDocuments().size() + 1; 
//            document.setDocId(newDocId); // Set the new docId
            document.setUser(user); // Associate document with user
            documentRepository.save(document); 
            user.getDocuments().add(document); // Add document to user's document list
            userRepository.save(user); // Save user to persist the document
            return document; // Return the saved document
        }
        return null; // If user is not found, return null
    }
    public Documents getDocumentByUserIdAndDocType(long userId, String docType) {
        User1 user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            for (Documents doc : user.getDocuments()) {
                if (doc.getDocType().equalsIgnoreCase(docType)) {
                    return doc; // Return the document if the type matches
                }
            }
        }
        return null; // Return null if user or document not found
    }


    public void deleteDocument(int id) {
        documentRepository.deleteById(id);
    }
}
