package com.ust.security.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.security.model.Product;
import com.ust.security.service.ProductService;



@RestController //controller + responsebody 
@RequestMapping("product/api1.0") //root of resource/ controller
public class ProductController {

	@Autowired
	private ProductService service;
	
	Logger logger = Logger.getLogger("ProductController.class");
	
	@GetMapping(value ="/productsinfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> displayProducts(){
		return null;
	}
	
	
	@GetMapping(value= "/product/{id}")
	public ResponseEntity<Product> getById(@PathVariable long id){
		return null;
	}
	
	@GetMapping(value= "/product/brand/{brand}")
	public ResponseEntity<Product> getByBrand(@PathVariable String brand){
		return null;
	}
	
	@PostMapping(value="/addProduct",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		Product savedProduct = service.addProduct(product);
		logger.info("Persisted Product " + savedProduct);
		return ResponseEntity.status(201).body(savedProduct);
	}
	
	
	@PutMapping(value="/modify", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> updateProduct(@RequestBody Product product){
		return null;
	}
	
	@DeleteMapping(value="delete/{id}")
	public void deleteProduct(@PathVariable long id) {
	}
}
