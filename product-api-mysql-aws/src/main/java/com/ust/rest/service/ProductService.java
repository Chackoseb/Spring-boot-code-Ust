package com.ust.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.model.Product;
import com.ust.rest.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product addProduct(Product newProduct) {
		return repository.save(newProduct);
	}
	
	public List<Product> getAllProducts() {
		return repository.findAll();
	}
	
	public Product getProductById(long id) {
		Optional<Product> productOptional = repository.findById(id);
		if(productOptional.isPresent()) 
			return productOptional.get();
		else 
			return null;
	}
	
	public void deleteProductById(long id) {
		repository.deleteById(id);
	}
	
	public Product updateProduct(Product product) {
		Optional<Product> productOptional = repository.findById(product.getId());
		if(productOptional.isPresent()) {
			return repository.save(product);
		}
		else
			return null;
	}
	
	public List<Product> getProductbrands(String brandToSearch){
		return repository.findByBrand(brandToSearch);
	}
	
	

}
