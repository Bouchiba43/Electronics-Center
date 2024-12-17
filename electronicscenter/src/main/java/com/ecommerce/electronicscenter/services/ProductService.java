package com.ecommerce.electronicscenter.services;

import com.ecommerce.electronicscenter.models.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    ProductResponse getProductById(String productId);
    Page<ProductResponse> getProducts(Pageable pageable, String brandId, String typeId, String keyword);
}
