package ar.com.ale94.spring_security_basic.repository;

import ar.com.ale94.spring_security_basic.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
