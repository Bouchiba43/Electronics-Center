package com.ecommerce.electronicscenter.repositories;

import com.ecommerce.electronicscenter.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    Page<Product> findAll(Specification<Product> spec, Pageable pageable);
    Specification<Product> findByNameContaining(String Keyword);
    Specification<Product> findByBrandId(String brandId);
    Specification<Product> findByTypeId(String typeId);
    Specification<Product> findByBrandIdAndTypeId(String brandId, String typeId);
}
