package com.firstapp.dbconn.repository;

import com.firstapp.dbconn.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}