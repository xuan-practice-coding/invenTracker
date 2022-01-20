package com.xuan.invertracker.service;

import java.util.List;

import com.xuan.invertracker.domain.Product;
import com.xuan.invertracker.productRepository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    public List<Product> listAll() {
        return productRepo.findAll();
    }

    public void save(Product product) {
        productRepo.save(product);
    }

    public Product get(long id) {
        return productRepo.findById(id).get();
    }

    public void delete(long id) {
        productRepo.deleteById(id);
    }

} // end class
