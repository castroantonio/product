/*
 * UTF-8
 */
package com.ajcf.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajcf.product.model.Product;
import com.ajcf.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public Product save(Product product) {
		return repository.save(product);
	}

	public Product get(Long id) {
		return repository.getOne(id);
	}

	public Product update(Product product) {
		return repository.save(product);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public List<Product> getAll() {
		return repository.findAll();
	}
}