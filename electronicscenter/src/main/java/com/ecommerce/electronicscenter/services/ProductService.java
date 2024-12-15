package com.ecommerce.electronicscenter.services;

import com.ecommerce.electronicscenter.models.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse getProductById(Integer productId);
    List<ProductResponse> getProducts();
}
