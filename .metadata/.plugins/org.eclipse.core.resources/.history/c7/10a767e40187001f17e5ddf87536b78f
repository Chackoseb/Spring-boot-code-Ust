package com.ust.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.security.model.Product;
import com.ust.security.repository.ProductRepository;



@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product addProduct(Product newProduct) {
		return repository.save(newProduct);
	}
	

}
