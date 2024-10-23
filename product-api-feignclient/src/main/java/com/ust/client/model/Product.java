package com.ust.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

	private long id;
	private String brand;
	private String description;
	private int qty;
	private int price;
	
}
