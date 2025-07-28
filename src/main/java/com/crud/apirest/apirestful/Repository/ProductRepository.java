package com.crud.apirest.apirestful.Repository;

import com.crud.apirest.apirestful.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}