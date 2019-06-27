/*
 * UTF-8
 */
package com.ajcf.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajcf.product.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
