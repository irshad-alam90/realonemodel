package com.realone.realonemodel.repository.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.realone.realonemodel.model.products.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
