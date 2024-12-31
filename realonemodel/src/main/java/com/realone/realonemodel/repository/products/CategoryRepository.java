package com.realone.realonemodel.repository.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.realone.realonemodel.model.products.Category;


@Service
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
