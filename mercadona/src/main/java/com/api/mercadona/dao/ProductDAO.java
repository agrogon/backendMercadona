package com.api.mercadona.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.mercadona.model.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long>{

}