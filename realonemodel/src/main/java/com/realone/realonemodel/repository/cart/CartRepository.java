package com.realone.realonemodel.repository.cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.realone.realonemodel.model.cart.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

}
