/*
 * UTF-8
 */
package com.ajcf.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ajcf.product.model.Product;
import com.ajcf.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@RequestMapping(method = RequestMethod.POST, path = "product", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> create(@RequestBody(required = true) Product product) {
		Product createdProduct = service.save(product);
		return new ResponseEntity<Product>(createdProduct, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, path = "product/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> read(@PathVariable(name = "id", required = true) Long id) {
		Product product = service.get(id);
		if (product == null) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Product>(product, HttpStatus.FOUND);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "product", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> update(@RequestBody(required = true) Product product) {
		Product updatedProduct = service.update(product);
		if (updatedProduct == null) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Product>(updatedProduct, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "product/{id}")
	public ResponseEntity delete(@PathVariable(name = "id", required = true) Long id) {
		service.delete(id);
		return new ResponseEntity<Product>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, path = "product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> list() {
		return new ResponseEntity<List<Product>>(service.getAll(), HttpStatus.OK);
	}
}