package com.ecommerce.electronicscenter.services;

import com.ecommerce.electronicscenter.models.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    ProductResponse getProductById(Integer productId);
    Page<ProductResponse> getProducts(Pageable pageable, Integer brandId, Integer typeId, String keyword);
}
