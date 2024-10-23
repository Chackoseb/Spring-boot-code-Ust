package com.ust.client.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.client.ifaces.ProductFeignInterface;
import com.ust.client.model.Product;

@RestController
@RequestMapping("/client")
public class FeignClient {
	
	@Autowired
	private ProductFeignInterface feignclient;
	
	@GetMapping("/products")
	public List<Product> getAll(){
		return feignclient.getAllProducts();
	}
	
	@GetMapping("/prodid/{id}")
	public Product getById(@PathVariable long id) {
		return feignclient.getOneProduct(id);
	}
	
	@GetMapping("/brandname/{brand}")
	public List<Product> getByBrand(@PathVariable String brand){
		return feignclient.getAllByBrand(brand);
	}
	
	@PostMapping("/addOneProduct")
	public Product addAProduct(@RequestBody Product product){
		return feignclient.addProduct(product);
	}

}
