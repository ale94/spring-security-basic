package ar.com.ale94.spring_security_basic.service;

import ar.com.ale94.spring_security_basic.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<ProductEntity> getAllProducts();

    ProductEntity getProductById(Long id);

    ProductEntity createProduct(ProductEntity product);

    ProductEntity updateProduct(Long id, ProductEntity product);

    void deleteProduct(Long id);
}
