package com.springboot.elasticsearch.repository;


import com.springboot.elasticsearch.document.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {
}
