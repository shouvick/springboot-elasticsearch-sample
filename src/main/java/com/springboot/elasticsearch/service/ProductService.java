package com.springboot.elasticsearch.service;

import com.springboot.elasticsearch.document.Product;
import com.springboot.elasticsearch.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void save(Product product) {
        Product p = new Product();
        p.setId(product.getId());
        p.setName(product.getName());
        productRepository.save(p);
    }

    public Product findById(String id) {
        return productRepository.findById(id).orElse(null);
    }

}
