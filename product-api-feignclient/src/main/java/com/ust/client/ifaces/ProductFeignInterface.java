package com.ust.client.ifaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ust.client.model.Product;

@FeignClient(value = "ProductFeignClient", url = "http://localhost:8090/product/api1.0")
public interface ProductFeignInterface {

	@GetMapping("/productsinfo")
	public List<Product> getAllProducts();
	
	@GetMapping("/product/{id}")
	public Product getOneProduct(@PathVariable long id);
	
	@GetMapping("/product/brand/{brand}")
	public List<Product> getAllByBrand(@PathVariable String brand);
	
	@GetMapping("/addProduct")
	public Product addProduct(@RequestBody Product product);
	

}
