package com.flipcart.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.flipcart.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}


