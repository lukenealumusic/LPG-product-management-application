package com.lukeneal.api.repository;

import com.lukeneal.api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {

    @Query("select distinct p from Product p")
    List<Product> getAllProducts();
}
