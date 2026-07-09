package com.eclipse.ecom_proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eclipse.ecom_proj.model.Product;
import com.eclipse.ecom_proj.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public List<Product> getAllProducts(){
		return repo.findAll();
	}
}
