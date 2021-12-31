package com.softhouse.productcatalog.controller;

import com.softhouse.productcatalog.model.Product;
import com.softhouse.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Long id) {
        return productRepository.findById(id);
    }



}

/*

https://github.com/AndrehAguiar/microsservicos-api/blob/main/product-catalog/src/main/java/one/digital/innovation/productcatalog/controller/ProductController.java

http://localhost:9200/

 */