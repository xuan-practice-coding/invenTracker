package com.xuan.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xuan.inventory.domain.Product;
@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
