package com.softhouse.productcatalog.repository;

import com.softhouse.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}