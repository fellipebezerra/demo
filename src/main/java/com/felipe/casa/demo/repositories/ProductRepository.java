package com.felipe.casa.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.casa.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
