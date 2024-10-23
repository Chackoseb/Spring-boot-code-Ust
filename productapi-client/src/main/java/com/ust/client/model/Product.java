package com.ust.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//import jakarta.persistence.Entity;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter 
@Setter
@ToString
//@Entity
public class Product {

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String brand;
	private String description;
	private int qty;
	private int price;
	
}
