package com.exemple.latihanJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.latihanJpa.entity.Product;
import com.exemple.latihanJpa.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/addProduk")
	public Product addProduct (@RequestBody Product product) {
		return productService.saveProduct(product);
	}
}