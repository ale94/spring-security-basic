package ar.com.ale94.spring_security_basic.service;

import ar.com.ale94.spring_security_basic.entity.ProductEntity;
import ar.com.ale94.spring_security_basic.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    @Override
    public List<ProductEntity> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public ProductEntity getProductById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        return repository.save(product);
    }

    @Override
    public ProductEntity updateProduct(Long id, ProductEntity product) {
        var productToUpdate = repository.findById(id).orElseThrow();
        productToUpdate.setName(product.getName());
        productToUpdate.setDescription(product.getDescription());
        productToUpdate.setPrice(product.getPrice());
        return repository.save(productToUpdate);
    }

    @Override
    public void deleteProduct(Long id) {
        var productToDelete = repository.findById(id).orElseThrow();
        repository.delete(productToDelete);
    }
}
