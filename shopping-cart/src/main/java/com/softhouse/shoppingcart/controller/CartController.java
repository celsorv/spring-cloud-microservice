package com.softhouse.shoppingcart.controller;

import com.softhouse.shoppingcart.model.Cart;
import com.softhouse.shoppingcart.model.Item;
import com.softhouse.shoppingcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @PostMapping("/{id}")
    public Cart addItem(@PathVariable Long id, @RequestBody Item item) {

        Cart cart = cartRepository.findById(id).orElse(new Cart(id));
        cart.getItems().add(item);

        return cartRepository.save(cart);
    }

    @GetMapping("/{id}")
    public Optional<Cart> findById(@PathVariable Long id) {
        return cartRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void clear(@PathVariable Long id) {
        cartRepository.deleteById(id);
    }

}

// json para post:
// ---------------------
// {
//     "id": 1
//     "productId": 29,
//     "amount": 10
// }
// ---------------------
