package com.softhouse.shoppingcart.repository;

import com.softhouse.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {

}
